package com.yalantis.ucrop;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.g0;
import androidx.annotation.l;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.v;
import androidx.annotation.x;
import androidx.fragment.app.Fragment;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.yalantis.ucrop.model.AspectRatio;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes7.dex */
public class UCrop {
    public static final int MIN_SIZE = 10;
    public static final int REQUEST_CROP = 69;
    public static final int RESULT_ERROR = 96;
    private Intent mCropIntent = new Intent();
    private Bundle mCropOptionsBundle;
    public static final String EXTRA_CROP_TOTAL_DATA_SOURCE = ProtectedSandApp.s("幂\u0001");
    public static final String EXTRA_ASPECT_RATIO_Y = ProtectedSandApp.s("幍\u0001");
    public static final String EXTRA_CROP_INPUT_ORIGINAL = ProtectedSandApp.s("幐\u0001");
    public static final String EXTRA_ASPECT_RATIO_X = ProtectedSandApp.s("幌\u0001");
    public static final String EXTRA_ERROR = ProtectedSandApp.s("幃\u0001");
    public static final String EXTRA_OUTPUT_CROP_ASPECT_RATIO = ProtectedSandApp.s("幄\u0001");
    private static final String EXTRA_PREFIX = ProtectedSandApp.s("幑\u0001");
    public static final String EXTRA_INPUT_URI = ProtectedSandApp.s("幀\u0001");
    public static final String EXTRA_MAX_SIZE_X = ProtectedSandApp.s("幎\u0001");
    public static final String EXTRA_MAX_SIZE_Y = ProtectedSandApp.s("幏\u0001");
    public static final String EXTRA_OUTPUT_URI = ProtectedSandApp.s("幁\u0001");
    public static final String EXTRA_OUTPUT_IMAGE_WIDTH = ProtectedSandApp.s("幈\u0001");
    public static final String EXTRA_OUTPUT_OFFSET_X = ProtectedSandApp.s("幆\u0001");
    public static final String EXTRA_OUTPUT_OFFSET_Y = ProtectedSandApp.s("幇\u0001");
    public static final String EXTRA_OUTPUT_IMAGE_HEIGHT = ProtectedSandApp.s("幅\u0001");

