package com.tencent.cos.xml.model.tag;

import android.support.v4.media.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.List;

/* loaded from: classes7.dex */
public class DeleteResult {
    public List<Deleted> deletedList;
    public List<Error> errorList;

    public static class Deleted {
        public boolean deleteMarker;
        public String deleteMarkerVersionId;
        public String key;
        public String versionId;

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䨎\u0001"));
            sb.append(this.key);
            sb.append(ProtectedSandApp.s("䨏\u0001"));
            sb.append(this.versionId);
            sb.append(ProtectedSandApp.s("䨐\u0001"));
            sb.append(this.deleteMarker);
            sb.append(ProtectedSandApp.s("䨑\u0001"));
            return c.a(sb, this.deleteMarkerVersionId, ProtectedSandApp.s("䨒\u0001"));
        }
    }

    public static class Error {
        public String code;
        public String key;
        public String message;
        public String versionId;

        public String toString() {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䨓\u0001"));
            sb.append(this.key);
            sb.append(ProtectedSandApp.s("䨔\u0001"));
            sb.append(this.code);
            sb.append(ProtectedSandApp.s("䨕\u0001"));
            sb.append(this.message);
            sb.append(ProtectedSandApp.s("䨖\u0001"));
            return c.a(sb, this.versionId, ProtectedSandApp.s("䨗\u0001"));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("䨘\u0001"));
        List<Deleted> list = this.deletedList;
        String s4 = ProtectedSandApp.s("䨙\u0001");
        if (list != null) {
            for (Deleted deleted : list) {
                if (deleted != null) {
                    sb.append(deleted.toString());
                    sb.append(s4);
                }
            }
        }
        List<Error> list2 = this.errorList;
        if (list2 != null) {
            for (Error error : list2) {
                if (error != null) {
                    sb.append(error.toString());
                    sb.append(s4);
                }
            }
        }
        sb.append(ProtectedSandApp.s("䨚\u0001"));
        return sb.toString();
    }
}
