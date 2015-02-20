package kent.android.mem.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import kent.android.mem.R;
import kent.android.mem.challenge.Challenge;

/**
 * @author: Kent
 * Created on 2015-02-02.
 */
public class ChallengeActivity extends Activity {
	private Challenge challenge;
	private TableLayout tableLayout;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.challenge);
		challenge = (Challenge) getIntent().getSerializableExtra("challenge");
		tableLayout = (TableLayout) this.findViewById(R.id.challengeTableLayout);
		showMatrix();
	}

	private void showMatrix() {
		for (int i = 0; i < challenge.getLength(); i++) {
			TableRow row = new TableRow(this);
			for (int j = 0; j < challenge.getLength(); j++) {
				TextView cell = new TextView(this);
				cell.setText(challenge.getOriginal()[i][j]);
				row.addView(cell);
			}
			tableLayout.addView(row);
		}
	}
}
