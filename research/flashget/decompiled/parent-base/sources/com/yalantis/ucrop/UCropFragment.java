package com.yalantis.ucrop;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.d0;
import androidx.annotation.l;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.appcompat.app.g;
import androidx.core.content.d;
import androidx.fragment.app.Fragment;
import androidx.transition.AutoTransition;
import androidx.transition.Transition;
import androidx.transition.x;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.yalantis.ucrop.callback.BitmapCropCallback;
import com.yalantis.ucrop.model.AspectRatio;
import com.yalantis.ucrop.util.FileUtils;
import com.yalantis.ucrop.util.SelectedStateListDrawable;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.OverlayView;
import com.yalantis.ucrop.view.TransformImageView;
import com.yalantis.ucrop.view.UCropView;
import com.yalantis.ucrop.view.widget.AspectRatioTextView;
import com.yalantis.ucrop.view.widget.HorizontalProgressWheelView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes7.dex */
public class UCropFragment extends Fragment {
    public static final int ALL = 3;
    private static final long CONTROLS_ANIMATION_DURATION = 50;
    public static final int DEFAULT_COMPRESS_QUALITY = 90;
    public static final int NONE = 0;
    public static final int ROTATE = 2;
    private static final int ROTATE_WIDGET_SENSITIVITY_COEFFICIENT = 42;
    public static final int SCALE = 1;
    private static final int SCALE_WIDGET_SENSITIVITY_COEFFICIENT = 15000;
    private static final int TABS_COUNT = 3;
    private UCropFragmentCallback callback;
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
    private TextView mTextViewRotateAngle;
    private TextView mTextViewScalePercent;
    private UCropView mUCropView;
    private ViewGroup mWrapperStateAspectRatio;
    private ViewGroup mWrapperStateRotate;
    private ViewGroup mWrapperStateScale;
    public static final Bitmap.CompressFormat DEFAULT_COMPRESS_FORMAT = Bitmap.CompressFormat.JPEG;
    public static final String TAG = ProtectedSandApp.s("庎\u0001");
    private final List<ViewGroup> mCropAspectRatioViews = new ArrayList();
    private Bitmap.CompressFormat mCompressFormat = DEFAULT_COMPRESS_FORMAT;
    private int mCompressQuality = 90;
    private int[] mAllowedGestures = {1, 2, 3};
    private final TransformImageView.TransformImageListener mImageListener = new TransformImageView.TransformImageListener() { // from class: com.yalantis.ucrop.UCropFragment.1
        @Override // com.yalantis.ucrop.view.TransformImageView.TransformImageListener
        public void onLoadComplete() {
            UCropFragment.this.mUCropView.animate().alpha(1.0f).setDuration(300L).setInterpolator(new AccelerateInterpolator());
            UCropFragment.this.mBlockingView.setClickable(false);
            UCropFragment.this.callback.loadingProgress(false);
            if (UCropFragment.this.getArguments().getBoolean(ProtectedSandApp.s("庌\u0001"), false)) {
                String mimeTypeFromMediaContentUri = FileUtils.getMimeTypeFromMediaContentUri(UCropFragment.this.getContext(), (Uri) UCropFragment.this.getArguments().getParcelable(ProtectedSandApp.s("庍\u0001")));
                if (FileUtils.isGif(mimeTypeFromMediaContentUri) || FileUtils.isWebp(mimeTypeFromMediaContentUri)) {
                    UCropFragment.this.mBlockingView.setClickable(true);
                }
            }
        }

        @Override // com.yalantis.ucrop.view.TransformImageView.TransformImageListener
        public void onLoadFailure(@o0 Exception exc) {
            UCropFragment.this.callback.onCropFinish(UCropFragment.this.getError(exc));
        }

        @Override // com.yalantis.ucrop.view.TransformImageView.TransformImageListener
        public void onRotate(float f4) {
            UCropFragment.this.setAngleText(f4);
        }

        @Override // com.yalantis.ucrop.view.TransformImageView.TransformImageListener
        public void onScale(float f4) {
            UCropFragment.this.setScaleText(f4);
        }
    };
    private final View.OnClickListener mStateClickListener = new View.OnClickListener() { // from class: com.yalantis.ucrop.UCropFragment.7
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view.isSelected()) {
                return;
            }
            UCropFragment.this.setWidgetState(view.getId());
        }
    };

    @Retention(RetentionPolicy.SOURCE)
    public @interface GestureTypes {
    }

    public static class UCropResult {
        public int mResultCode;
        public Intent mResultData;

        public UCropResult(int i4, Intent intent) {
            this.mResultCode = i4;
            this.mResultData = intent;
        }
    }

    static {
        g.Y(true);
    }

    private void addBlockingView(View view) {
        if (this.mBlockingView == null) {
            this.mBlockingView = new View(getContext());
            this.mBlockingView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.mBlockingView.setClickable(true);
        }
        ((RelativeLayout) view.findViewById(R.id.ucrop_photobox)).addView(this.mBlockingView);
    }

    private void changeSelectedTab(int i4) {
        if (getView() != null) {
            x.b((ViewGroup) getView().findViewById(R.id.ucrop_photobox), this.mControlsTransition);
        }
        this.mWrapperStateScale.findViewById(R.id.text_view_scale).setVisibility(i4 == R.id.state_scale ? 0 : 8);
        this.mWrapperStateAspectRatio.findViewById(R.id.text_view_crop).setVisibility(i4 == R.id.state_aspect_ratio ? 0 : 8);
        this.mWrapperStateRotate.findViewById(R.id.text_view_rotate).setVisibility(i4 == R.id.state_rotate ? 0 : 8);
    }

    private void initiateRootViews(View view) {
        UCropView uCropView = (UCropView) view.findViewById(R.id.ucrop);
        this.mUCropView = uCropView;
        this.mGestureCropImageView = uCropView.getCropImageView();
        this.mOverlayView = this.mUCropView.getOverlayView();
        this.mGestureCropImageView.setTransformImageListener(this.mImageListener);
        ((ImageView) view.findViewById(R.id.image_view_logo)).setColorFilter(this.mLogoColor, PorterDuff.Mode.SRC_ATOP);
        view.findViewById(R.id.ucrop_frame).setBackgroundColor(this.mRootViewBackgroundColor);
    }

    public static UCropFragment newInstance(Bundle bundle) {
        UCropFragment uCropFragment = new UCropFragment();
        uCropFragment.setArguments(bundle);
        return uCropFragment;
    }

    private void processOptions(@o0 Bundle bundle) {
        String string = bundle.getString(ProtectedSandApp.s("序\u0001"));
        Bitmap.CompressFormat valueOf = !TextUtils.isEmpty(string) ? Bitmap.CompressFormat.valueOf(string) : null;
        if (valueOf == null) {
            valueOf = DEFAULT_COMPRESS_FORMAT;
        }
        this.mCompressFormat = valueOf;
        this.mCompressQuality = bundle.getInt(ProtectedSandApp.s("庐\u0001"), 90);
        this.isUseCustomBitmap = bundle.getBoolean(ProtectedSandApp.s("庑\u0001"), false);
        int[] intArray = bundle.getIntArray(ProtectedSandApp.s("庒\u0001"));
        if (intArray != null && intArray.length == 3) {
            this.mAllowedGestures = intArray;
        }
        this.mGestureCropImageView.setMaxBitmapSize(bundle.getInt(ProtectedSandApp.s("库\u0001"), 0));
        this.mGestureCropImageView.setMaxScaleMultiplier(bundle.getFloat(ProtectedSandApp.s("应\u0001"), 10.0f));
        this.mGestureCropImageView.setImageToWrapCropBoundsAnimDuration(bundle.getInt(ProtectedSandApp.s("底\u0001"), 500));
        this.mOverlayView.setFreestyleCropEnabled(bundle.getBoolean(ProtectedSandApp.s("庖\u0001"), false));
        this.mOverlayView.setDragSmoothToCenter(bundle.getBoolean(ProtectedSandApp.s("店\u0001"), false));
        OverlayView overlayView = this.mOverlayView;
        Resources resources = getResources();
        int i4 = R.color.ucrop_color_default_dimmed;
        overlayView.setDimmedColor(bundle.getInt(ProtectedSandApp.s("庘\u0001"), resources.getColor(i4)));
        this.mOverlayView.setCircleStrokeColor(bundle.getInt(ProtectedSandApp.s("庙\u0001"), getResources().getColor(i4)));
        this.mOverlayView.setCircleDimmedLayer(bundle.getBoolean(ProtectedSandApp.s("庚\u0001"), false));
        this.mOverlayView.setShowCropFrame(bundle.getBoolean(ProtectedSandApp.s("庛\u0001"), true));
        this.mOverlayView.setCropFrameColor(bundle.getInt(ProtectedSandApp.s("府\u0001"), getResources().getColor(R.color.ucrop_color_default_crop_frame)));
        this.mOverlayView.setCropFrameStrokeWidth(bundle.getInt(ProtectedSandApp.s("庝\u0001"), getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_frame_stoke_width)));
        this.mOverlayView.setShowCropGrid(bundle.getBoolean(ProtectedSandApp.s("庞\u0001"), true));
        this.mOverlayView.setCropGridRowCount(bundle.getInt(ProtectedSandApp.s("废\u0001"), 2));
        this.mOverlayView.setCropGridColumnCount(bundle.getInt(ProtectedSandApp.s("庠\u0001"), 2));
        this.mOverlayView.setCropGridColor(bundle.getInt(ProtectedSandApp.s("庡\u0001"), getResources().getColor(R.color.ucrop_color_default_crop_grid)));
        OverlayView overlayView2 = this.mOverlayView;
        Resources resources2 = getResources();
        int i5 = R.dimen.ucrop_default_crop_grid_stoke_width;
        overlayView2.setCropGridStrokeWidth(bundle.getInt(ProtectedSandApp.s("庢\u0001"), resources2.getDimensionPixelSize(i5)));
        this.mOverlayView.setDimmedStrokeWidth(bundle.getInt(ProtectedSandApp.s("庣\u0001"), getResources().getDimensionPixelSize(i5)));
        float f4 = bundle.getFloat(ProtectedSandApp.s("庤\u0001"), -1.0f);
        float f5 = bundle.getFloat(ProtectedSandApp.s("庥\u0001"), -1.0f);
        int i6 = bundle.getInt(ProtectedSandApp.s("度\u0001"), 0);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(ProtectedSandApp.s("座\u0001"));
        if (f4 >= 0.0f && f5 >= 0.0f) {
            ViewGroup viewGroup = this.mWrapperStateAspectRatio;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            float f6 = f4 / f5;
            this.mGestureCropImageView.setTargetAspectRatio(Float.isNaN(f6) ? 0.0f : f6);
        } else if (parcelableArrayList == null || i6 >= parcelableArrayList.size()) {
            this.mGestureCropImageView.setTargetAspectRatio(0.0f);
        } else {
            float aspectRatioX = ((AspectRatio) parcelableArrayList.get(i6)).getAspectRatioX() / ((AspectRatio) parcelableArrayList.get(i6)).getAspectRatioY();
            this.mGestureCropImageView.setTargetAspectRatio(Float.isNaN(aspectRatioX) ? 0.0f : aspectRatioX);
        }
        int i7 = bundle.getInt(ProtectedSandApp.s("庨\u0001"), 0);
        int i10 = bundle.getInt(ProtectedSandApp.s("庩\u0001"), 0);
        if (i7 <= 0 || i10 <= 0) {
            return;
        }
        this.mGestureCropImageView.setMaxResultImageSizeX(i7);
        this.mGestureCropImageView.setMaxResultImageSizeY(i10);
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
        this.mGestureCropImageView.setGestureEnabled(getArguments().getBoolean(ProtectedSandApp.s("庪\u0001"), true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAngleText(float f4) {
        TextView textView = this.mTextViewRotateAngle;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), ProtectedSandApp.s("庫\u0001"), Float.valueOf(f4)));
        }
    }

    private void setAngleTextColor(int i4) {
        TextView textView = this.mTextViewRotateAngle;
        if (textView != null) {
            textView.setTextColor(i4);
        }
    }

    private void setImageData(@o0 Bundle bundle) {
        Uri uri = (Uri) bundle.getParcelable(ProtectedSandApp.s("庬\u0001"));
        Uri uri2 = (Uri) bundle.getParcelable(ProtectedSandApp.s("庭\u0001"));
        processOptions(bundle);
        if (uri == null || uri2 == null) {
            this.callback.onCropFinish(getError(new NullPointerException(getString(R.string.ucrop_error_input_data_is_absent))));
            return;
        }
        try {
            this.mGestureCropImageView.setImageUri(uri, FileUtils.replaceOutputUri(getContext(), bundle.getBoolean(ProtectedSandApp.s("庮\u0001"), false), uri, uri2), this.isUseCustomBitmap);
        } catch (Exception e4) {
            this.callback.onCropFinish(getError(e4));
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
            textView.setText(String.format(Locale.getDefault(), ProtectedSandApp.s("庯\u0001"), Integer.valueOf((int) (f4 * 100.0f))));
        }
    }

    private void setScaleTextColor(int i4) {
        TextView textView = this.mTextViewScalePercent;
        if (textView != null) {
            textView.setTextColor(i4);
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

    private void setupAspectRatioWidget(@o0 Bundle bundle, View view) {
        int i4 = bundle.getInt(ProtectedSandApp.s("度\u0001"), 0);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(ProtectedSandApp.s("座\u0001"));
        if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
            parcelableArrayList = new ArrayList();
            parcelableArrayList.add(new AspectRatio(null, 1.0f, 1.0f));
            parcelableArrayList.add(new AspectRatio(null, 3.0f, 4.0f));
            parcelableArrayList.add(new AspectRatio(getString(R.string.ucrop_label_original).toUpperCase(), 0.0f, 0.0f));
            parcelableArrayList.add(new AspectRatio(null, 3.0f, 2.0f));
            parcelableArrayList.add(new AspectRatio(null, 16.0f, 9.0f));
            i4 = 2;
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.layout_aspect_ratio);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
        layoutParams.weight = 1.0f;
        Iterator it = parcelableArrayList.iterator();
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
        this.mCropAspectRatioViews.get(i4).setSelected(true);
        Iterator<ViewGroup> it2 = this.mCropAspectRatioViews.iterator();
        while (it2.hasNext()) {
            it2.next().setOnClickListener(new View.OnClickListener() { // from class: com.yalantis.ucrop.UCropFragment.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    UCropFragment.this.mGestureCropImageView.setTargetAspectRatio(((AspectRatioTextView) ((ViewGroup) view2).getChildAt(0)).getAspectRatio(view2.isSelected()));
                    UCropFragment.this.mGestureCropImageView.setImageToWrapCropBounds();
                    if (view2.isSelected()) {
                        return;
                    }
                    for (ViewGroup viewGroup : UCropFragment.this.mCropAspectRatioViews) {
                        viewGroup.setSelected(viewGroup == view2);
                    }
                }
            });
        }
    }

    private void setupRotateWidget(View view) {
        this.mTextViewRotateAngle = (TextView) view.findViewById(R.id.text_view_rotate);
        int i4 = R.id.rotate_scroll_wheel;
        ((HorizontalProgressWheelView) view.findViewById(i4)).setScrollingListener(new HorizontalProgressWheelView.ScrollingListener() { // from class: com.yalantis.ucrop.UCropFragment.3
            @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.ScrollingListener
            public void onScroll(float f4, float f5) {
                UCropFragment.this.mGestureCropImageView.postRotate(f4 / 42.0f);
            }

            @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.ScrollingListener
            public void onScrollEnd() {
                UCropFragment.this.mGestureCropImageView.setImageToWrapCropBounds();
            }

            @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.ScrollingListener
            public void onScrollStart() {
                UCropFragment.this.mGestureCropImageView.cancelAllAnimations();
            }
        });
        ((HorizontalProgressWheelView) view.findViewById(i4)).setMiddleLineColor(this.mActiveControlsWidgetColor);
        view.findViewById(R.id.wrapper_reset_rotate).setOnClickListener(new View.OnClickListener() { // from class: com.yalantis.ucrop.UCropFragment.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                UCropFragment.this.resetRotation();
            }
        });
        view.findViewById(R.id.wrapper_rotate_by_angle).setOnClickListener(new View.OnClickListener() { // from class: com.yalantis.ucrop.UCropFragment.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                UCropFragment.this.rotateByAngle(90);
            }
        });
        setAngleTextColor(this.mActiveControlsWidgetColor);
    }

    private void setupScaleWidget(View view) {
        this.mTextViewScalePercent = (TextView) view.findViewById(R.id.text_view_scale);
        int i4 = R.id.scale_scroll_wheel;
        ((HorizontalProgressWheelView) view.findViewById(i4)).setScrollingListener(new HorizontalProgressWheelView.ScrollingListener() { // from class: com.yalantis.ucrop.UCropFragment.6
            @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.ScrollingListener
            public void onScroll(float f4, float f5) {
                if (f4 > 0.0f) {
                    UCropFragment.this.mGestureCropImageView.zoomInImage((((UCropFragment.this.mGestureCropImageView.getMaxScale() - UCropFragment.this.mGestureCropImageView.getMinScale()) / 15000.0f) * f4) + UCropFragment.this.mGestureCropImageView.getCurrentScale());
                } else {
                    UCropFragment.this.mGestureCropImageView.zoomOutImage((((UCropFragment.this.mGestureCropImageView.getMaxScale() - UCropFragment.this.mGestureCropImageView.getMinScale()) / 15000.0f) * f4) + UCropFragment.this.mGestureCropImageView.getCurrentScale());
                }
            }

            @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.ScrollingListener
            public void onScrollEnd() {
                UCropFragment.this.mGestureCropImageView.setImageToWrapCropBounds();
            }

            @Override // com.yalantis.ucrop.view.widget.HorizontalProgressWheelView.ScrollingListener
            public void onScrollStart() {
                UCropFragment.this.mGestureCropImageView.cancelAllAnimations();
            }
        });
        ((HorizontalProgressWheelView) view.findViewById(i4)).setMiddleLineColor(this.mActiveControlsWidgetColor);
        setScaleTextColor(this.mActiveControlsWidgetColor);
    }

    private void setupStatesWrapper(View view) {
        ImageView imageView = (ImageView) view.findViewById(R.id.image_view_state_scale);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.image_view_state_rotate);
        ImageView imageView3 = (ImageView) view.findViewById(R.id.image_view_state_aspect_ratio);
        imageView.setImageDrawable(new SelectedStateListDrawable(imageView.getDrawable(), this.mActiveControlsWidgetColor));
        imageView2.setImageDrawable(new SelectedStateListDrawable(imageView2.getDrawable(), this.mActiveControlsWidgetColor));
        imageView3.setImageDrawable(new SelectedStateListDrawable(imageView3.getDrawable(), this.mActiveControlsWidgetColor));
    }

    public void cropAndSaveImage() {
        this.mBlockingView.setClickable(true);
        this.callback.loadingProgress(true);
        this.mGestureCropImageView.cropAndSaveImage(this.mCompressFormat, this.mCompressQuality, new BitmapCropCallback() { // from class: com.yalantis.ucrop.UCropFragment.8
            @Override // com.yalantis.ucrop.callback.BitmapCropCallback
            public void onBitmapCropped(@o0 Uri uri, int i4, int i5, int i6, int i7) {
                UCropFragmentCallback uCropFragmentCallback = UCropFragment.this.callback;
                UCropFragment uCropFragment = UCropFragment.this;
                uCropFragmentCallback.onCropFinish(uCropFragment.getResult(uri, uCropFragment.mGestureCropImageView.getTargetAspectRatio(), i4, i5, i6, i7));
                UCropFragment.this.callback.loadingProgress(false);
            }

            @Override // com.yalantis.ucrop.callback.BitmapCropCallback
            public void onCropFailure(@o0 Throwable th) {
                UCropFragment.this.callback.onCropFinish(UCropFragment.this.getError(th));
            }
        });
    }

    public void fragmentReVisible() {
        setImageData(getArguments());
        this.mUCropView.animate().alpha(1.0f).setDuration(300L).setInterpolator(new AccelerateInterpolator());
        boolean z4 = false;
        this.callback.loadingProgress(false);
        if (getArguments().getBoolean(ProtectedSandApp.s("庮\u0001"), false)) {
            String mimeTypeFromMediaContentUri = FileUtils.getMimeTypeFromMediaContentUri(getContext(), (Uri) getArguments().getParcelable(ProtectedSandApp.s("庬\u0001")));
            if (FileUtils.isGif(mimeTypeFromMediaContentUri) || FileUtils.isWebp(mimeTypeFromMediaContentUri)) {
                z4 = true;
            }
        }
        this.mBlockingView.setClickable(z4);
    }

    protected UCropResult getError(Throwable th) {
        return new UCropResult(96, new Intent().putExtra(ProtectedSandApp.s("庰\u0001"), th));
    }

    protected UCropResult getResult(Uri uri, float f4, int i4, int i5, int i6, int i7) {
        return new UCropResult(-1, new Intent().putExtra(ProtectedSandApp.s("庭\u0001"), uri).putExtra(ProtectedSandApp.s("庱\u0001"), f4).putExtra(ProtectedSandApp.s("庲\u0001"), i6).putExtra(ProtectedSandApp.s("庳\u0001"), i7).putExtra(ProtectedSandApp.s("庴\u0001"), i4).putExtra(ProtectedSandApp.s("庵\u0001"), i5).putExtra(ProtectedSandApp.s("庶\u0001"), FileUtils.getInputPath((Uri) getArguments().getParcelable(ProtectedSandApp.s("庬\u0001")))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (getParentFragment() instanceof UCropFragmentCallback) {
            this.callback = (UCropFragmentCallback) getParentFragment();
        } else {
            if (context instanceof UCropFragmentCallback) {
                this.callback = (UCropFragmentCallback) context;
                return;
            }
            throw new IllegalArgumentException(context.toString() + ProtectedSandApp.s("康\u0001"));
        }
    }

    @Override // androidx.fragment.app.Fragment
    @q0
    public View onCreateView(@o0 LayoutInflater layoutInflater, @q0 ViewGroup viewGroup, @q0 Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.ucrop_fragment_photobox, viewGroup, false);
        Bundle arguments = getArguments();
        setupViews(inflate, arguments);
        setImageData(arguments);
        setInitialState();
        addBlockingView(inflate);
        return inflate;
    }

    public void setCallback(UCropFragmentCallback uCropFragmentCallback) {
        this.callback = uCropFragmentCallback;
    }

    public void setupViews(View view, Bundle bundle) {
        this.mActiveControlsWidgetColor = bundle.getInt(ProtectedSandApp.s("庸\u0001"), d.getColor(getContext(), R.color.ucrop_color_active_controls_color));
        this.mLogoColor = bundle.getInt(ProtectedSandApp.s("庹\u0001"), d.getColor(getContext(), R.color.ucrop_color_default_logo));
        this.mShowBottomControls = !bundle.getBoolean(ProtectedSandApp.s("庺\u0001"), false);
        this.mRootViewBackgroundColor = bundle.getInt(ProtectedSandApp.s("庻\u0001"), d.getColor(getContext(), R.color.ucrop_color_crop_background));
        initiateRootViews(view);
        this.callback.loadingProgress(true);
        if (!this.mShowBottomControls) {
            int i4 = R.id.ucrop_frame;
            ((RelativeLayout.LayoutParams) view.findViewById(i4).getLayoutParams()).bottomMargin = 0;
            view.findViewById(i4).requestLayout();
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.controls_wrapper);
        viewGroup.setVisibility(0);
        LayoutInflater.from(getContext()).inflate(R.layout.ucrop_controls, viewGroup, true);
        AutoTransition autoTransition = new AutoTransition();
        this.mControlsTransition = autoTransition;
        autoTransition.A0(CONTROLS_ANIMATION_DURATION);
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.state_aspect_ratio);
        this.mWrapperStateAspectRatio = viewGroup2;
        viewGroup2.setOnClickListener(this.mStateClickListener);
        ViewGroup viewGroup3 = (ViewGroup) view.findViewById(R.id.state_rotate);
        this.mWrapperStateRotate = viewGroup3;
        viewGroup3.setOnClickListener(this.mStateClickListener);
        ViewGroup viewGroup4 = (ViewGroup) view.findViewById(R.id.state_scale);
        this.mWrapperStateScale = viewGroup4;
        viewGroup4.setOnClickListener(this.mStateClickListener);
        this.mLayoutAspectRatio = (ViewGroup) view.findViewById(R.id.layout_aspect_ratio);
        this.mLayoutRotate = (ViewGroup) view.findViewById(R.id.layout_rotate_wheel);
        this.mLayoutScale = (ViewGroup) view.findViewById(R.id.layout_scale_wheel);
        setupAspectRatioWidget(bundle, view);
        setupRotateWidget(view);
        setupScaleWidget(view);
        setupStatesWrapper(view);
    }
}