    public static class Options {
        private final Bundle mOptionBundle = new Bundle();
        public static final String EXTRA_CIRCLE_DIMMED_LAYER = ProtectedSandApp.s("帛\u0001");
        public static final String EXTRA_CROP_OUTPUT_FILE_NAME = ProtectedSandApp.s("帧\u0001");
        public static final String EXTRA_CROP_FRAME_STROKE_WIDTH = ProtectedSandApp.s("帡\u0001");
        public static final String EXTRA_STATUS_BAR_COLOR = ProtectedSandApp.s("帷\u0001");
        public static final String EXTRA_UCROP_TITLE_TEXT_TOOLBAR = ProtectedSandApp.s("帻\u0001");
        public static final String EXTRA_UCROP_COLOR_CONTROLS_WIDGET_ACTIVE = ProtectedSandApp.s("帖\u0001");
        public static final String EXTRA_DRAG_IMAGES = ProtectedSandApp.s("帒\u0001");
        public static final String EXTRA_UCROP_LOGO_COLOR = ProtectedSandApp.s("席\u0001");
        public static final String EXTRA_UCROP_WIDGET_COLOR_TOOLBAR = ProtectedSandApp.s("帽\u0001");
        public static final String EXTRA_UCROP_WIDGET_CANCEL_DRAWABLE = ProtectedSandApp.s("常\u0001");
        public static final String EXTRA_SKIP_CROP_MIME_TYPE = ProtectedSandApp.s("帶\u0001");
        public static final String EXTRA_CROP_CUSTOM_LOADER_BITMAP = ProtectedSandApp.s("帕\u0001");
        public static final String EXTRA_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION = ProtectedSandApp.s("帬\u0001");
        public static final String EXTRA_DIMMED_LAYER_COLOR = ProtectedSandApp.s("帩\u0001");
        public static final String EXTRA_CROP_GRID_STROKE_WIDTH = ProtectedSandApp.s("带\u0001");
        public static final String EXTRA_CROP_FORBID_GIF_WEBP = ProtectedSandApp.s("帓\u0001");
        public static final String EXTRA_UCROP_ROOT_VIEW_BACKGROUND_COLOR = ProtectedSandApp.s("帳\u0001");
        public static final String EXTRA_CROP_FRAME_COLOR = ProtectedSandApp.s("帠\u0001");
        public static final String EXTRA_UCROP_WIDGET_CROP_DRAWABLE = ProtectedSandApp.s("帺\u0001");
        public static final String EXTRA_CIRCLE_STROKE_WIDTH_LAYER = ProtectedSandApp.s("帝\u0001");
        public static final String EXTRA_CIRCLE_STROKE_COLOR = ProtectedSandApp.s("帜\u0001");
        public static final String EXTRA_TOOL_BAR_COLOR = ProtectedSandApp.s("帹\u0001");
        public static final String EXTRA_CROP_GRID_COLOR = ProtectedSandApp.s("帣\u0001");
        public static final String EXTRA_CROP_FORBID_SKIP = ProtectedSandApp.s("帔\u0001");
        public static final String EXTRA_MAX_SCALE_MULTIPLIER = ProtectedSandApp.s("帯\u0001");
        public static final String EXTRA_CROP_GRID_COLUMN_COUNT = ProtectedSandApp.s("帤\u0001");
        public static final String EXTRA_ASPECT_RATIO_SELECTED_BY_DEFAULT = ProtectedSandApp.s("帘\u0001");
        public static final String EXTRA_COMPRESSION_FORMAT_NAME = ProtectedSandApp.s("帞\u0001");
        public static final String EXTRA_MAX_BITMAP_SIZE = ProtectedSandApp.s("帮\u0001");
        public static final String EXTRA_SHOW_CROP_FRAME = ProtectedSandApp.s("帴\u0001");
        public static final String EXTRA_SHOW_CROP_GRID = ProtectedSandApp.s("帵\u0001");
        public static final String EXTRA_CROP_DRAG_CENTER = ProtectedSandApp.s("帐\u0001");
        public static final String EXTRA_COMPRESSION_QUALITY = ProtectedSandApp.s("帟\u0001");
        public static final String EXTRA_CROP_OUTPUT_DIR = ProtectedSandApp.s("帨\u0001");
        public static final String EXTRA_CROP_GRID_ROW_COUNT = ProtectedSandApp.s("帥\u0001");
        public static final String EXTRA_FREE_STYLE_CROP = ProtectedSandApp.s("帪\u0001");
        public static final String EXTRA_GALLERY_BAR_BACKGROUND = ProtectedSandApp.s("帢\u0001");
        public static final String EXTRA_HIDE_BOTTOM_CONTROLS = ProtectedSandApp.s("師\u0001");
        public static final String EXTRA_ALLOWED_GESTURES = ProtectedSandApp.s("帗\u0001");
        public static final String EXTRA_ASPECT_RATIO_OPTIONS = ProtectedSandApp.s("帙\u0001");
        public static final String EXTRA_MULTIPLE_ASPECT_RATIO = ProtectedSandApp.s("帲\u0001");
        public static final String EXTRA_DARK_STATUS_BAR_BLACK = ProtectedSandApp.s("帑\u0001");
        public static final String EXTRA_UCROP_TITLE_TEXT_SIZE_TOOLBAR = ProtectedSandApp.s("帼\u0001");

        @o0
        public Bundle getOptionBundle() {
            return this.mOptionBundle;
        }

        public void isCropDragSmoothToCenter(boolean z4) {
            this.mOptionBundle.putBoolean(ProtectedSandApp.s("帐\u0001"), z4);
        }

        public void isDarkStatusBarBlack(boolean z4) {
            this.mOptionBundle.putBoolean(ProtectedSandApp.s("帑\u0001"), z4);
        }

        public void isDragCropImages(boolean z4) {
            this.mOptionBundle.putBoolean(ProtectedSandApp.s("帒\u0001"), z4);
        }

        public void isForbidCropGifWebp(boolean z4) {
            this.mOptionBundle.putBoolean(ProtectedSandApp.s("帓\u0001"), z4);
        }

        public void isForbidSkipMultipleCrop(boolean z4) {
            this.mOptionBundle.putBoolean(ProtectedSandApp.s("帔\u0001"), z4);
        }

        public void isUseCustomLoaderBitmap(boolean z4) {
            this.mOptionBundle.putBoolean(ProtectedSandApp.s("帕\u0001"), z4);
        }

        public void setActiveControlsWidgetColor(@l int i4) {
            this.mOptionBundle.putInt(ProtectedSandApp.s("帖\u0001"), i4);
        }

        public void setAllowedGestures(int i4, int i5, int i6) {
            this.mOptionBundle.putIntArray(ProtectedSandApp.s("帗\u0001"), new int[]{i4, i5, i6});
        }

