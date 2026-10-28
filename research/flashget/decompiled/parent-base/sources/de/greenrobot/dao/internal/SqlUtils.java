package de.greenrobot.dao.internal;

import androidx.appcompat.view.g;
import androidx.compose.foundation.layout.f3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import de.greenrobot.dao.DaoException;

/* loaded from: classes7.dex */
public class SqlUtils {
    public static StringBuilder appendColumn(StringBuilder sb, String str) {
        sb.append('\'');
        sb.append(str);
        sb.append('\'');
        return sb;
    }

    public static StringBuilder appendColumns(StringBuilder sb, String str, String[] strArr) {
        int length = strArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            appendColumn(sb, str, strArr[i4]);
            if (i4 < length - 1) {
                sb.append(',');
            }
        }
        return sb;
    }

    public static StringBuilder appendColumnsEqValue(StringBuilder sb, String str, String[] strArr) {
        for (int i4 = 0; i4 < strArr.length; i4++) {
            appendColumn(sb, str, strArr[i4]).append(ProtectedSandApp.s("忦\u0001"));
            if (i4 < strArr.length - 1) {
                sb.append(',');
            }
        }
        return sb;
    }

    public static StringBuilder appendColumnsEqualPlaceholders(StringBuilder sb, String[] strArr) {
        for (int i4 = 0; i4 < strArr.length; i4++) {
            appendColumn(sb, strArr[i4]).append(ProtectedSandApp.s("忦\u0001"));
            if (i4 < strArr.length - 1) {
                sb.append(',');
            }
        }
        return sb;
    }

    public static StringBuilder appendPlaceholders(StringBuilder sb, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            if (i5 < i4 - 1) {
                sb.append(ProtectedSandApp.s("忧\u0001"));
            } else {
                sb.append('?');
            }
        }
        return sb;
    }

    public static String createSqlDelete(String str, String[] strArr) {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("忨\u0001"));
        sb.append(str);
        if (strArr != null && strArr.length > 0) {
            sb.append(ProtectedSandApp.s("忩\u0001"));
            appendColumnsEqValue(sb, str, strArr);
        }
        return sb.toString();
    }

    public static String createSqlInsert(String str, String str2, String[] strArr) {
        StringBuilder a5 = g.a(str, str2, ProtectedSandApp.s("忪\u0001"));
        appendColumns(a5, strArr);
        a5.append(ProtectedSandApp.s("快\u0001"));
        appendPlaceholders(a5, strArr.length);
        a5.append(')');
        return a5.toString();
    }

    public static String createSqlSelect(String str, String str2, String[] strArr) {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("忬\u0001"));
        if (str2 == null || str2.length() < 0) {
            throw new DaoException(ProtectedSandApp.s("忮\u0001"));
        }
        appendColumns(sb, str2, strArr).append(ProtectedSandApp.s("忭\u0001"));
        sb.append(str);
        sb.append(' ');
        return f3.a(sb, str2, ' ');
    }

    public static String createSqlSelectCountStar(String str) {
        return ProtectedSandApp.s("忯\u0001") + str + ' ';
    }

    public static String createSqlUpdate(String str, String[] strArr, String[] strArr2) {
        StringBuilder a5 = g.a(ProtectedSandApp.s("忰\u0001"), str, ProtectedSandApp.s("忱\u0001"));
        appendColumnsEqualPlaceholders(a5, strArr);
        a5.append(ProtectedSandApp.s("忩\u0001"));
        appendColumnsEqValue(a5, str, strArr2);
        return a5.toString();
    }

    public static StringBuilder appendColumn(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(ProtectedSandApp.s("忥\u0001"));
        sb.append(str2);
        sb.append('\'');
        return sb;
    }

    public static StringBuilder appendColumns(StringBuilder sb, String[] strArr) {
        int length = strArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            sb.append('\'');
            sb.append(strArr[i4]);
            sb.append('\'');
            if (i4 < length - 1) {
                sb.append(',');
            }
        }
        return sb;
    }
}
