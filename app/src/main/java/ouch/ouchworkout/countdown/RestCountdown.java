package ouch.ouchworkout.countdown;

import android.app.Activity;

import ouch.ouchworkout.R;
import ouch.ouchworkout.Workout;

public class RestCountdown extends AbstractCountdown {

    public RestCountdown(Activity pAct, long pTime) {
        super(pAct, pTime, R.drawable.rest, R.raw.rest_beep);
    }

    @Override
    public void onFinish() {
        countdownField.setText("000");
        Workout.getWorkout().startExercise();
    }
}