        public void setAspectRatioOptions(int i4, AspectRatio... aspectRatioArr) {
            if (i4 >= aspectRatioArr.length) {
                throw new IllegalArgumentException(String.format(Locale.US, ProtectedSandApp.s("帚\u0001"), Integer.valueOf(i4), Integer.valueOf(aspectRatioArr.length)));
            }
            this.mOptionBundle.putInt(ProtectedSandApp.s("帘\u0001"), i4);
            this.mOptionBundle.putParcelableArrayList(ProtectedSandApp.s("帙\u0001"), new ArrayList<>(Arrays.asList(aspectRatioArr)));
        }

        public void setCircleDimmedLayer(boolean z4) {
            this.mOptionBundle.putBoolean(ProtectedSandApp.s("帛\u0001"), z4);
        }

        public void setCircleStrokeColor(@l int i4) {
            this.mOptionBundle.putInt(ProtectedSandApp.s("帜\u0001"), i4);
        }

        public void setCircleStrokeWidth(@g0(from = 0) int i4) {
            this.mOptionBundle.putInt(ProtectedSandApp.s("帝\u0001"), i4);
        }

        public void setCompressionFormat(@o0 Bitmap.CompressFormat compressFormat) {
            this.mOptionBundle.putString(ProtectedSandApp.s("帞\u0001"), compressFormat.name());
        }

        public void setCompressionQuality(@g0(from = 0) int i4) {
            this.mOptionBundle.putInt(ProtectedSandApp.s("帟\u0001"), i4);
        }

        public void setCropFrameColor(@l int i4) {
            this.mOptionBundle.putInt(ProtectedSandApp.s("帠\u0001"), i4);
        }

        public void setCropFrameStrokeWidth(@g0(from = 0) int i4) {
            this.mOptionBundle.putInt(ProtectedSandApp.s("帡\u0001"), i4);
        }

        public void setCropGalleryBarBackgroundResources(@l int i4) {
            this.mOptionBundle.putInt(ProtectedSandApp.s("帢\u0001"), i4);
        }

        public void setCropGridColor(@l int i4) {
            this.mOptionBundle.putInt(ProtectedSandApp.s("帣\u0001"), i4);
        }

        public void setCropGridColumnCount(@g0(from = 0) int i4) {
            this.mOptionBundle.putInt(ProtectedSandApp.s("帤\u0001"), i4);
        }

        public void setCropGridRowCount(@g0(from = 0) int i4) {
            this.mOptionBundle.putInt(ProtectedSandApp.s("帥\u0001"), i4);
        }

        public void setCropGridStrokeWidth(@g0(from = 0) int i4) {
            this.mOptionBundle.putInt(ProtectedSandApp.s("带\u0001"), i4);
        }

        public void setCropOutputFileName(@o0 String str) {
            this.mOptionBundle.putString(ProtectedSandApp.s("帧\u0001"), str);
        }

        public void setCropOutputPathDir(@o0 String str) {
            this.mOptionBundle.putString(ProtectedSandApp.s("帨\u0001"), str);
        }

        public void setDimmedLayerColor(@l int i4) {
            this.mOptionBundle.putInt(ProtectedSandApp.s("帩\u0001"), i4);
        }

        public void setFreeStyleCropEnabled(boolean z4) {
            this.mOptionBundle.putBoolean(ProtectedSandApp.s("帪\u0001"), z4);
        }

        public void setHideBottomControls(boolean z4) {
            this.mOptionBundle.putBoolean(ProtectedSandApp.s("師\u0001"), z4);
        }

        public void setImageToCropBoundsAnimDuration(@g0(from = 10) int i4) {
            this.mOptionBundle.putInt(ProtectedSandApp.s("帬\u0001"), i4);
        }

        public void setLogoColor(@l int i4) {
            this.mOptionBundle.putInt(ProtectedSandApp.s("席\u0001"), i4);
        }

        public void setMaxBitmapSize(@g0(from = 10) int i4) {
            this.mOptionBundle.putInt(ProtectedSandApp.s("帮\u0001"), i4);
        }

        public void setMaxScaleMultiplier(@x(from = 1.0d, fromInclusive = false) float f4) {
            this.mOptionBundle.putFloat(ProtectedSandApp.s("帯\u0001"), f4);
        }

