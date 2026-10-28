package com.yalantis.ucrop;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.d0;
import androidx.annotation.l;
import androidx.annotation.o0;
import androidx.annotation.v;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.g;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.d;
import androidx.core.graphics.e;
import androidx.transition.AutoTransition;
import androidx.transition.Transition;
import androidx.transition.x;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.yalantis.ucrop.callback.BitmapCropCallback;
import com.yalantis.ucrop.model.AspectRatio;
import com.yalantis.ucrop.statusbar.ImmersiveManager;
import com.yalantis.ucrop.util.FileUtils;
import com.yalantis.ucrop.util.SelectedStateListDrawable;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.OverlayView;
import com.yalantis.ucrop.view.TransformImageView;
import com.yalantis.ucrop.view.UCropView;
import com.yalantis.ucrop.view.widget.AspectRatioTextView;
import com.yalantis.ucrop.view.widget.HorizontalProgressWheelView;
import e.a;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes7.dex */
public class UCropActivity extends AppCompatActivity {
    public static final int ALL = 3;
    private static final long CONTROLS_ANIMATION_DURATION = 50;
    public static final int DEFAULT_COMPRESS_QUALITY = 90;
    public static final int NONE = 0;
    public static final int ROTATE = 2;
    private static final int ROTATE_WIDGET_SENSITIVITY_COEFFICIENT = 42;
    public static final int SCALE = 1;
    private static final int SCALE_WIDGET_SENSITIVITY_COEFFICIENT = 15000;
    private static final int TABS_COUNT = 3;
    private boolean isForbidCropGifWebp;
    private boolean isUseCustomBitmap;
    private int mActiveControlsWidgetColor;
    private View mBlockingView;
    private Transition mControlsTransition;
    private GestureCropImageView mGestureCropImageView;
    private ViewGroup mLayoutAspectRatio;
    private ViewGroup mLayoutRotate;
    private ViewGroup mLayoutScale;
    private int mLogoColor;
    private OverlayView mOverlayView;

    @l
    private int mRootViewBackgroundColor;
    private boolean mShowBottomControls;
    private int mStatusBarColor;
    private TextView mTextViewRotateAngle;
    private TextView mTextViewScalePercent;

    @v
    private int mToolbarCancelDrawable;
    private int mToolbarColor;

