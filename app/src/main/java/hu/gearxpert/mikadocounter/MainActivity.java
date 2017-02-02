package hu.gearxpert.mikadocounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scorePlayer1 = 0;
    int scorePlayer2 = 0;
    int maxStickNumber = 41;
    int totalSticks = maxStickNumber;

    /**sets all strings*/
    String displayTotalSticksText = "Total sticks remaining: ";
    String MikadoButtonText = "MIKADO - 20 PTS";
    String MandarinButtonText = "MANDARIN - 10 PTS";
    String BonzenButtonText = "BONZEN - 5 PTS";
    String SamuraiButtonText = "SAMURAI - 3 PTS";
    String KuliButtonText = "KULI - 2 PTS";
    /**initializes values*/
    int MikadoNumberOfSticks = 1;
    int MikadoQuantityOfSticksP1 = 0;
    int MikadoQuantityOfSticksP2 = 0;
    int MandarinNumberOfSticks = 5;
    int MandarinQuantityOfSticksP1 = 0;
    int MandarinQuantityOfSticksP2 = 0;
    int BonzenNumberOfSticks = 5;
    int BonzenQuantityOfSticksP1 = 0;
    int BonzenQuantityOfSticksP2 = 0;
    int SamuraiNumberOfSticks = 15;
    int SamuraiQuantityOfSticksP1 = 0;
    int SamuraiQuantityOfSticksP2 = 0;
    int KuliNumberOfSticks = 15;
    int KuliQuantityOfSticksP1 = 0;
    int KuliQuantityOfSticksP2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**displays the initial value for the remaining sticks*/
        displayTotalStickRemaining(displayTotalSticksText + totalSticks);
    }

    /**
     * Value of the stick is added to the actual score IF there are remaining sticks
     */

    public void P1PushButton(int pointsPerStick)
    {
        if (totalSticks > 0) {
                scorePlayer1 = scorePlayer1 + pointsPerStick;
                displayForPlayer1(scorePlayer1);
        }
    }

    public void P2PushButton(int pointsPerStick)
    {
        if (totalSticks > 0) {
            scorePlayer2 = scorePlayer2 + pointsPerStick;
            displayForPlayer2(scorePlayer2);
        }
    }

    /**
     *  Mikado - Increase the score for Player 1 by 20 points
     */
    public void TwentyToP1 (View view) {
        if ((MikadoQuantityOfSticksP1 + MikadoQuantityOfSticksP2) < MikadoNumberOfSticks) {
            MikadoQuantityOfSticksP1 = MikadoQuantityOfSticksP1 + 1;
            P1PushButton(20);
            AnyStickButtonPushed();
            }
        //**With this we display the quantity of sticks the player has from one type / the maximum quantity which is totally available from that type of stick in the game*/
        Button btn = (Button) view;
        btn.setText(MikadoButtonText + "\n" + MikadoQuantityOfSticksP1 + " / "+MikadoNumberOfSticks);
    }

    /**
     * Mandarin - Increase the score for Player 1 by 10 points
     */
    public void TenToP1 (View view) {
        if ((MandarinQuantityOfSticksP1 + MandarinQuantityOfSticksP2) < MandarinNumberOfSticks) {
            MandarinQuantityOfSticksP1 = MandarinQuantityOfSticksP1 + 1;
            P1PushButton(10);
            AnyStickButtonPushed();
        }
        Button btn = (Button) view;
        btn.setText(MandarinButtonText + "\n" + MandarinQuantityOfSticksP1 + " / "+MandarinNumberOfSticks);
    }

    /**
     * Bonzen - Increase the score for Player 1 by 5 points
     */
    public void FiveToP1 (View view) {
        if ((BonzenQuantityOfSticksP1 + BonzenQuantityOfSticksP2) < BonzenNumberOfSticks) {
            BonzenQuantityOfSticksP1 = BonzenQuantityOfSticksP1 + 1;
            P1PushButton(5);
            AnyStickButtonPushed();
        }
        Button btn = (Button) view;
        btn.setText(BonzenButtonText + "\n" + BonzenQuantityOfSticksP1 + " / "+BonzenNumberOfSticks);
    }

    /**
     * Samurai - Increase the score for Player 1 by 3 points
     */
    public void ThreeToP1 (View view) {
        if ((SamuraiQuantityOfSticksP1 + SamuraiQuantityOfSticksP2) < SamuraiNumberOfSticks) {
            SamuraiQuantityOfSticksP1 = SamuraiQuantityOfSticksP1 + 1;
            P1PushButton(3);
            AnyStickButtonPushed();
        }
        Button btn = (Button) view;
        btn.setText(SamuraiButtonText + "\n" + SamuraiQuantityOfSticksP1 + " / "+SamuraiNumberOfSticks);
    }

    /**
     * Kuli - Increase the score for Player 1 by 2 points
     */
    public void TwoToP1 (View view) {
        if ((KuliQuantityOfSticksP1 + KuliQuantityOfSticksP2) < KuliNumberOfSticks) {
            KuliQuantityOfSticksP1 = KuliQuantityOfSticksP1 + 1;
            P1PushButton(2);
            AnyStickButtonPushed();
        }
        Button btn = (Button) view;
        btn.setText(KuliButtonText + "\n" + KuliQuantityOfSticksP1 + " / "+KuliNumberOfSticks);
    }

    /**
     *  Mikado - Increase the score for Player 2 by 20 points
     */
    public void TwentyToP2 (View view) {
        if ((MikadoQuantityOfSticksP1 + MikadoQuantityOfSticksP2) < MikadoNumberOfSticks) {
            MikadoQuantityOfSticksP2 = MikadoQuantityOfSticksP2 + 1;
            P2PushButton(20);
            AnyStickButtonPushed();
        }
        Button btn = (Button) view;
        btn.setText(MikadoButtonText + "\n" + MikadoQuantityOfSticksP2 + " / "+MikadoNumberOfSticks);
    }

    /**
     * Mandarin - Increase the score for Player 2 by 10 points
     */
    public void TenToP2 (View view) {
        if ((MandarinQuantityOfSticksP1 + MandarinQuantityOfSticksP2) < MandarinNumberOfSticks) {
            MandarinQuantityOfSticksP2 = MandarinQuantityOfSticksP2 + 1;
            P2PushButton(10);
            AnyStickButtonPushed();
        }
        Button btn = (Button) view;
        btn.setText(MandarinButtonText + "\n" + MandarinQuantityOfSticksP2 + " / "+MandarinNumberOfSticks);
    }

    /**
     * Bonzen - Increase the score for Player 2 by 5 points
     */
    public void FiveToP2 (View view) {
        if ((BonzenQuantityOfSticksP1 + BonzenQuantityOfSticksP2) < BonzenNumberOfSticks) {
            BonzenQuantityOfSticksP2 = BonzenQuantityOfSticksP2 + 1;
            P2PushButton(5);
            AnyStickButtonPushed();
        }
        Button btn = (Button) view;
        btn.setText(BonzenButtonText + "\n" + BonzenQuantityOfSticksP2 + " / "+BonzenNumberOfSticks);
    }

    /**
     * Samurai - Increase the score for Player 2 by 3 points
     */
    public void ThreeToP2 (View view) {
        if ((SamuraiQuantityOfSticksP1 + SamuraiQuantityOfSticksP2) < SamuraiNumberOfSticks) {
            SamuraiQuantityOfSticksP2 = SamuraiQuantityOfSticksP2 + 1;
            P2PushButton(3);
            AnyStickButtonPushed();
        }
        Button btn = (Button) view;
        btn.setText(SamuraiButtonText + "\n" + SamuraiQuantityOfSticksP2 + " / "+SamuraiNumberOfSticks);
    }

    /**
     * Kuli - Increase the score for Player 2 by 2 points
     */
    public void TwoToP2 (View view) {
        if ((KuliQuantityOfSticksP1 + KuliQuantityOfSticksP2) < KuliNumberOfSticks) {
            KuliQuantityOfSticksP2 = KuliQuantityOfSticksP2 + 1;
            P2PushButton(2);
            AnyStickButtonPushed();
        }
        Button btn = (Button) view;
        btn.setText(KuliButtonText + "\n" + KuliQuantityOfSticksP2 + " / "+KuliNumberOfSticks);
    }


    /**
     * Resets all scores for both Players to 0, displays the starting stick numbers
     */
    public void resetScore (View view) {
        scorePlayer1 = 0;
        scorePlayer2 = 0;
        totalSticks = maxStickNumber;
        MikadoQuantityOfSticksP1 = 0;
        MikadoQuantityOfSticksP2 = 0;
        MandarinQuantityOfSticksP1 = 0;
        MandarinQuantityOfSticksP2 = 0;
        BonzenQuantityOfSticksP1 = 0;
        BonzenQuantityOfSticksP2 = 0;
        SamuraiQuantityOfSticksP1 = 0;
        SamuraiQuantityOfSticksP2 = 0;
        KuliQuantityOfSticksP1 = 0;
        KuliQuantityOfSticksP2 = 0;
        displayForPlayer1(scorePlayer1);
        displayForPlayer2(scorePlayer2);
        displayTotalStickRemaining(displayTotalSticksText + totalSticks);

        displaySetButtonText(MikadoButtonText + "\n" + MikadoQuantityOfSticksP1 + " / "+MikadoNumberOfSticks, (Button) findViewById(R.id.mikadoP1));
        displaySetButtonText(MandarinButtonText + "\n" + MandarinQuantityOfSticksP1 + " / "+MandarinNumberOfSticks, (Button) findViewById(R.id.mandarinP1));
        displaySetButtonText(BonzenButtonText + "\n" + BonzenQuantityOfSticksP1 + " / "+BonzenNumberOfSticks, (Button) findViewById(R.id.bonzenP1));
        displaySetButtonText(SamuraiButtonText + "\n" + SamuraiQuantityOfSticksP1 + " / "+SamuraiNumberOfSticks, (Button) findViewById(R.id.samuraiP1));
        displaySetButtonText(KuliButtonText + "\n" + KuliQuantityOfSticksP1 + " / "+KuliNumberOfSticks, (Button) findViewById(R.id.kuliP1));
        displaySetButtonText(MikadoButtonText + "\n" + MikadoQuantityOfSticksP2 + " / "+MikadoNumberOfSticks, (Button) findViewById(R.id.mikadoP2));
        displaySetButtonText(MandarinButtonText + "\n" + MandarinQuantityOfSticksP2 + " / "+MandarinNumberOfSticks, (Button) findViewById(R.id.mandarinP2));
        displaySetButtonText(BonzenButtonText + "\n" + BonzenQuantityOfSticksP2 + " / "+BonzenNumberOfSticks, (Button) findViewById(R.id.bonzenP2));
        displaySetButtonText(SamuraiButtonText + "\n" + SamuraiQuantityOfSticksP2 + " / "+SamuraiNumberOfSticks, (Button) findViewById(R.id.samuraiP2));
        displaySetButtonText(KuliButtonText + "\n" + KuliQuantityOfSticksP2 + " / "+KuliNumberOfSticks, (Button) findViewById(R.id.kuliP2));
    }

    /**
     * Displays the score for Player 1
     */
    public void displayForPlayer1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_1_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the score for Player 2
     */
    public void displayForPlayer2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_2_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays number of sticks remaining
     */

    public void displayTotalStickRemaining(String score) {
        TextView scoreView = (TextView) findViewById(R.id.total_nr_sticks);
        scoreView.setText(String.valueOf(score));
    }


    public void displaySetButtonText(String text, Button button) {
        button.setText(text);
    }

    /**
     * AnyStickButtonPushed method: it reduced the quantity of remained stick till zero. When it is zero, it displays that the game is over.
     */

    public void AnyStickButtonPushed() {

        if (totalSticks > 0) {
            totalSticks = totalSticks - 1;
            /**we search for the TextView by ID, and display the text with the remaining stick value*/
            TextView scoreView = (TextView) findViewById(R.id.total_nr_sticks);
            scoreView.setText(String.valueOf(displayTotalSticksText + totalSticks));
        }

        if (totalSticks == 0) {
            /**we search for the TextView by ID, and display the text*/
            TextView scoreView = (TextView) findViewById(R.id.total_nr_sticks);
            scoreView.setText(String.valueOf("Game over! Reset to start a new game."));
        }
    }
}