        public void setMultipleCropAspectRatio(AspectRatio... aspectRatioArr) {
            float f4 = this.mOptionBundle.getFloat(ProtectedSandApp.s("帰\u0001"), 0.0f);
            float f5 = this.mOptionBundle.getFloat(ProtectedSandApp.s("帱\u0001"), 0.0f);
            if (aspectRatioArr.length > 0 && f4 <= 0.0f && f5 <= 0.0f) {
                withAspectRatio(aspectRatioArr[0].getAspectRatioX(), aspectRatioArr[0].getAspectRatioY());
            }
            this.mOptionBundle.putParcelableArrayList(ProtectedSandApp.s("帲\u0001"), new ArrayList<>(Arrays.asList(aspectRatioArr)));
        }

        public void setRootViewBackgroundColor(@l int i4) {
            this.mOptionBundle.putInt(ProtectedSandApp.s("帳\u0001"), i4);
        }

        public void setShowCropFrame(boolean z4) {
            this.mOptionBundle.putBoolean(ProtectedSandApp.s("帴\u0001"), z4);
        }

        public void setShowCropGrid(boolean z4) {
            this.mOptionBundle.putBoolean(ProtectedSandApp.s("帵\u0001"), z4);
        }

        public void setSkipCropMimeType(String... strArr) {
            if (strArr == null || strArr.length <= 0) {
                return;
            }
            this.mOptionBundle.putStringArrayList(ProtectedSandApp.s("帶\u0001"), new ArrayList<>(Arrays.asList(strArr)));
        }

        public void setStatusBarColor(@l int i4) {
            this.mOptionBundle.putInt(ProtectedSandApp.s("帷\u0001"), i4);
        }

        public void setToolbarCancelDrawable(@v int i4) {
            this.mOptionBundle.putInt(ProtectedSandApp.s("常\u0001"), i4);
        }

        public void setToolbarColor(@l int i4) {
            this.mOptionBundle.putInt(ProtectedSandApp.s("帹\u0001"), i4);
        }

        public void setToolbarCropDrawable(@v int i4) {
            this.mOptionBundle.putInt(ProtectedSandApp.s("帺\u0001"), i4);
        }

        public void setToolbarTitle(@q0 String str) {
            this.mOptionBundle.putString(ProtectedSandApp.s("帻\u0001"), str);
        }

        public void setToolbarTitleSize(int i4) {
            if (i4 > 0) {
                this.mOptionBundle.putInt(ProtectedSandApp.s("帼\u0001"), i4);
            }
        }

        public void setToolbarWidgetColor(@l int i4) {
            this.mOptionBundle.putInt(ProtectedSandApp.s("帽\u0001"), i4);
        }

        public void useSourceImageAspectRatio() {
            this.mOptionBundle.putFloat(ProtectedSandApp.s("帰\u0001"), 0.0f);
            this.mOptionBundle.putFloat(ProtectedSandApp.s("帱\u0001"), 0.0f);
        }

        public void withAspectRatio(float f4, float f5) {
            this.mOptionBundle.putFloat(ProtectedSandApp.s("帰\u0001"), f4);
            this.mOptionBundle.putFloat(ProtectedSandApp.s("帱\u0001"), f5);
        }

        public void withMaxResultSize(@g0(from = 10) int i4, @g0(from = 10) int i5) {
            this.mOptionBundle.putInt(ProtectedSandApp.s("帾\u0001"), i4);
            this.mOptionBundle.putInt(ProtectedSandApp.s("帿\u0001"), i5);
        }
    }

    private UCrop(@o0 Uri uri, @o0 Uri uri2) {
        Bundle bundle = new Bundle();
        this.mCropOptionsBundle = bundle;
        bundle.putParcelable(ProtectedSandApp.s("幀\u0001"), uri);
        this.mCropOptionsBundle.putParcelable(ProtectedSandApp.s("幁\u0001"), uri2);
    }

    @q0
    public static Throwable getError(@o0 Intent intent) {
        return (Throwable) intent.getSerializableExtra(ProtectedSandApp.s("幃\u0001"));
    }

    @q0
    public static Uri getOutput(@o0 Intent intent) {
        return (Uri) intent.getParcelableExtra(ProtectedSandApp.s("幁\u0001"));
    }

    public static float getOutputCropAspectRatio(@o0 Intent intent) {
        return intent.getFloatExtra(ProtectedSandApp.s("幄\u0001"), 0.0f);
    }

    public static int getOutputImageHeight(@o0 Intent intent) {
        return intent.getIntExtra(ProtectedSandApp.s("幅\u0001"), -1);
    }

    public static int getOutputImageOffsetX(@o0 Intent intent) {
        return intent.getIntExtra(ProtectedSandApp.s("幆\u0001"), 0);
    }

