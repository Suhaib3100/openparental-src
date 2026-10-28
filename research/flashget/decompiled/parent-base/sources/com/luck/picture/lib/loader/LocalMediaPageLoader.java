package com.luck.picture.lib.loader;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.media.c;
import android.text.TextUtils;
import androidx.constraintlayout.core.parser.b;
import androidx.fragment.app.k0;
import androidx.room.l0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.luck.picture.lib.config.PictureMimeType;
import com.luck.picture.lib.config.SelectorConfig;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.entity.LocalMediaFolder;
import com.luck.picture.lib.entity.MediaData;
import com.luck.picture.lib.interfaces.OnQueryAlbumListener;
import com.luck.picture.lib.interfaces.OnQueryAllAlbumListener;
import com.luck.picture.lib.interfaces.OnQueryDataResultListener;
import com.luck.picture.lib.interfaces.OnQueryFilterListener;
import com.luck.picture.lib.thread.PictureThreadUtils;
import com.luck.picture.lib.utils.MediaUtils;
import com.luck.picture.lib.utils.PictureFileUtils;
import com.luck.picture.lib.utils.SdkVersionUtils;
import com.luck.picture.lib.utils.SortUtils;
import com.luck.picture.lib.utils.ValueOf;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class LocalMediaPageLoader extends IBridgeMediaLoader {
    public LocalMediaPageLoader(Context context, SelectorConfig selectorConfig) {
        super(context, selectorConfig);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getFirstCoverMimeType(Cursor cursor) {
        return cursor.getString(cursor.getColumnIndexOrThrow(ProtectedSandApp.s("᚜\u0001")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getFirstUri(Cursor cursor) {
        return MediaUtils.getRealPathUri(cursor.getLong(cursor.getColumnIndexOrThrow(ProtectedSandApp.s("\u169d\u0001"))), cursor.getString(cursor.getColumnIndexOrThrow(ProtectedSandApp.s("᚜\u0001"))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getFirstUrl(Cursor cursor) {
        return cursor.getString(cursor.getColumnIndexOrThrow(ProtectedSandApp.s("\u169e\u0001")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getPageSelection(long j4) {
        String durationCondition = getDurationCondition();
        String fileSizeCondition = getFileSizeCondition();
        int i4 = getConfig().chooseMode;
        if (i4 == 0) {
            return getPageSelectionArgsForAllMediaCondition(j4, getImageMimeTypeCondition(), getVideoMimeTypeCondition(), durationCondition, fileSizeCondition);
        }
        if (i4 == 1) {
            return getPageSelectionArgsForImageMediaCondition(j4, getImageMimeTypeCondition(), fileSizeCondition);
        }
        if (i4 == 2) {
            return getPageSelectionArgsForVideoMediaCondition(j4, getVideoMimeTypeCondition(), durationCondition, fileSizeCondition);
        }
        if (i4 != 3) {
            return null;
        }
        return getPageSelectionArgsForAudioMediaCondition(j4, getAudioMimeTypeCondition(), durationCondition, fileSizeCondition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String[] getPageSelectionArgs(long j4) {
        int i4 = getConfig().chooseMode;
        if (i4 == 0) {
            return j4 == -1 ? new String[]{String.valueOf(1), String.valueOf(3)} : new String[]{String.valueOf(1), String.valueOf(3), ValueOf.toString(Long.valueOf(j4))};
        }
        if (i4 == 1) {
            return getSelectionArgsForPageSingleMediaType(1, j4);
        }
        if (i4 == 2) {
            return getSelectionArgsForPageSingleMediaType(3, j4);
        }
        if (i4 != 3) {
            return null;
        }
        return getSelectionArgsForPageSingleMediaType(2, j4);
    }

    private static String getPageSelectionArgsForAllMediaCondition(long j4, String str, String str2, String str3, String str4) {
        StringBuilder a5 = b.a(ProtectedSandApp.s("\u169f\u0001"), str, ProtectedSandApp.s("ᚠ\u0001"), str2, ProtectedSandApp.s("ᚡ\u0001"));
        a5.append(str3);
        a5.append(ProtectedSandApp.s("ᚢ\u0001"));
        if (j4 != -1) {
            return c.a(a5, ProtectedSandApp.s("ᚣ\u0001"), str4);
        }
        a5.append(str4);
        return a5.toString();
    }

    private static String getPageSelectionArgsForAudioMediaCondition(long j4, String str, String str2, String str3) {
        StringBuilder a5 = b.a(ProtectedSandApp.s("\u169f\u0001"), str, ProtectedSandApp.s("ᚡ\u0001"), str2, ProtectedSandApp.s("ᚢ\u0001"));
        if (j4 != -1) {
            return c.a(a5, ProtectedSandApp.s("ᚣ\u0001"), str3);
        }
        a5.append(str3);
        return a5.toString();
    }

    private static String getPageSelectionArgsForImageMediaCondition(long j4, String str, String str2) {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("\u169f\u0001"));
        return j4 == -1 ? k0.a(sb, str, ProtectedSandApp.s("ᚢ\u0001"), str2) : k0.a(sb, str, ProtectedSandApp.s("ᚤ\u0001"), str2);
    }

    private static String getPageSelectionArgsForVideoMediaCondition(long j4, String str, String str2, String str3) {
        StringBuilder a5 = b.a(ProtectedSandApp.s("\u169f\u0001"), str, ProtectedSandApp.s("ᚡ\u0001"), str2, ProtectedSandApp.s("ᚢ\u0001"));
        if (j4 != -1) {
            return c.a(a5, ProtectedSandApp.s("ᚣ\u0001"), str3);
        }
        a5.append(str3);
        return a5.toString();
    }

    private String getSelectionArgsForAllMediaCondition(String str, String str2, String str3, String str4) {
        StringBuilder a5 = b.a(ProtectedSandApp.s("\u169f\u0001"), str3, ProtectedSandApp.s("ᚠ\u0001"), str4, ProtectedSandApp.s("ᚡ\u0001"));
        androidx.concurrent.futures.a.a(a5, str, ProtectedSandApp.s("ᚢ\u0001"), str2);
        if (isWithAllQuery()) {
            return a5.toString();
        }
        a5.append(ProtectedSandApp.s("ᚥ\u0001"));
        return a5.toString();
    }

    private String getSelectionArgsForAudioMediaCondition(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (isWithAllQuery()) {
            return androidx.fragment.app.c.a(sb, ProtectedSandApp.s("ᚦ\u0001"), str2, ProtectedSandApp.s("ᚡ\u0001"), str);
        }
        l0.a(sb, ProtectedSandApp.s("\u169f\u0001"), str2, ProtectedSandApp.s("ᚢ\u0001"), str);
        sb.append(ProtectedSandApp.s("ᚥ\u0001"));
        return sb.toString();
    }

    private String getSelectionArgsForImageMediaCondition(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (isWithAllQuery()) {
            return androidx.fragment.app.c.a(sb, ProtectedSandApp.s("ᚦ\u0001"), str2, ProtectedSandApp.s("ᚡ\u0001"), str);
        }
        l0.a(sb, ProtectedSandApp.s("\u169f\u0001"), str2, ProtectedSandApp.s("ᚢ\u0001"), str);
        sb.append(ProtectedSandApp.s("ᚥ\u0001"));
        return sb.toString();
    }

    private static String[] getSelectionArgsForPageSingleMediaType(int i4, long j4) {
        return j4 == -1 ? new String[]{String.valueOf(i4)} : new String[]{String.valueOf(i4), ValueOf.toString(Long.valueOf(j4))};
    }

    private String getSelectionArgsForVideoMediaCondition(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (isWithAllQuery()) {
            return androidx.fragment.app.c.a(sb, ProtectedSandApp.s("ᚦ\u0001"), str2, ProtectedSandApp.s("ᚡ\u0001"), str);
        }
        l0.a(sb, ProtectedSandApp.s("\u169f\u0001"), str2, ProtectedSandApp.s("ᚢ\u0001"), str);
        sb.append(ProtectedSandApp.s("ᚥ\u0001"));
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isWithAllQuery() {
        if (SdkVersionUtils.isQ()) {
            return true;
        }
        return getConfig().isPageSyncAsCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void synchronousFirstCover(List<LocalMediaFolder> list) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            LocalMediaFolder localMediaFolder = list.get(i4);
            if (localMediaFolder != null) {
                String albumFirstCover = getAlbumFirstCover(localMediaFolder.getBucketId());
                if (!TextUtils.isEmpty(albumFirstCover)) {
                    localMediaFolder.setFirstImagePath(albumFirstCover);
                }
            }
        }
    }

    @Override // com.luck.picture.lib.loader.IBridgeMediaLoader
    public String getAlbumFirstCover(long j4) {
        Cursor cursor;
        Cursor query;
        Cursor cursor2 = null;
        try {
            boolean isR = SdkVersionUtils.isR();
            String s4 = ProtectedSandApp.s("\u169e\u0001");
            String s5 = ProtectedSandApp.s("᚜\u0001");
            String s6 = ProtectedSandApp.s("\u169d\u0001");
            if (isR) {
                query = getContext().getContentResolver().query(IBridgeMediaLoader.QUERY_URI, new String[]{s6, s5, s4}, MediaUtils.createQueryArgsBundle(getPageSelection(j4), getPageSelectionArgs(j4), 1, 0, getSortOrder()), null);
            } else {
                query = getContext().getContentResolver().query(IBridgeMediaLoader.QUERY_URI, new String[]{s6, s5, s4}, getPageSelection(j4), getPageSelectionArgs(j4), getSortOrder() + ProtectedSandApp.s("ᚧ\u0001"));
            }
            if (query != null) {
                try {
                    if (query.getCount() > 0) {
                        if (!query.moveToFirst()) {
                            if (!query.isClosed()) {
                                query.close();
                            }
                            return null;
                        }
                        String realPathUri = SdkVersionUtils.isQ() ? MediaUtils.getRealPathUri(query.getLong(query.getColumnIndexOrThrow(s6)), query.getString(query.getColumnIndexOrThrow(s5))) : query.getString(query.getColumnIndexOrThrow(s4));
                        if (!query.isClosed()) {
                            query.close();
                        }
                        return realPathUri;
                    }
                } catch (Exception e4) {
                    cursor = query;
                    e = e4;
                    try {
                        e.printStackTrace();
                        if (cursor != null && !cursor.isClosed()) {
                            cursor.close();
                        }
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        cursor2 = cursor;
                        if (cursor2 != null && !cursor2.isClosed()) {
                            cursor2.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    cursor2 = query;
                    th = th2;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            }
            if (query != null && !query.isClosed()) {
                query.close();
            }
        } catch (Exception e5) {
            e = e5;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
        }
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
        return TextUtils.isEmpty(getConfig().sortOrder) ? ProtectedSandApp.s("ᚨ\u0001") : getConfig().sortOrder;
    }

    @Override // com.luck.picture.lib.loader.IBridgeMediaLoader
    public void loadAllAlbum(final OnQueryAllAlbumListener<LocalMediaFolder> onQueryAllAlbumListener) {
        PictureThreadUtils.executeByIo(new PictureThreadUtils.SimpleTask<List<LocalMediaFolder>>() { // from class: com.luck.picture.lib.loader.LocalMediaPageLoader.3
            /* JADX WARN: Code restructure failed: missing block: B:10:0x02f8, code lost:
            
                if (r2.isClosed() == false) goto L93;
             */
            /* JADX WARN: Code restructure failed: missing block: B:114:0x02e2, code lost:
            
                if (r2.isClosed() != false) goto L102;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x02e4, code lost:
            
                r2.close();
             */
            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.util.List<com.luck.picture.lib.entity.LocalMediaFolder> doInBackground() {
                /*
                    Method dump skipped, instructions count: 769
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.luck.picture.lib.loader.LocalMediaPageLoader.AnonymousClass3.doInBackground():java.util.List");
            }

            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public void onSuccess(List<LocalMediaFolder> list) {
                PictureThreadUtils.cancel(this);
                LocalMedia.destroyPool();
                OnQueryAllAlbumListener onQueryAllAlbumListener2 = onQueryAllAlbumListener;
                if (onQueryAllAlbumListener2 != null) {
                    onQueryAllAlbumListener2.onComplete(list);
                }
            }
        });
    }

    @Override // com.luck.picture.lib.loader.IBridgeMediaLoader
    public void loadOnlyInAppDirAllMedia(final OnQueryAlbumListener<LocalMediaFolder> onQueryAlbumListener) {
        PictureThreadUtils.executeByIo(new PictureThreadUtils.SimpleTask<LocalMediaFolder>() { // from class: com.luck.picture.lib.loader.LocalMediaPageLoader.2
            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public LocalMediaFolder doInBackground() {
                return SandboxFileLoader.loadInAppSandboxFolderFile(LocalMediaPageLoader.this.getContext(), LocalMediaPageLoader.this.getConfig().sandboxDir);
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
    public void loadPageMediaData(final long j4, final int i4, final int i5, final OnQueryDataResultListener<LocalMedia> onQueryDataResultListener) {
        PictureThreadUtils.executeByIo(new PictureThreadUtils.SimpleTask<MediaData>() { // from class: com.luck.picture.lib.loader.LocalMediaPageLoader.1
            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public MediaData doInBackground() {
                String str;
                ArrayList<LocalMedia> loadInAppSandboxFile;
                Cursor cursor = null;
                try {
                    try {
                        boolean z4 = true;
                        if (SdkVersionUtils.isR()) {
                            String pageSelection = LocalMediaPageLoader.this.getPageSelection(j4);
                            String[] pageSelectionArgs = LocalMediaPageLoader.this.getPageSelectionArgs(j4);
                            int i6 = i5;
                            cursor = LocalMediaPageLoader.this.getContext().getContentResolver().query(IBridgeMediaLoader.QUERY_URI, IBridgeMediaLoader.PROJECTION, MediaUtils.createQueryArgsBundle(pageSelection, pageSelectionArgs, i6, (i4 - 1) * i6, LocalMediaPageLoader.this.getSortOrder()), null);
                        } else {
                            if (i4 == -1) {
                                str = LocalMediaPageLoader.this.getSortOrder();
                            } else {
                                str = LocalMediaPageLoader.this.getSortOrder() + ProtectedSandApp.s("ᚔ\u0001") + i5 + ProtectedSandApp.s("ᚕ\u0001") + ((i4 - 1) * i5);
                            }
                            cursor = LocalMediaPageLoader.this.getContext().getContentResolver().query(IBridgeMediaLoader.QUERY_URI, IBridgeMediaLoader.PROJECTION, LocalMediaPageLoader.this.getPageSelection(j4), LocalMediaPageLoader.this.getPageSelectionArgs(j4), str);
                        }
                        if (cursor == null) {
                            if (cursor != null && !cursor.isClosed()) {
                                cursor.close();
                            }
                            return new MediaData();
                        }
                        ArrayList arrayList = new ArrayList();
                        if (cursor.getCount() > 0) {
                            cursor.moveToFirst();
                            do {
                                LocalMedia parseLocalMedia = LocalMediaPageLoader.this.parseLocalMedia(cursor, false);
                                if (parseLocalMedia != null) {
                                    arrayList.add(parseLocalMedia);
                                }
                            } while (cursor.moveToNext());
                        }
                        if (j4 == -1 && i4 == 1 && (loadInAppSandboxFile = SandboxFileLoader.loadInAppSandboxFile(LocalMediaPageLoader.this.getContext(), LocalMediaPageLoader.this.getConfig().sandboxDir)) != null) {
                            arrayList.addAll(loadInAppSandboxFile);
                            SortUtils.sortLocalMediaAddedTime(arrayList);
                        }
                        if (cursor.getCount() <= 0) {
                            z4 = false;
                        }
                        MediaData mediaData = new MediaData(z4, arrayList);
                        if (!cursor.isClosed()) {
                            cursor.close();
                        }
                        return mediaData;
                    } catch (Exception e4) {
                        e4.printStackTrace();
                        String str2 = IBridgeMediaLoader.TAG;
                        e4.getMessage();
                        MediaData mediaData2 = new MediaData();
                        if (cursor != null && !cursor.isClosed()) {
                            cursor.close();
                        }
                        return mediaData2;
                    }
                } catch (Throwable th) {
                    if (cursor != null && !cursor.isClosed()) {
                        cursor.close();
                    }
                    throw th;
                }
            }

            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public void onSuccess(MediaData mediaData) {
                PictureThreadUtils.cancel(this);
                OnQueryDataResultListener onQueryDataResultListener2 = onQueryDataResultListener;
                if (onQueryDataResultListener2 != null) {
                    ArrayList<LocalMedia> arrayList = mediaData.data;
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    onQueryDataResultListener2.onComplete(arrayList, mediaData.isHasNextMore);
                }
            }
        });
    }

    @Override // com.luck.picture.lib.loader.IBridgeMediaLoader
    protected LocalMedia parseLocalMedia(Cursor cursor, boolean z4) {
        String str;
        int i4;
        long j4;
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
        long j5 = cursor.getLong(columnIndexOrThrow);
        String string = cursor.getString(columnIndexOrThrow3);
        String string2 = cursor.getString(columnIndexOrThrow2);
        String realPathUri = SdkVersionUtils.isQ() ? MediaUtils.getRealPathUri(j5, string) : string2;
        if (TextUtils.isEmpty(string)) {
            string = PictureMimeType.ofJPEG();
        }
        if (getConfig().isFilterInvalidFile) {
            if (PictureMimeType.isHasImage(string)) {
                if (!TextUtils.isEmpty(string2) && !PictureFileUtils.isImageFileExists(string2)) {
                    return null;
                }
            } else if (!PictureFileUtils.isFileExists(string2)) {
                return null;
            }
        }
        String s4 = ProtectedSandApp.s("ᚩ\u0001");
        if (string.endsWith(s4)) {
            string = MediaUtils.getMimeTypeFromMediaUrl(string2);
            str = realPathUri;
            if (!getConfig().isGif && PictureMimeType.isHasGif(string)) {
                return null;
            }
        } else {
            str = realPathUri;
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
        int i5 = cursor.getInt(columnIndexOrThrow4);
        int i6 = cursor.getInt(columnIndexOrThrow5);
        int i7 = cursor.getInt(columnIndexOrThrow12);
        if (i7 == 90 || i7 == 270) {
            i4 = cursor.getInt(columnIndexOrThrow5);
            i6 = cursor.getInt(columnIndexOrThrow4);
        } else {
            i4 = i5;
        }
        long j6 = cursor.getLong(columnIndexOrThrow6);
        long j7 = cursor.getLong(columnIndexOrThrow7);
        String string3 = cursor.getString(columnIndexOrThrow8);
        String string4 = cursor.getString(columnIndexOrThrow9);
        long j10 = cursor.getLong(columnIndexOrThrow10);
        long j11 = cursor.getLong(columnIndexOrThrow11);
        if (TextUtils.isEmpty(string4)) {
            string4 = PictureMimeType.getUrlToFileName(string2);
        }
        if (getConfig().isFilterSizeDuration && j7 > 0 && j7 < 1024) {
            return null;
        }
        if (PictureMimeType.isHasVideo(string) || PictureMimeType.isHasAudio(string)) {
            if (getConfig().filterVideoMinSecond > 0) {
                j4 = j11;
                if (j6 < getConfig().filterVideoMinSecond) {
                    return null;
                }
            } else {
                j4 = j11;
            }
            if (getConfig().filterVideoMaxSecond > 0 && j6 > getConfig().filterVideoMaxSecond) {
                return null;
            }
            if (getConfig().isFilterSizeDuration && j6 <= 0) {
                return null;
            }
        } else {
            j4 = j11;
        }
        LocalMedia obtain = z4 ? LocalMedia.obtain() : LocalMedia.create();
        obtain.setId(j5);
        obtain.setBucketId(j10);
        obtain.setPath(str);
        obtain.setRealPath(string2);
        obtain.setFileName(string4);
        obtain.setParentFolderName(string3);
        obtain.setDuration(j6);
        obtain.setChooseModel(getConfig().chooseMode);
        obtain.setMimeType(string);
        obtain.setWidth(i4);
        obtain.setHeight(i6);
        obtain.setSize(j7);
        obtain.setDateAddedTime(j4);
        OnQueryFilterListener onQueryFilterListener = this.mConfig.onQueryFilterListener;
        if (onQueryFilterListener == null || !onQueryFilterListener.onFilter(obtain)) {
            return obtain;
        }
        return null;
    }
}