    @v
    private int mToolbarCropDrawable;
    private String mToolbarTitle;
    private int mToolbarTitleSize;
    private int mToolbarWidgetColor;
    private UCropView mUCropView;
    private ViewGroup mWrapperStateAspectRatio;
    private ViewGroup mWrapperStateRotate;
    private ViewGroup mWrapperStateScale;
    private static final String TAG = ProtectedSandApp.s("幔\u0001");
    public static final Bitmap.CompressFormat DEFAULT_COMPRESS_FORMAT = Bitmap.CompressFormat.JPEG;
    private boolean mShowLoader = true;
    private List<ViewGroup> mCropAspectRatioViews = new ArrayList();
    private Bitmap.CompressFormat mCompressFormat = DEFAULT_COMPRESS_FORMAT;
    private int mCompressQuality = 90;
    private int[] mAllowedGestures = {1, 2, 3};
    private TransformImageView.TransformImageListener mImageListener = new TransformImageView.TransformImageListener() { // from class: com.yalantis.ucrop.UCropActivity.1
        @Override // com.yalantis.ucrop.view.TransformImageView.TransformImageListener
        public void onLoadComplete() {
            UCropActivity.this.mUCropView.animate().alpha(1.0f).setDuration(300L).setInterpolator(new AccelerateInterpolator());
            UCropActivity.this.mBlockingView.setClickable(false);
            if (UCropActivity.this.getIntent().getBooleanExtra(ProtectedSandApp.s("幒\u0001"), false)) {
                String mimeTypeFromMediaContentUri = FileUtils.getMimeTypeFromMediaContentUri(UCropActivity.this, (Uri) UCropActivity.this.getIntent().getParcelableExtra(ProtectedSandApp.s("幓\u0001")));
                if (FileUtils.isGif(mimeTypeFromMediaContentUri) || FileUtils.isWebp(mimeTypeFromMediaContentUri)) {
                    UCropActivity.this.mBlockingView.setClickable(true);
                }
            }
            UCropActivity.this.mShowLoader = false;
            UCropActivity.this.supportInvalidateOptionsMenu();
        }

        @Override // com.yalantis.ucrop.view.TransformImageView.TransformImageListener
        public void onLoadFailure(@o0 Exception exc) {
            UCropActivity.this.setResultError(exc);
            UCropActivity.this.finish();
        }

        @Override // com.yalantis.ucrop.view.TransformImageView.TransformImageListener
        public void onRotate(float f4) {
            UCropActivity.this.setAngleText(f4);
        }

        @Override // com.yalantis.ucrop.view.TransformImageView.TransformImageListener
        public void onScale(float f4) {
            UCropActivity.this.setScaleText(f4);
        }
    };
    private final View.OnClickListener mStateClickListener = new View.OnClickListener() { // from class: com.yalantis.ucrop.UCropActivity.7
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.isSelected()) {
                return;
            }
            UCropActivity.this.setWidgetState(view.getId());
        }
    };

    @Retention(RetentionPolicy.SOURCE)
    public @interface GestureTypes {
    }

    static {
        g.Y(true);
    }

    private void addBlockingView() {
        if (this.mBlockingView == null) {
            this.mBlockingView = new View(this);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(3, R.id.toolbar);
            this.mBlockingView.setLayoutParams(layoutParams);
            this.mBlockingView.setClickable(true);
        }
        ((RelativeLayout) findViewById(R.id.ucrop_photobox)).addView(this.mBlockingView);
    }

    private void changeSelectedTab(int i4) {
        x.b((ViewGroup) findViewById(R.id.ucrop_photobox), this.mControlsTransition);
        this.mWrapperStateScale.findViewById(R.id.text_view_scale).setVisibility(i4 == R.id.state_scale ? 0 : 8);
        this.mWrapperStateAspectRatio.findViewById(R.id.text_view_crop).setVisibility(i4 == R.id.state_aspect_ratio ? 0 : 8);
        this.mWrapperStateRotate.findViewById(R.id.text_view_rotate).setVisibility(i4 == R.id.state_rotate ? 0 : 8);
    }

    private void immersive() {
        Intent intent = getIntent();
        boolean booleanExtra = intent.getBooleanExtra(ProtectedSandApp.s("幕\u0001"), false);
        int intExtra = intent.getIntExtra(ProtectedSandApp.s("幖\u0001"), d.getColor(this, R.color.ucrop_color_statusbar));
        this.mStatusBarColor = intExtra;
        ImmersiveManager.immersiveAboveAPI23(this, intExtra, intExtra, booleanExtra);
    }

    private void initiateRootViews() {
        UCropView uCropView = (UCropView) findViewById(R.id.ucrop);
        this.mUCropView = uCropView;
        this.mGestureCropImageView = uCropView.getCropImageView();
        this.mOverlayView = this.mUCropView.getOverlayView();
        this.mGestureCropImageView.setTransformImageListener(this.mImageListener);
        ((ImageView) findViewById(R.id.image_view_logo)).setColorFilter(this.mLogoColor, PorterDuff.Mode.SRC_ATOP);
        int i4 = R.id.ucrop_frame;
        findViewById(i4).setBackgroundColor(this.mRootViewBackgroundColor);
        if (this.mShowBottomControls) {
            return;
        }
        ((RelativeLayout.LayoutParams) findViewById(i4).getLayoutParams()).bottomMargin = 0;
        findViewById(i4).requestLayout();
    }

    private void processOptions(@o0 Intent intent) {
        String stringExtra = intent.getStringExtra(ProtectedSandApp.s("幗\u0001"));
        Bitmap.CompressFormat valueOf = !TextUtils.isEmpty(stringExtra) ? Bitmap.CompressFormat.valueOf(stringExtra) : null;
        if (valueOf == null) {
            valueOf = DEFAULT_COMPRESS_FORMAT;
        }
        this.mCompressFormat = valueOf;
        this.mCompressQuality = intent.getIntExtra(ProtectedSandApp.s("幘\u0001"), 90);
        int[] intArrayExtra = intent.getIntArrayExtra(ProtectedSandApp.s("幙\u0001"));
        if (intArrayExtra != null && intArrayExtra.length == 3) {
            this.mAllowedGestures = intArrayExtra;
        }
        this.isUseCustomBitmap = intent.getBooleanExtra(ProtectedSandApp.s("幚\u0001"), false);
        this.mGestureCropImageView.setMaxBitmapSize(intent.getIntExtra(ProtectedSandApp.s("幛\u0001"), 0));
        this.mGestureCropImageView.setMaxScaleMultiplier(intent.getFloatExtra(ProtectedSandApp.s("幜\u0001"), 10.0f));
        this.mGestureCropImageView.setImageToWrapCropBoundsAnimDuration(intent.getIntExtra(ProtectedSandApp.s("幝\u0001"), 500));
        this.mOverlayView.setFreestyleCropEnabled(intent.getBooleanExtra(ProtectedSandApp.s("幞\u0001"), false));
        this.mOverlayView.setDragSmoothToCenter(intent.getBooleanExtra(ProtectedSandApp.s("幟\u0001"), false));
        OverlayView overlayView = this.mOverlayView;
        Resources resources = getResources();
        int i4 = R.color.ucrop_color_default_dimmed;
        overlayView.setDimmedColor(intent.getIntExtra(ProtectedSandApp.s("幠\u0001"), resources.getColor(i4)));
        this.mOverlayView.setCircleStrokeColor(intent.getIntExtra(ProtectedSandApp.s("幡\u0001"), getResources().getColor(i4)));
        this.mOverlayView.setCircleDimmedLayer(intent.getBooleanExtra(ProtectedSandApp.s("幢\u0001"), false));
        this.mOverlayView.setShowCropFrame(intent.getBooleanExtra(ProtectedSandApp.s("幣\u0001"), true));
        this.mOverlayView.setCropFrameColor(intent.getIntExtra(ProtectedSandApp.s("幤\u0001"), getResources().getColor(R.color.ucrop_color_default_crop_frame)));
        this.mOverlayView.setCropFrameStrokeWidth(intent.getIntExtra(ProtectedSandApp.s("幥\u0001"), getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_frame_stoke_width)));
        this.mOverlayView.setShowCropGrid(intent.getBooleanExtra(ProtectedSandApp.s("幦\u0001"), true));
        this.mOverlayView.setCropGridRowCount(intent.getIntExtra(ProtectedSandApp.s("幧\u0001"), 2));
        this.mOverlayView.setCropGridColumnCount(intent.getIntExtra(ProtectedSandApp.s("幨\u0001"), 2));
        this.mOverlayView.setCropGridColor(intent.getIntExtra(ProtectedSandApp.s("幩\u0001"), getResources().getColor(R.color.ucrop_color_default_crop_grid)));
        OverlayView overlayView2 = this.mOverlayView;
        Resources resources2 = getResources();
        int i5 = R.dimen.ucrop_default_crop_grid_stoke_width;
        overlayView2.setCropGridStrokeWidth(intent.getIntExtra(ProtectedSandApp.s("幪\u0001"), resources2.getDimensionPixelSize(i5)));
        this.mOverlayView.setDimmedStrokeWidth(intent.getIntExtra(ProtectedSandApp.s("幫\u0001"), getResources().getDimensionPixelSize(i5)));
        float floatExtra = intent.getFloatExtra(ProtectedSandApp.s("幬\u0001"), -1.0f);
        float floatExtra2 = intent.getFloatExtra(ProtectedSandApp.s("幭\u0001"), -1.0f);
        int intExtra = intent.getIntExtra(ProtectedSandApp.s("幮\u0001"), 0);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(ProtectedSandApp.s("幯\u0001"));
        if (floatExtra >= 0.0f && floatExtra2 >= 0.0f) {
            ViewGroup viewGroup = this.mWrapperStateAspectRatio;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            float f4 = floatExtra / floatExtra2;
            this.mGestureCropImageView.setTargetAspectRatio(Float.isNaN(f4) ? 0.0f : f4);
        } else if (parcelableArrayListExtra == null || intExtra >= parcelableArrayListExtra.size()) {
            this.mGestureCropImageView.setTargetAspectRatio(0.0f);
        } else {
            float aspectRatioX = ((AspectRatio) parcelableArrayListExtra.get(intExtra)).getAspectRatioX() / ((AspectRatio) parcelableArrayListExtra.get(intExtra)).getAspectRatioY();
            this.mGestureCropImageView.setTargetAspectRatio(Float.isNaN(aspectRatioX) ? 0.0f : aspectRatioX);
        }
        int intExtra2 = intent.getIntExtra(ProtectedSandApp.s("幰\u0001"), 0);
        int intExtra3 = intent.getIntExtra(ProtectedSandApp.s("幱\u0001"), 0);
        if (intExtra2 <= 0 || intExtra3 <= 0) {
            return;
        }
        this.mGestureCropImageView.setMaxResultImageSizeX(intExtra2);
        this.mGestureCropImageView.setMaxResultImageSizeY(intExtra3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetRotation() {
        GestureCropImageView gestureCropImageView = this.mGestureCropImageView;
        gestureCropImageView.postRotate(-gestureCropImageView.getCurrentAngle());
        this.mGestureCropImageView.setImageToWrapCropBounds();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rotateByAngle(int i4) {
        this.mGestureCropImageView.postRotate(i4);
        this.mGestureCropImageView.setImageToWrapCropBounds();
    }

    private void setAllowedGestures(int i4) {
        GestureCropImageView gestureCropImageView = this.mGestureCropImageView;
        int i5 = this.mAllowedGestures[i4];
        gestureCropImageView.setScaleEnabled(i5 == 3 || i5 == 1);
        GestureCropImageView gestureCropImageView2 = this.mGestureCropImageView;
        int i6 = this.mAllowedGestures[i4];
        gestureCropImageView2.setRotateEnabled(i6 == 3 || i6 == 2);
        this.mGestureCropImageView.setGestureEnabled(getIntent().getBooleanExtra(ProtectedSandApp.s("干\u0001"), true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAngleText(float f4) {
        TextView textView = this.mTextViewRotateAngle;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), ProtectedSandApp.s("平\u0001"), Float.valueOf(f4)));
        }
    }

    private void setAngleTextColor(int i4) {
        TextView textView = this.mTextViewRotateAngle;
        if (textView != null) {
            textView.setTextColor(i4);
        }
    }

    private void setImageData(@o0 Intent intent) {
        Uri uri = (Uri) intent.getParcelableExtra(ProtectedSandApp.s("年\u0001"));
        Uri uri2 = (Uri) intent.getParcelableExtra(ProtectedSandApp.s("幵\u0001"));
        processOptions(intent);
        if (uri == null || uri2 == null) {
            setResultError(new NullPointerException(getString(R.string.ucrop_error_input_data_is_absent)));
            finish();
            return;
        }
        try {
            String stringExtra = getIntent().getStringExtra(ProtectedSandApp.s("并\u0001"));
            if (!TextUtils.isEmpty(stringExtra) && ProtectedSandApp.s("幷\u0001").equalsIgnoreCase(uri2.getScheme())) {
                uri2 = Uri.fromFile(new File(stringExtra, new File(uri2.getPath()).getName()));
            }
            this.mGestureCropImageView.setImageUri(uri, FileUtils.replaceOutputUri(this, this.isForbidCropGifWebp, uri, uri2), this.isUseCustomBitmap);
        } catch (Exception e4) {
            setResultError(e4);
            finish();
        }
    }

    private void setInitialState() {
        if (!this.mShowBottomControls) {
            setAllowedGestures(0);
        } else if (this.mWrapperStateAspectRatio.getVisibility() == 0) {
            setWidgetState(R.id.state_aspect_ratio);
        } else {
            setWidgetState(R.id.state_scale);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScaleText(float f4) {
        TextView textView = this.mTextViewScalePercent;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), ProtectedSandApp.s("幸\u0001"), Integer.valueOf((int) (f4 * 100.0f))));
        }
    }

    private void setScaleTextColor(int i4) {
        TextView textView = this.mTextViewScalePercent;
        if (textView != null) {
            textView.setTextColor(i4);
        }
    }

    @TargetApi(21)
    private void setStatusBarColor(@l int i4) {
        Window window = getWindow();
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWidgetState(@d0 int i4) {
        if (this.mShowBottomControls) {
            ViewGroup viewGroup = this.mWrapperStateAspectRatio;
            int i5 = R.id.state_aspect_ratio;
            viewGroup.setSelected(i4 == i5);
            ViewGroup viewGroup2 = this.mWrapperStateRotate;
            int i6 = R.id.state_rotate;
            viewGroup2.setSelected(i4 == i6);
            ViewGroup viewGroup3 = this.mWrapperStateScale;
            int i7 = R.id.state_scale;
            viewGroup3.setSelected(i4 == i7);
            this.mLayoutAspectRatio.setVisibility(i4 == i5 ? 0 : 8);
            this.mLayoutRotate.setVisibility(i4 == i6 ? 0 : 8);
            this.mLayoutScale.setVisibility(i4 == i7 ? 0 : 8);
            changeSelectedTab(i4);
            if (i4 == i7) {
                setAllowedGestures(0);
            } else if (i4 == i6) {
                setAllowedGestures(1);
            } else {
                setAllowedGestures(2);
            }
        }
    }

    private void setupAppBar() {
        setStatusBarColor(this.mStatusBarColor);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setBackgroundColor(this.mToolbarColor);
        toolbar.d1(this.mToolbarWidgetColor);
        TextView textView = (TextView) toolbar.findViewById(R.id.toolbar_title);
        textView.setTextColor(this.mToolbarWidgetColor);
        textView.setText(this.mToolbarTitle);
        textView.setTextSize(this.mToolbarTitleSize);
        Drawable mutate = a.b(this, this.mToolbarCancelDrawable).mutate();
        mutate.setColorFilter(androidx.core.graphics.d.a(this.mToolbarWidgetColor, e.SRC_ATOP));
        toolbar.L0(mutate);
        setSupportActionBar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.d0(false);
        }
    }

    private void setupAspectRatioWidget(@o0 Intent intent) {
        int intExtra = intent.getIntExtra(ProtectedSandApp.s("幮\u0001"), 0);
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(ProtectedSandApp.s("幯\u0001"));
        if (parcelableArrayListExtra == null || parcelableArrayListExtra.isEmpty()) {
            parcelableArrayListExtra = new ArrayList();
            parcelableArrayListExtra.add(new AspectRatio(null, 1.0f, 1.0f));
            parcelableArrayListExtra.add(new AspectRatio(null, 3.0f, 4.0f));
            parcelableArrayListExtra.add(new AspectRatio(getString(R.string.ucrop_label_original).toUpperCase(), 0.0f, 0.0f));
            parcelableArrayListExtra.add(new AspectRatio(null, 3.0f, 2.0f));
            parcelableArrayListExtra.add(new AspectRatio(null, 16.0f, 9.0f));
            intExtra = 2;
        }
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout_aspect_ratio);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = 1.0f;
        Iterator it = parcelableArrayListExtra.iterator();
        while (it.hasNext()) {
            AspectRatio aspectRatio = (AspectRatio) it.next();
            FrameLayout frameLayout = (FrameLayout) getLayoutInflater().inflate(R.layout.ucrop_aspect_ratio, (ViewGroup) null);
            frameLayout.setLayoutParams(layoutParams);
            AspectRatioTextView aspectRatioTextView = (AspectRatioTextView) frameLayout.getChildAt(0);
            aspectRatioTextView.setActiveColor(this.mActiveControlsWidgetColor);
            aspectRatioTextView.setAspectRatio(aspectRatio);
            linearLayout.addView(frameLayout);
            this.mCropAspectRatioViews.add(frameLayout);
        }
        this.mCropAspectRatioViews.get(intExtra).setSelected(true);
        Iterator<ViewGroup> it2 = this.mCropAspectRatioViews.iterator();
        while (it2.hasNext()) {
            it2.next().setOnClickListener(new View.OnClickListener() { // from class: com.yalantis.ucrop.UCropActivity.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    UCropActivity.this.mGestureCropImageView.setTargetAspectRatio(((AspectRatioTextView) ((ViewGroup) view).getChildAt(0)).getAspectRatio(view.isSelected()));
                    UCropActivity.this.mGestureCropImageView.setImageToWrapCropBounds();
                    if (view.isSelected()) {
                        return;
                    }
                    for (ViewGroup viewGroup : UCropActivity.this.mCropAspectRatioViews) {
                        viewGroup.setSelected(viewGroup == view);
                    }
                }
            });
        }
    }

    private void setupRotateWidget() {
        this.mTextViewRotateAngle = (TextView) findViewById(R.id.text_view_rotate);
        int i4 = R.id.rotate_scroll_wheel;
        ((HorizontalProgressWheelView) findViewById(i4)).setScrollingListener(new HorizontalProgressWheelView.ScrollingListener() { // from class: com.yalantis.ucrop.UCropActivity.3
            @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.ScrollingListener
            public void onScroll(float f4, float f5) {
                UCropActivity.this.mGestureCropImageView.postRotate(f4 / 42.0f);
            }

            @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.ScrollingListener
            public void onScrollEnd() {
                UCropActivity.this.mGestureCropImageView.setImageToWrapCropBounds();
            }

            @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.ScrollingListener
            public void onScrollStart() {
                UCropActivity.this.mGestureCropImageView.cancelAllAnimations();
            }
        });
        ((HorizontalProgressWheelView) findViewById(i4)).setMiddleLineColor(this.mActiveControlsWidgetColor);
        findViewById(R.id.wrapper_reset_rotate).setOnClickListener(new View.OnClickListener() { // from class: com.yalantis.ucrop.UCropActivity.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                UCropActivity.this.resetRotation();
            }
        });
        findViewById(R.id.wrapper_rotate_by_angle).setOnClickListener(new View.OnClickListener() { // from class: com.yalantis.ucrop.UCropActivity.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                UCropActivity.this.rotateByAngle(90);
            }
        });
        setAngleTextColor(this.mActiveControlsWidgetColor);
    }

    private void setupScaleWidget() {
        this.mTextViewScalePercent = (TextView) findViewById(R.id.text_view_scale);
        int i4 = R.id.scale_scroll_wheel;
        ((HorizontalProgressWheelView) findViewById(i4)).setScrollingListener(new HorizontalProgressWheelView.ScrollingListener() { // from class: com.yalantis.ucrop.UCropActivity.6
            @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.ScrollingListener
            public void onScroll(float f4, float f5) {
                if (f4 > 0.0f) {
                    UCropActivity.this.mGestureCropImageView.zoomInImage((((UCropActivity.this.mGestureCropImageView.getMaxScale() - UCropActivity.this.mGestureCropImageView.getMinScale()) / 15000.0f) * f4) + UCropActivity.this.mGestureCropImageView.getCurrentScale());
                } else {
                    UCropActivity.this.mGestureCropImageView.zoomOutImage((((UCropActivity.this.mGestureCropImageView.getMaxScale() - UCropActivity.this.mGestureCropImageView.getMinScale()) / 15000.0f) * f4) + UCropActivity.this.mGestureCropImageView.getCurrentScale());
                }
            }

            @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.ScrollingListener
            public void onScrollEnd() {
                UCropActivity.this.mGestureCropImageView.setImageToWrapCropBounds();
            }

            @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.ScrollingListener
            public void onScrollStart() {
                UCropActivity.this.mGestureCropImageView.cancelAllAnimations();
            }
        });
        ((HorizontalProgressWheelView) findViewById(i4)).setMiddleLineColor(this.mActiveControlsWidgetColor);
        setScaleTextColor(this.mActiveControlsWidgetColor);
    }

    private void setupStatesWrapper() {
        ImageView imageView = (ImageView) findViewById(R.id.image_view_state_scale);
        ImageView imageView2 = (ImageView) findViewById(R.id.image_view_state_rotate);
        ImageView imageView3 = (ImageView) findViewById(R.id.image_view_state_aspect_ratio);
        imageView.setImageDrawable(new SelectedStateListDrawable(imageView.getDrawable(), this.mActiveControlsWidgetColor));
        imageView2.setImageDrawable(new SelectedStateListDrawable(imageView2.getDrawable(), this.mActiveControlsWidgetColor));
        imageView3.setImageDrawable(new SelectedStateListDrawable(imageView3.getDrawable(), this.mActiveControlsWidgetColor));
    }

    private void setupViews(@o0 Intent intent) {
        this.isForbidCropGifWebp = intent.getBooleanExtra(ProtectedSandApp.s("幹\u0001"), false);
        this.mStatusBarColor = intent.getIntExtra(ProtectedSandApp.s("幖\u0001"), d.getColor(this, R.color.ucrop_color_statusbar));
        this.mToolbarColor = intent.getIntExtra(ProtectedSandApp.s("幺\u0001"), d.getColor(this, R.color.ucrop_color_toolbar));
        this.mActiveControlsWidgetColor = intent.getIntExtra(ProtectedSandApp.s("幻\u0001"), d.getColor(this, R.color.ucrop_color_active_controls_color));
        this.mToolbarWidgetColor = intent.getIntExtra(ProtectedSandApp.s("幼\u0001"), d.getColor(this, R.color.ucrop_color_toolbar_widget));
        this.mToolbarCancelDrawable = intent.getIntExtra(ProtectedSandApp.s("幽\u0001"), R.drawable.ucrop_ic_cross);
        this.mToolbarCropDrawable = intent.getIntExtra(ProtectedSandApp.s("幾\u0001"), R.drawable.ucrop_ic_done);
        this.mToolbarTitle = intent.getStringExtra(ProtectedSandApp.s("广\u0001"));
        this.mToolbarTitleSize = intent.getIntExtra(ProtectedSandApp.s("庀\u0001"), 18);
        String str = this.mToolbarTitle;
        if (str == null) {
            str = getResources().getString(R.string.ucrop_label_edit_photo);
        }
        this.mToolbarTitle = str;
        this.mLogoColor = intent.getIntExtra(ProtectedSandApp.s("庁\u0001"), d.getColor(this, R.color.ucrop_color_default_logo));
        this.mShowBottomControls = !intent.getBooleanExtra(ProtectedSandApp.s("庂\u0001"), false);
        this.mRootViewBackgroundColor = intent.getIntExtra(ProtectedSandApp.s("広\u0001"), d.getColor(this, R.color.ucrop_color_crop_background));
        setupAppBar();
        initiateRootViews();
        if (this.mShowBottomControls) {
            ViewGroup viewGroup = (ViewGroup) ((ViewGroup) findViewById(R.id.ucrop_photobox)).findViewById(R.id.controls_wrapper);
            viewGroup.setVisibility(0);
            LayoutInflater.from(this).inflate(R.layout.ucrop_controls, viewGroup, true);
            AutoTransition autoTransition = new AutoTransition();
            this.mControlsTransition = autoTransition;
            autoTransition.A0(CONTROLS_ANIMATION_DURATION);
            ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.state_aspect_ratio);
            this.mWrapperStateAspectRatio = viewGroup2;
            viewGroup2.setOnClickListener(this.mStateClickListener);
            ViewGroup viewGroup3 = (ViewGroup) findViewById(R.id.state_rotate);
            this.mWrapperStateRotate = viewGroup3;
            viewGroup3.setOnClickListener(this.mStateClickListener);
            ViewGroup viewGroup4 = (ViewGroup) findViewById(R.id.state_scale);
            this.mWrapperStateScale = viewGroup4;
            viewGroup4.setOnClickListener(this.mStateClickListener);
            this.mLayoutAspectRatio = (ViewGroup) findViewById(R.id.layout_aspect_ratio);
            this.mLayoutRotate = (ViewGroup) findViewById(R.id.layout_rotate_wheel);
            this.mLayoutScale = (ViewGroup) findViewById(R.id.layout_scale_wheel);
            setupAspectRatioWidget(intent);
            setupRotateWidget();
            setupScaleWidget();
            setupStatesWrapper();
        }
    }

    protected void cropAndSaveImage() {
        this.mBlockingView.setClickable(true);
        this.mShowLoader = true;
        supportInvalidateOptionsMenu();
        this.mGestureCropImageView.cropAndSaveImage(this.mCompressFormat, this.mCompressQuality, new BitmapCropCallback() { // from class: com.yalantis.ucrop.UCropActivity.8
            @Override // com.yalantis.ucrop.callback.BitmapCropCallback
            public void onBitmapCropped(@o0 Uri uri, int i4, int i5, int i6, int i7) {
                UCropActivity uCropActivity = UCropActivity.this;
                uCropActivity.setResultUri(uri, uCropActivity.mGestureCropImageView.getTargetAspectRatio(), i4, i5, i6, i7);
                UCropActivity.this.finish();
            }

            @Override // com.yalantis.ucrop.callback.BitmapCropCallback
            public void onCropFailure(@o0 Throwable th) {
                UCropActivity.this.setResultError(th);
                UCropActivity.this.finish();
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        immersive();
        setContentView(R.layout.ucrop_activity_photobox);
        Intent intent = getIntent();
        setupViews(intent);
        setImageData(intent);
        setInitialState();
        addBlockingView();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.ucrop_menu_activity, menu);
        MenuItem findItem = menu.findItem(R.id.menu_loader);
        Drawable icon = findItem.getIcon();
        if (icon != null) {
            try {
                icon.mutate();
                icon.setColorFilter(androidx.core.graphics.d.a(this.mToolbarWidgetColor, e.SRC_ATOP));
                findItem.setIcon(icon);
            } catch (IllegalStateException e4) {
                String.format(ProtectedSandApp.s("庄\u0001"), e4.getMessage(), getString(R.string.ucrop_mutate_exception_hint));
            }
            ((Animatable) findItem.getIcon()).start();
        }
        MenuItem findItem2 = menu.findItem(R.id.menu_crop);
        Drawable drawable = d.getDrawable(this, this.mToolbarCropDrawable);
        if (drawable == null) {
            return true;
        }
        drawable.mutate();
        drawable.setColorFilter(androidx.core.graphics.d.a(this.mToolbarWidgetColor, e.SRC_ATOP));
        findItem2.setIcon(drawable);
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        UCropDevelopConfig.destroy();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menu_crop) {
            cropAndSaveImage();
            return true;
        }
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        menu.findItem(R.id.menu_crop).setVisible(!this.mShowLoader);
        menu.findItem(R.id.menu_loader).setVisible(this.mShowLoader);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        GestureCropImageView gestureCropImageView = this.mGestureCropImageView;
        if (gestureCropImageView != null) {
            gestureCropImageView.cancelAllAnimations();
        }
    }

    protected void setResultError(Throwable th) {
        setResult(96, new Intent().putExtra(ProtectedSandApp.s("庅\u0001"), th));
    }

    protected void setResultUri(Uri uri, float f4, int i4, int i5, int i6, int i7) {
        setResult(-1, new Intent().putExtra(ProtectedSandApp.s("幵\u0001"), uri).putExtra(ProtectedSandApp.s("庆\u0001"), f4).putExtra(ProtectedSandApp.s("庇\u0001"), i6).putExtra(ProtectedSandApp.s("庈\u0001"), i7).putExtra(ProtectedSandApp.s("庉\u0001"), i4).putExtra(ProtectedSandApp.s("床\u0001"), i5).putExtra(ProtectedSandApp.s("庋\u0001"), FileUtils.getInputPath((Uri) getIntent().getParcelableExtra(ProtectedSandApp.s("年\u0001")))));
    }
}