    public static int getOutputImageOffsetY(@o0 Intent intent) {
        return intent.getIntExtra(ProtectedSandApp.s("幇\u0001"), 0);
    }

    public static int getOutputImageWidth(@o0 Intent intent) {
        return intent.getIntExtra(ProtectedSandApp.s("幈\u0001"), -1);
    }

    public static UCrop of(@o0 Uri uri, @o0 Uri uri2, ArrayList<String> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("幉\u0001"));
        }
        return arrayList.size() == 1 ? new UCrop(uri, uri2) : new UCrop(uri, uri2, arrayList);
    }

    public UCropFragment getFragment() {
        return UCropFragment.newInstance(this.mCropOptionsBundle);
    }

    public Intent getIntent(@o0 Context context) {
        ArrayList<String> stringArrayList = this.mCropOptionsBundle.getStringArrayList(ProtectedSandApp.s("幂\u0001"));
        if (stringArrayList == null || stringArrayList.size() <= 1) {
            this.mCropIntent.setClass(context, UCropActivity.class);
        } else {
            this.mCropIntent.setClass(context, UCropMultipleActivity.class);
        }
        this.mCropIntent.putExtras(this.mCropOptionsBundle);
        return this.mCropIntent;
    }

    public void setImageEngine(UCropImageEngine uCropImageEngine) {
        ArrayList<String> stringArrayList = this.mCropOptionsBundle.getStringArrayList(ProtectedSandApp.s("幂\u0001"));
        boolean z4 = this.mCropOptionsBundle.getBoolean(ProtectedSandApp.s("幊\u0001"), false);
        if (((stringArrayList != null && stringArrayList.size() > 1) || z4) && uCropImageEngine == null) {
            throw new NullPointerException(ProtectedSandApp.s("幋\u0001"));
        }
        UCropDevelopConfig.imageEngine = uCropImageEngine;
    }

    public void start(@o0 Activity activity) {
        start(activity, 69);
    }

    public void startEdit(@o0 Context context, @o0 Fragment fragment, int i4) {
        fragment.startActivityForResult(getIntent(context), i4);
    }

    public UCrop useSourceImageAspectRatio() {
        this.mCropOptionsBundle.putFloat(ProtectedSandApp.s("幌\u0001"), 0.0f);
        this.mCropOptionsBundle.putFloat(ProtectedSandApp.s("幍\u0001"), 0.0f);
        return this;
    }

    public UCrop withAspectRatio(float f4, float f5) {
        this.mCropOptionsBundle.putFloat(ProtectedSandApp.s("幌\u0001"), f4);
        this.mCropOptionsBundle.putFloat(ProtectedSandApp.s("幍\u0001"), f5);
        return this;
    }

    public UCrop withMaxResultSize(@g0(from = 10) int i4, @g0(from = 10) int i5) {
        if (i4 < 10) {
            i4 = 10;
        }
        if (i5 < 10) {
            i5 = 10;
        }
        this.mCropOptionsBundle.putInt(ProtectedSandApp.s("幎\u0001"), i4);
        this.mCropOptionsBundle.putInt(ProtectedSandApp.s("幏\u0001"), i5);
        return this;
    }

    public UCrop withOptions(@o0 Options options) {
        this.mCropOptionsBundle.putAll(options.getOptionBundle());
        return this;
    }

    public UCropFragment getFragment(Bundle bundle) {
        this.mCropOptionsBundle = bundle;
        return getFragment();
    }

    public void start(@o0 Activity activity, int i4) {
        activity.startActivityForResult(getIntent(activity), i4);
    }

    public void start(@o0 Context context, @o0 Fragment fragment) {
        start(context, fragment, 69);
    }

    public void start(@o0 Context context, @o0 Fragment fragment, int i4) {
        fragment.startActivityForResult(getIntent(context), i4);
    }

    private UCrop(@o0 Uri uri, @o0 Uri uri2, ArrayList<String> arrayList) {
        Bundle bundle = new Bundle();
        this.mCropOptionsBundle = bundle;
        bundle.putParcelable(ProtectedSandApp.s("幀\u0001"), uri);
        this.mCropOptionsBundle.putParcelable(ProtectedSandApp.s("幁\u0001"), uri2);
        this.mCropOptionsBundle.putStringArrayList(ProtectedSandApp.s("幂\u0001"), arrayList);
    }

    public static <T> UCrop of(@o0 Uri uri, @o0 Uri uri2) {
        return new UCrop(uri, uri2);
    }
}
