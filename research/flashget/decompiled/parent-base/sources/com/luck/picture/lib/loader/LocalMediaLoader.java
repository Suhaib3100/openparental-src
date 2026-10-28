package com.luck.picture.lib.loader;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.constraintlayout.core.parser.b;
import androidx.fragment.app.k0;
import androidx.fragment.app.y;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.luck.picture.lib.config.PictureMimeType;
import com.luck.picture.lib.config.SelectorConfig;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.entity.LocalMediaFolder;
import com.luck.picture.lib.interfaces.OnQueryAlbumListener;
import com.luck.picture.lib.interfaces.OnQueryAllAlbumListener;
import com.luck.picture.lib.interfaces.OnQueryDataResultListener;
import com.luck.picture.lib.interfaces.OnQueryFilterListener;
import com.luck.picture.lib.thread.PictureThreadUtils;
import com.luck.picture.lib.utils.MediaUtils;
import com.luck.picture.lib.utils.SdkVersionUtils;
import java.util.List;

/* loaded from: classes6.dex */
public final class LocalMediaLoader extends IBridgeMediaLoader {
    public LocalMediaLoader(Context context, SelectorConfig selectorConfig) {
        super(context, selectorConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public LocalMediaFolder getImageFolder(String str, String str2, String str3, List<LocalMediaFolder> list) {
        for (LocalMediaFolder localMediaFolder : list) {
            String folderName = localMediaFolder.getFolderName();
            if (!TextUtils.isEmpty(folderName) && TextUtils.equals(folderName, str3)) {
                return localMediaFolder;
            }
        }
        LocalMediaFolder localMediaFolder2 = new LocalMediaFolder();
        localMediaFolder2.setFolderName(str3);
        localMediaFolder2.setFirstImagePath(str);
        localMediaFolder2.setFirstMimeType(str2);
        list.add(localMediaFolder2);
        return localMediaFolder2;
    }

    private static String getSelectionArgsForAllMediaCondition(String str, String str2, String str3, String str4) {
        return k0.a(b.a(ProtectedSandApp.s("ᚍ\u0001"), str3, ProtectedSandApp.s("ᚎ\u0001"), str4, ProtectedSandApp.s("ᚏ\u0001")), str, ProtectedSandApp.s("ᚐ\u0001"), str2);
    }

    private static String getSelectionArgsForAudioMediaCondition(String str, String str2) {
        return y.a(ProtectedSandApp.s("ᚑ\u0001"), str2, ProtectedSandApp.s("ᚏ\u0001"), str);
    }

    private static String getSelectionArgsForImageMediaCondition(String str, String str2) {
        return y.a(ProtectedSandApp.s("ᚑ\u0001"), str2, ProtectedSandApp.s("ᚏ\u0001"), str);
    }

    private static String getSelectionArgsForVideoMediaCondition(String str, String str2) {
        return y.a(ProtectedSandApp.s("ᚑ\u0001"), str2, ProtectedSandApp.s("ᚏ\u0001"), str);
    }

    @Override // com.luck.picture.lib.loader.IBridgeMediaLoader
    public String getAlbumFirstCover(long j4) {
        return null;
    }

    @Override // com.luck.picture.lib.loader.IBridgeMediaLoader
    protected String getSelection() {
        String durationCondition = getDurationCondition();
        String fileSizeCondition = getFileSizeCondition();
        int i4 = getConfig().chooseMode;
        if (i4 == 0) {
            return getSelectionArgsForAllMediaCondition(durationCondition, fileSizeCondition, getImageMimeTypeCondition(), getVideoMimeTypeCondition());
        }
        if (i4 == 1) {
            return getSelectionArgsForImageMediaCondition(fileSizeCondition, getImageMimeTypeCondition());
        }
        if (i4 == 2) {
            return getSelectionArgsForVideoMediaCondition(durationCondition, getVideoMimeTypeCondition());
        }
        if (i4 != 3) {
            return null;
        }
        return getSelectionArgsForAudioMediaCondition(durationCondition, getAudioMimeTypeCondition());
    }

    @Override // com.luck.picture.lib.loader.IBridgeMediaLoader
    protected String[] getSelectionArgs() {
        int i4 = getConfig().chooseMode;
        if (i4 == 0) {
            return new String[]{String.valueOf(1), String.valueOf(3)};
        }
        if (i4 == 1) {
            return new String[]{String.valueOf(1)};
        }
        if (i4 == 2) {
            return new String[]{String.valueOf(3)};
        }
        if (i4 != 3) {
            return null;
        }
        return new String[]{String.valueOf(2)};
    }

    @Override // com.luck.picture.lib.loader.IBridgeMediaLoader
    protected String getSortOrder() {
        return TextUtils.isEmpty(getConfig().sortOrder) ? ProtectedSandApp.s("ᚒ\u0001") : getConfig().sortOrder;
    }

    @Override // com.luck.picture.lib.loader.IBridgeMediaLoader
    public void loadAllAlbum(final OnQueryAllAlbumListener<LocalMediaFolder> onQueryAllAlbumListener) {
        PictureThreadUtils.executeByIo(new PictureThreadUtils.SimpleTask<List<LocalMediaFolder>>() { // from class: com.luck.picture.lib.loader.LocalMediaLoader.1
            /* JADX WARN: Code restructure failed: missing block: B:46:0x014c, code lost:
            
                if (r1.isClosed() != false) goto L49;
             */
            /* JADX WARN: Code restructure failed: missing block: B:6:0x0162, code lost:
            
                if (r1.isClosed() == false) goto L40;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x014e, code lost:
            
                r1.close();
             */
            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.util.List<com.luck.picture.lib.entity.LocalMediaFolder> doInBackground() {
                /*
                    Method dump skipped, instructions count: 358
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.luck.picture.lib.loader.LocalMediaLoader.AnonymousClass1.doInBackground():java.util.List");
            }

            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public void onSuccess(List<LocalMediaFolder> list) {
                PictureThreadUtils.cancel(this);
                OnQueryAllAlbumListener onQueryAllAlbumListener2 = onQueryAllAlbumListener;
                if (onQueryAllAlbumListener2 != null) {
                    onQueryAllAlbumListener2.onComplete(list);
                }
            }
        });
    }

    @Override // com.luck.picture.lib.loader.IBridgeMediaLoader
    public void loadOnlyInAppDirAllMedia(final OnQueryAlbumListener<LocalMediaFolder> onQueryAlbumListener) {
        PictureThreadUtils.executeByIo(new PictureThreadUtils.SimpleTask<LocalMediaFolder>() { // from class: com.luck.picture.lib.loader.LocalMediaLoader.2
            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public LocalMediaFolder doInBackground() {
                return SandboxFileLoader.loadInAppSandboxFolderFile(LocalMediaLoader.this.getContext(), LocalMediaLoader.this.getConfig().sandboxDir);
            }

            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public void onSuccess(LocalMediaFolder localMediaFolder) {
                PictureThreadUtils.cancel(this);
                OnQueryAlbumListener onQueryAlbumListener2 = onQueryAlbumListener;
                if (onQueryAlbumListener2 != null) {
                    onQueryAlbumListener2.onComplete(localMediaFolder);
                }
            }
        });
    }

    @Override // com.luck.picture.lib.loader.IBridgeMediaLoader
    public void loadPageMediaData(long j4, int i4, int i5, OnQueryDataResultListener<LocalMedia> onQueryDataResultListener) {
    }

    @Override // com.luck.picture.lib.loader.IBridgeMediaLoader
    protected LocalMedia parseLocalMedia(Cursor cursor, boolean z4) {
        long j4;
        long j5;
        String[] strArr = IBridgeMediaLoader.PROJECTION;
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(strArr[0]);
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow(strArr[1]);
        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow(strArr[2]);
        int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow(strArr[3]);
        int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow(strArr[4]);
        int columnIndexOrThrow6 = cursor.getColumnIndexOrThrow(strArr[5]);
        int columnIndexOrThrow7 = cursor.getColumnIndexOrThrow(strArr[6]);
        int columnIndexOrThrow8 = cursor.getColumnIndexOrThrow(strArr[7]);
        int columnIndexOrThrow9 = cursor.getColumnIndexOrThrow(strArr[8]);
        int columnIndexOrThrow10 = cursor.getColumnIndexOrThrow(strArr[9]);
        int columnIndexOrThrow11 = cursor.getColumnIndexOrThrow(strArr[10]);
        int columnIndexOrThrow12 = cursor.getColumnIndexOrThrow(strArr[11]);
        long j6 = cursor.getLong(columnIndexOrThrow);
        long j7 = cursor.getLong(columnIndexOrThrow11);
        String string = cursor.getString(columnIndexOrThrow3);
        String string2 = cursor.getString(columnIndexOrThrow2);
        String realPathUri = SdkVersionUtils.isQ() ? MediaUtils.getRealPathUri(j6, string) : string2;
        if (TextUtils.isEmpty(string)) {
            string = PictureMimeType.ofJPEG();
        }
        String s4 = ProtectedSandApp.s("ᚓ\u0001");
        if (string.endsWith(s4)) {
            string = MediaUtils.getMimeTypeFromMediaUrl(string2);
            j4 = j7;
            if (!getConfig().isGif && PictureMimeType.isHasGif(string)) {
                return null;
            }
        } else {
            j4 = j7;
        }
        if (string.endsWith(s4)) {
            return null;
        }
        if (!getConfig().isWebp && string.startsWith(PictureMimeType.ofWEBP())) {
            return null;
        }
        if (!getConfig().isBmp && PictureMimeType.isHasBmp(string)) {
            return null;
        }
        if (!getConfig().isHeic && PictureMimeType.isHasHeic(string)) {
            return null;
        }
        int i4 = cursor.getInt(columnIndexOrThrow4);
        int i5 = cursor.getInt(columnIndexOrThrow5);
        int i6 = cursor.getInt(columnIndexOrThrow12);
        if (i6 == 90 || i6 == 270) {
            i4 = cursor.getInt(columnIndexOrThrow5);
            i5 = cursor.getInt(columnIndexOrThrow4);
        }
        long j10 = cursor.getLong(columnIndexOrThrow6);
        long j11 = cursor.getLong(columnIndexOrThrow7);
        String string3 = cursor.getString(columnIndexOrThrow8);
        String string4 = cursor.getString(columnIndexOrThrow9);
        int i7 = i4;
        long j12 = cursor.getLong(columnIndexOrThrow10);
        if (TextUtils.isEmpty(string4)) {
            string4 = PictureMimeType.getUrlToFileName(string2);
        }
        if (getConfig().isFilterSizeDuration && j11 > 0 && j11 < 1024) {
            return null;
        }
        if (PictureMimeType.isHasVideo(string) || PictureMimeType.isHasAudio(string)) {
            if (getConfig().filterVideoMinSecond > 0) {
                j5 = j11;
                if (j10 < getConfig().filterVideoMinSecond) {
                    return null;
                }
            } else {
                j5 = j11;
            }
            if (getConfig().filterVideoMaxSecond > 0 && j10 > getConfig().filterVideoMaxSecond) {
                return null;
            }
            if (getConfig().isFilterSizeDuration && j10 <= 0) {
                return null;
            }
        } else {
            j5 = j11;
        }
        LocalMedia create = LocalMedia.create();
        create.setId(j6);
        create.setBucketId(j12);
        create.setPath(realPathUri);
        create.setRealPath(string2);
        create.setFileName(string4);
        create.setParentFolderName(string3);
        create.setDuration(j10);
        create.setChooseModel(getConfig().chooseMode);
        create.setMimeType(string);
        create.setWidth(i7);
        create.setHeight(i5);
        create.setSize(j5);
        create.setDateAddedTime(j4);
        OnQueryFilterListener onQueryFilterListener = this.mConfig.onQueryFilterListener;
        if (onQueryFilterListener == null || !onQueryFilterListener.onFilter(create)) {
            return create;
        }
        return null;
    }
}
