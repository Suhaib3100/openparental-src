package com.luck.picture.lib.loader;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.luck.picture.lib.config.PictureMimeType;
import com.luck.picture.lib.config.SelectorConfig;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.entity.LocalMediaFolder;
import com.luck.picture.lib.interfaces.OnQueryAlbumListener;
import com.luck.picture.lib.interfaces.OnQueryAllAlbumListener;
import com.luck.picture.lib.interfaces.OnQueryDataResultListener;
import java.util.List;
import java.util.Locale;

/* loaded from: classes6.dex */
public abstract class IBridgeMediaLoader {
    protected static final int MAX_SORT_SIZE = 60;
    protected final SelectorConfig mConfig;
    private final Context mContext;
    protected static final String COLUMN_BUCKET_DISPLAY_NAME = ProtectedSandApp.s("ᙬ\u0001");
    protected static final String COLUMN_DURATION = ProtectedSandApp.s("᙭\u0001");
    protected static final String NOT_VND_WAP_BMP = ProtectedSandApp.s("᙮\u0001");
    protected static final String DISTINCT_BUCKET_Id = ProtectedSandApp.s("ᙯ\u0001");
    protected static final String NOT_WEBP = ProtectedSandApp.s("ᙰ\u0001");
    protected static final String COLUMN_COUNT = ProtectedSandApp.s("ᙱ\u0001");
    protected static final String ORDER_BY = ProtectedSandApp.s("ᙲ\u0001");
    protected static final String COLUMN_ORIENTATION = ProtectedSandApp.s("ᙳ\u0001");
    protected static final String COLUMN_BUCKET_ID = ProtectedSandApp.s("ᙴ\u0001");
    protected static final String NOT_GIF = ProtectedSandApp.s("ᙵ\u0001");
    protected static final String NOT_HEIC = ProtectedSandApp.s("ᙶ\u0001");
    protected static final String NOT_BMP = ProtectedSandApp.s("ᙷ\u0001");
    protected static final String NOT_XMS_BMP = ProtectedSandApp.s("ᙸ\u0001");
    protected static final String TAG = ProtectedSandApp.s("ᙹ\u0001");
    protected static final String GROUP_BY_BUCKET_Id = ProtectedSandApp.s("ᙺ\u0001");
    protected static final Uri QUERY_URI = MediaStore.Files.getContentUri(ProtectedSandApp.s("ᙻ\u0001"));
    protected static final String[] PROJECTION = {ProtectedSandApp.s("ᙽ\u0001"), ProtectedSandApp.s("ᙾ\u0001"), ProtectedSandApp.s("ᙿ\u0001"), ProtectedSandApp.s("\u1680\u0001"), ProtectedSandApp.s("ᚁ\u0001"), ProtectedSandApp.s("᙭\u0001"), ProtectedSandApp.s("ᚂ\u0001"), ProtectedSandApp.s("ᙬ\u0001"), ProtectedSandApp.s("ᚃ\u0001"), ProtectedSandApp.s("ᙴ\u0001"), ProtectedSandApp.s("ᙼ\u0001"), ProtectedSandApp.s("ᙳ\u0001")};
    protected static final String[] ALL_PROJECTION = {ProtectedSandApp.s("ᙽ\u0001"), ProtectedSandApp.s("ᙾ\u0001"), ProtectedSandApp.s("ᙿ\u0001"), ProtectedSandApp.s("\u1680\u0001"), ProtectedSandApp.s("ᚁ\u0001"), ProtectedSandApp.s("᙭\u0001"), ProtectedSandApp.s("ᚂ\u0001"), ProtectedSandApp.s("ᙬ\u0001"), ProtectedSandApp.s("ᚃ\u0001"), ProtectedSandApp.s("ᙴ\u0001"), ProtectedSandApp.s("ᙼ\u0001"), ProtectedSandApp.s("ᙳ\u0001"), ProtectedSandApp.s("ᚄ\u0001")};

    public IBridgeMediaLoader(Context context, SelectorConfig selectorConfig) {
        this.mContext = context;
        this.mConfig = selectorConfig;
    }

    public abstract String getAlbumFirstCover(long j4);

