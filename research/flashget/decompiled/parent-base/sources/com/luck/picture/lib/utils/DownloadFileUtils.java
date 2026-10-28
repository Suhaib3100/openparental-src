package com.luck.picture.lib.utils;

import android.content.Context;
import com.luck.picture.lib.interfaces.OnCallbackListener;
import com.luck.picture.lib.thread.PictureThreadUtils;

/* loaded from: classes6.dex */
public class DownloadFileUtils {
    public static void saveLocalFile(final Context context, final String str, final String str2, final OnCallbackListener<String> onCallbackListener) {
        PictureThreadUtils.executeByIo(new PictureThreadUtils.SimpleTask<String>() { // from class: com.luck.picture.lib.utils.DownloadFileUtils.1
            /* JADX WARN: Removed duplicated region for block: B:16:0x0090 A[Catch: Exception -> 0x007e, TryCatch #0 {Exception -> 0x007e, blocks: (B:3:0x0012, B:6:0x005b, B:8:0x006a, B:10:0x0072, B:13:0x007b, B:14:0x0087, B:16:0x0090, B:17:0x00de, B:19:0x022a, B:21:0x0232, B:22:0x025a, B:24:0x0266, B:29:0x023e, B:31:0x0246, B:32:0x0253, B:34:0x0099, B:36:0x00a3, B:37:0x00b6, B:38:0x00aa, B:39:0x0081, B:40:0x00ec, B:43:0x00fa, B:45:0x0109, B:47:0x0111, B:50:0x011a, B:51:0x0123, B:53:0x012c, B:54:0x017a, B:55:0x0135, B:57:0x013f, B:58:0x0152, B:59:0x0146, B:60:0x011d, B:61:0x0188, B:63:0x0197, B:65:0x019f, B:68:0x01a8, B:69:0x01b1, B:71:0x01ba, B:72:0x021c, B:73:0x01c7, B:75:0x01cf, B:77:0x01d7, B:79:0x01e1, B:80:0x01f4, B:81:0x01e8, B:82:0x01ab), top: B:2:0x0012 }] */
            /* JADX WARN: Removed duplicated region for block: B:34:0x0099 A[Catch: Exception -> 0x007e, TryCatch #0 {Exception -> 0x007e, blocks: (B:3:0x0012, B:6:0x005b, B:8:0x006a, B:10:0x0072, B:13:0x007b, B:14:0x0087, B:16:0x0090, B:17:0x00de, B:19:0x022a, B:21:0x0232, B:22:0x025a, B:24:0x0266, B:29:0x023e, B:31:0x0246, B:32:0x0253, B:34:0x0099, B:36:0x00a3, B:37:0x00b6, B:38:0x00aa, B:39:0x0081, B:40:0x00ec, B:43:0x00fa, B:45:0x0109, B:47:0x0111, B:50:0x011a, B:51:0x0123, B:53:0x012c, B:54:0x017a, B:55:0x0135, B:57:0x013f, B:58:0x0152, B:59:0x0146, B:60:0x011d, B:61:0x0188, B:63:0x0197, B:65:0x019f, B:68:0x01a8, B:69:0x01b1, B:71:0x01ba, B:72:0x021c, B:73:0x01c7, B:75:0x01cf, B:77:0x01d7, B:79:0x01e1, B:80:0x01f4, B:81:0x01e8, B:82:0x01ab), top: B:2:0x0012 }] */
            /* JADX WARN: Removed duplicated region for block: B:53:0x012c A[Catch: Exception -> 0x007e, TryCatch #0 {Exception -> 0x007e, blocks: (B:3:0x0012, B:6:0x005b, B:8:0x006a, B:10:0x0072, B:13:0x007b, B:14:0x0087, B:16:0x0090, B:17:0x00de, B:19:0x022a, B:21:0x0232, B:22:0x025a, B:24:0x0266, B:29:0x023e, B:31:0x0246, B:32:0x0253, B:34:0x0099, B:36:0x00a3, B:37:0x00b6, B:38:0x00aa, B:39:0x0081, B:40:0x00ec, B:43:0x00fa, B:45:0x0109, B:47:0x0111, B:50:0x011a, B:51:0x0123, B:53:0x012c, B:54:0x017a, B:55:0x0135, B:57:0x013f, B:58:0x0152, B:59:0x0146, B:60:0x011d, B:61:0x0188, B:63:0x0197, B:65:0x019f, B:68:0x01a8, B:69:0x01b1, B:71:0x01ba, B:72:0x021c, B:73:0x01c7, B:75:0x01cf, B:77:0x01d7, B:79:0x01e1, B:80:0x01f4, B:81:0x01e8, B:82:0x01ab), top: B:2:0x0012 }] */
            /* JADX WARN: Removed duplicated region for block: B:55:0x0135 A[Catch: Exception -> 0x007e, TryCatch #0 {Exception -> 0x007e, blocks: (B:3:0x0012, B:6:0x005b, B:8:0x006a, B:10:0x0072, B:13:0x007b, B:14:0x0087, B:16:0x0090, B:17:0x00de, B:19:0x022a, B:21:0x0232, B:22:0x025a, B:24:0x0266, B:29:0x023e, B:31:0x0246, B:32:0x0253, B:34:0x0099, B:36:0x00a3, B:37:0x00b6, B:38:0x00aa, B:39:0x0081, B:40:0x00ec, B:43:0x00fa, B:45:0x0109, B:47:0x0111, B:50:0x011a, B:51:0x0123, B:53:0x012c, B:54:0x017a, B:55:0x0135, B:57:0x013f, B:58:0x0152, B:59:0x0146, B:60:0x011d, B:61:0x0188, B:63:0x0197, B:65:0x019f, B:68:0x01a8, B:69:0x01b1, B:71:0x01ba, B:72:0x021c, B:73:0x01c7, B:75:0x01cf, B:77:0x01d7, B:79:0x01e1, B:80:0x01f4, B:81:0x01e8, B:82:0x01ab), top: B:2:0x0012 }] */
            /* JADX WARN: Removed duplicated region for block: B:71:0x01ba A[Catch: Exception -> 0x007e, TryCatch #0 {Exception -> 0x007e, blocks: (B:3:0x0012, B:6:0x005b, B:8:0x006a, B:10:0x0072, B:13:0x007b, B:14:0x0087, B:16:0x0090, B:17:0x00de, B:19:0x022a, B:21:0x0232, B:22:0x025a, B:24:0x0266, B:29:0x023e, B:31:0x0246, B:32:0x0253, B:34:0x0099, B:36:0x00a3, B:37:0x00b6, B:38:0x00aa, B:39:0x0081, B:40:0x00ec, B:43:0x00fa, B:45:0x0109, B:47:0x0111, B:50:0x011a, B:51:0x0123, B:53:0x012c, B:54:0x017a, B:55:0x0135, B:57:0x013f, B:58:0x0152, B:59:0x0146, B:60:0x011d, B:61:0x0188, B:63:0x0197, B:65:0x019f, B:68:0x01a8, B:69:0x01b1, B:71:0x01ba, B:72:0x021c, B:73:0x01c7, B:75:0x01cf, B:77:0x01d7, B:79:0x01e1, B:80:0x01f4, B:81:0x01e8, B:82:0x01ab), top: B:2:0x0012 }] */
            /* JADX WARN: Removed duplicated region for block: B:73:0x01c7 A[Catch: Exception -> 0x007e, TryCatch #0 {Exception -> 0x007e, blocks: (B:3:0x0012, B:6:0x005b, B:8:0x006a, B:10:0x0072, B:13:0x007b, B:14:0x0087, B:16:0x0090, B:17:0x00de, B:19:0x022a, B:21:0x0232, B:22:0x025a, B:24:0x0266, B:29:0x023e, B:31:0x0246, B:32:0x0253, B:34:0x0099, B:36:0x00a3, B:37:0x00b6, B:38:0x00aa, B:39:0x0081, B:40:0x00ec, B:43:0x00fa, B:45:0x0109, B:47:0x0111, B:50:0x011a, B:51:0x0123, B:53:0x012c, B:54:0x017a, B:55:0x0135, B:57:0x013f, B:58:0x0152, B:59:0x0146, B:60:0x011d, B:61:0x0188, B:63:0x0197, B:65:0x019f, B:68:0x01a8, B:69:0x01b1, B:71:0x01ba, B:72:0x021c, B:73:0x01c7, B:75:0x01cf, B:77:0x01d7, B:79:0x01e1, B:80:0x01f4, B:81:0x01e8, B:82:0x01ab), top: B:2:0x0012 }] */
            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.String doInBackground() {
                /*
                    Method dump skipped, instructions count: 626
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.luck.picture.lib.utils.DownloadFileUtils.AnonymousClass1.doInBackground():java.lang.String");
            }

            @Override // com.luck.picture.lib.thread.PictureThreadUtils.Task
            public void onSuccess(String str3) {
                PictureThreadUtils.cancel(this);
                OnCallbackListener onCallbackListener2 = onCallbackListener;
                if (onCallbackListener2 != null) {
                    onCallbackListener2.onCall(str3);
                }
            }
        });
    }
}
