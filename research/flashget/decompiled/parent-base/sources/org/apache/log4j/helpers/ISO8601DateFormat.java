package org.apache.log4j.helpers;

import java.text.ParsePosition;
import java.util.Date;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public class ISO8601DateFormat extends AbsoluteTimeDateFormat {
    private static long lastTime = 0;
    private static char[] lastTimeString = new char[20];
    private static final long serialVersionUID = -759840745298755296L;

    public ISO8601DateFormat() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00c8  */
    @Override // org.apache.log4j.helpers.AbsoluteTimeDateFormat, java.text.DateFormat
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.StringBuffer format(java.util.Date r9, java.lang.StringBuffer r10, java.text.FieldPosition r11) {
        /*
            r8 = this;
            long r0 = r9.getTime()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r2 = r0 % r2
            int r11 = (int) r2
            long r2 = (long) r11
            long r0 = r0 - r2
            long r2 = org.apache.log4j.helpers.ISO8601DateFormat.lastTime
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = 0
            r4 = 10
            r5 = 48
            if (r2 != 0) goto L22
            char[] r2 = org.apache.log4j.helpers.ISO8601DateFormat.lastTimeString
            char r6 = r2[r3]
            if (r6 != 0) goto L1d
            goto L22
        L1d:
            r10.append(r2)
            goto Lc4
        L22:
            java.util.Calendar r2 = r8.calendar
            r2.setTime(r9)
            int r9 = r10.length()
            java.util.Calendar r2 = r8.calendar
            r6 = 1
            int r2 = r2.get(r6)
            r10.append(r2)
            java.util.Calendar r2 = r8.calendar
            r6 = 2
            int r2 = r2.get(r6)
            switch(r2) {
                case 0: goto L63;
                case 1: goto L60;
                case 2: goto L5d;
                case 3: goto L5a;
                case 4: goto L57;
                case 5: goto L54;
                case 6: goto L51;
                case 7: goto L4e;
                case 8: goto L4b;
                case 9: goto L48;
                case 10: goto L45;
                case 11: goto L42;
                default: goto L3f;
            }
        L3f:
            java.lang.String r2 = "-NA-"
            goto L65
        L42:
            java.lang.String r2 = "-12-"
            goto L65
        L45:
            java.lang.String r2 = "-11-"
            goto L65
        L48:
            java.lang.String r2 = "-10-"
            goto L65
        L4b:
            java.lang.String r2 = "-09-"
            goto L65
        L4e:
            java.lang.String r2 = "-08-"
            goto L65
        L51:
            java.lang.String r2 = "-07-"
            goto L65
        L54:
            java.lang.String r2 = "-06-"
            goto L65
        L57:
            java.lang.String r2 = "-05-"
            goto L65
        L5a:
            java.lang.String r2 = "-04-"
            goto L65
        L5d:
            java.lang.String r2 = "-03-"
            goto L65
        L60:
            java.lang.String r2 = "-02-"
            goto L65
        L63:
            java.lang.String r2 = "-01-"
        L65:
            r10.append(r2)
            java.util.Calendar r2 = r8.calendar
            r6 = 5
            int r2 = r2.get(r6)
            if (r2 >= r4) goto L74
            r10.append(r5)
        L74:
            r10.append(r2)
            r2 = 32
            r10.append(r2)
            java.util.Calendar r2 = r8.calendar
            r6 = 11
            int r2 = r2.get(r6)
            if (r2 >= r4) goto L89
            r10.append(r5)
        L89:
            r10.append(r2)
            r2 = 58
            r10.append(r2)
            java.util.Calendar r6 = r8.calendar
            r7 = 12
            int r6 = r6.get(r7)
            if (r6 >= r4) goto L9e
            r10.append(r5)
        L9e:
            r10.append(r6)
            r10.append(r2)
            java.util.Calendar r2 = r8.calendar
            r6 = 13
            int r2 = r2.get(r6)
            if (r2 >= r4) goto Lb1
            r10.append(r5)
        Lb1:
            r10.append(r2)
            r2 = 44
            r10.append(r2)
            int r2 = r10.length()
            char[] r6 = org.apache.log4j.helpers.ISO8601DateFormat.lastTimeString
            r10.getChars(r9, r2, r6, r3)
            org.apache.log4j.helpers.ISO8601DateFormat.lastTime = r0
        Lc4:
            r9 = 100
            if (r11 >= r9) goto Lcb
            r10.append(r5)
        Lcb:
            if (r11 >= r4) goto Ld0
            r10.append(r5)
        Ld0:
            r10.append(r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.log4j.helpers.ISO8601DateFormat.format(java.util.Date, java.lang.StringBuffer, java.text.FieldPosition):java.lang.StringBuffer");
    }

    @Override // org.apache.log4j.helpers.AbsoluteTimeDateFormat, java.text.DateFormat
    public Date parse(String str, ParsePosition parsePosition) {
        return null;
    }

    public ISO8601DateFormat(TimeZone timeZone) {
        super(timeZone);
    }
}