    protected String getAudioMimeTypeCondition() {
        List<String> list = getConfig().queryOnlyAudioList;
        StringBuilder sb = new StringBuilder();
        int i4 = 0;
        while (i4 < list.size()) {
            String str = list.get(i4);
            sb.append(i4 == 0 ? ProtectedSandApp.s("ᚅ\u0001") : ProtectedSandApp.s("ᚆ\u0001"));
            sb.append(ProtectedSandApp.s("ᚇ\u0001"));
            sb.append(str);
            sb.append(ProtectedSandApp.s("ᚈ\u0001"));
            i4++;
        }
        return sb.toString();
    }

    protected SelectorConfig getConfig() {
        return this.mConfig;
    }

    protected Context getContext() {
        return this.mContext;
    }

    protected String getDurationCondition() {
        return String.format(Locale.CHINA, ProtectedSandApp.s("ᚊ\u0001"), Long.valueOf(Math.max(0L, getConfig().filterVideoMinSecond)), ProtectedSandApp.s("ᚉ\u0001"), Long.valueOf(getConfig().filterVideoMaxSecond == 0 ? Long.MAX_VALUE : getConfig().filterVideoMaxSecond));
    }

    protected String getFileSizeCondition() {
        return String.format(Locale.CHINA, ProtectedSandApp.s("ᚋ\u0001"), Long.valueOf(Math.max(0L, getConfig().filterMinFileSize)), ProtectedSandApp.s("ᚉ\u0001"), Long.valueOf(getConfig().filterMaxFileSize == 0 ? Long.MAX_VALUE : getConfig().filterMaxFileSize));
    }

    protected String getImageMimeTypeCondition() {
        List<String> list = getConfig().queryOnlyImageList;
        StringBuilder sb = new StringBuilder();
        int i4 = 0;
        while (i4 < list.size()) {
            String str = list.get(i4);
            sb.append(i4 == 0 ? ProtectedSandApp.s("ᚅ\u0001") : ProtectedSandApp.s("ᚆ\u0001"));
            sb.append(ProtectedSandApp.s("ᚇ\u0001"));
            sb.append(str);
            sb.append(ProtectedSandApp.s("ᚈ\u0001"));
            i4++;
        }
        if (!getConfig().isGif && !getConfig().queryOnlyImageList.contains(PictureMimeType.ofGIF())) {
            sb.append(ProtectedSandApp.s("ᙵ\u0001"));
        }
        if (!getConfig().isWebp && !getConfig().queryOnlyImageList.contains(PictureMimeType.ofWEBP())) {
            sb.append(ProtectedSandApp.s("ᙰ\u0001"));
        }
        if (!getConfig().isBmp && !getConfig().queryOnlyImageList.contains(PictureMimeType.ofBMP()) && !getConfig().queryOnlyImageList.contains(PictureMimeType.ofXmsBMP()) && !getConfig().queryOnlyImageList.contains(PictureMimeType.ofWapBMP())) {
            sb.append(ProtectedSandApp.s("ᚌ\u0001"));
        }
        if (!getConfig().isHeic && !getConfig().queryOnlyImageList.contains(PictureMimeType.ofHeic())) {
            sb.append(ProtectedSandApp.s("ᙶ\u0001"));
        }
        return sb.toString();
    }

    protected abstract String getSelection();

    protected abstract String[] getSelectionArgs();

    protected abstract String getSortOrder();

    protected String getVideoMimeTypeCondition() {
        List<String> list = getConfig().queryOnlyVideoList;
        StringBuilder sb = new StringBuilder();
        int i4 = 0;
        while (i4 < list.size()) {
            String str = list.get(i4);
            sb.append(i4 == 0 ? ProtectedSandApp.s("ᚅ\u0001") : ProtectedSandApp.s("ᚆ\u0001"));
            sb.append(ProtectedSandApp.s("ᚇ\u0001"));
            sb.append(str);
            sb.append(ProtectedSandApp.s("ᚈ\u0001"));
            i4++;
        }
        return sb.toString();
    }

    public abstract void loadAllAlbum(OnQueryAllAlbumListener<LocalMediaFolder> onQueryAllAlbumListener);

    public abstract void loadOnlyInAppDirAllMedia(OnQueryAlbumListener<LocalMediaFolder> onQueryAlbumListener);

    public abstract void loadPageMediaData(long j4, int i4, int i5, OnQueryDataResultListener<LocalMedia> onQueryDataResultListener);

    protected abstract LocalMedia parseLocalMedia(Cursor cursor, boolean z4);
}
