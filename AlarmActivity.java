package se.abilia.memoplanner.alarm;

import se.abilia.common.log.Logg;
import se.abilia.memoplanner.ActivityDetailsActivity;
import se.abilia.memoplanner.R;
import se.abilia.memoplanner.alarm.alarms.MultipleAlarmPlayer;
import se.abilia.memoplanner.base.StandardRootActivity;
import se.abilia.memoplanner.gui.WarningDialog.WarningCreator;
import se.abilia.memoplanner.widgets.alarm.AlarmCaption;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;

/**
 * Activity that displays alarms
 *
 */
public class AlarmActivity extends StandardRootActivity implements OnPageChangeListener {

	public static final String ALARM_TIME_EXTRA = "se.abilia.memoplanner.alarm.ALARM_TIME_EXTRA";

	private static final int CONFIRM_ACTIVITY = 12;
	private static final String ALARMS = "se.abilia.memoplanner.alarm.AlarmActivity.INSTANCE_STATE";


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
	}

	@Override
	protected void onNewIntent(Intent intent) {
		setIntent(intent);
		onNewAlarm();
	}

	@Override
	public void onResume() {
		super.onResume();
	}

	@Override
	protected void onPause() {
		super.onPause();
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {

	}

	@Override
	public void onPageScrollStateChanged(int arg0) {
	}

	@Override
	public void onPageScrolled(int arg0, float arg1, int arg2) {
	}

	@Override
	public void onPageSelected(int position) {
		update();
	}

	public void onNext(View view) {
	}

	public void onPrevious(View view) {
	}

	public void onClose(View view) {
	}

	public void onOk(View view) {
	
	}

	public void onConfirm(View view) {

	}

	public void onExtraAlarmClick(View view) {

	}

	private void onNewAlarm() {

	}

	private void setupPager() {

	}

	private void createAlarmProvider(Bundle savedInstanceState) {

	}

	private void findViews() {

	}

	private void update() {

	}

	private void updateCaption() {

	}

	private void updateNavigationButtons() {

	}

	private void hideNavigationButtons() {

	}

	private void showNavigationButtons() {


	}

}
