package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import androidx.constraintlayout.motion.widget.g;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.builtins.i;

/* compiled from: JvmPrimitiveType.java */
/* loaded from: classes5.dex */
public enum e {
    BOOLEAN(i.BOOLEAN, ProtectedSandApp.s("劎"), ProtectedSandApp.s("劏"), ProtectedSandApp.s("劐")),
    CHAR(i.CHAR, ProtectedSandApp.s("劒"), ProtectedSandApp.s("劓"), ProtectedSandApp.s("劔")),
    BYTE(i.BYTE, ProtectedSandApp.s("劖"), ProtectedSandApp.s("劗"), ProtectedSandApp.s("劘")),
    SHORT(i.SHORT, ProtectedSandApp.s("劚"), ProtectedSandApp.s("力"), ProtectedSandApp.s("劜")),
    INT(i.INT, ProtectedSandApp.s("办"), ProtectedSandApp.s("功"), ProtectedSandApp.s("加")),
    FLOAT(i.FLOAT, ProtectedSandApp.s("劢"), ProtectedSandApp.s("劣"), ProtectedSandApp.s("劤")),
    LONG(i.LONG, ProtectedSandApp.s("劦"), ProtectedSandApp.s("劧"), ProtectedSandApp.s("动")),
    DOUBLE(i.DOUBLE, ProtectedSandApp.s("努"), ProtectedSandApp.s("劫"), ProtectedSandApp.s("劬"));

    private final String desc;
    private final String name;
    private final i primitiveType;
    private final kotlin.reflect.jvm.internal.impl.name.c wrapperFqName;
    private static final Set<kotlin.reflect.jvm.internal.impl.name.c> WRAPPERS_CLASS_NAMES = new HashSet();
    private static final Map<String, e> TYPE_BY_NAME = new HashMap();
    private static final Map<i, e> TYPE_BY_PRIMITIVE_TYPE = new EnumMap(i.class);
    private static final Map<String, e> TYPE_BY_DESC = new HashMap();

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void $$$reportNull$$$0(int r7) {
        /*
            r0 = 4
            r1 = 2
            if (r7 == r1) goto L10
            if (r7 == r0) goto L10
            switch(r7) {
                case 10: goto L10;
                case 11: goto L10;
                case 12: goto L10;
                case 13: goto L10;
                default: goto L9;
            }
        L9:
            java.lang.String r2 = "剼"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)
            goto L16
        L10:
            java.lang.String r2 = "剽"
            java.lang.String r2 = com.flashget.kidsdownloader.ProtectedSandApp.s(r2)
        L16:
            if (r7 == r1) goto L1f
            if (r7 == r0) goto L1f
            switch(r7) {
                case 10: goto L1f;
                case 11: goto L1f;
                case 12: goto L1f;
                case 13: goto L1f;
                default: goto L1d;
            }
        L1d:
            r3 = 3
            goto L20
        L1f:
            r3 = r1
        L20:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "剾"
            java.lang.String r4 = com.flashget.kidsdownloader.ProtectedSandApp.s(r4)
            r5 = 0
            switch(r7) {
                case 1: goto L5c;
                case 2: goto L59;
                case 3: goto L50;
                case 4: goto L59;
                case 5: goto L47;
                case 6: goto L3e;
                case 7: goto L5c;
                case 8: goto L47;
                case 9: goto L35;
                case 10: goto L59;
                case 11: goto L59;
                case 12: goto L59;
                case 13: goto L59;
                default: goto L2c;
            }
        L2c:
            java.lang.String r6 = "剿"
            java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
            r3[r5] = r6
            goto L64
        L35:
            java.lang.String r6 = "劀"
            java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
            r3[r5] = r6
            goto L64
        L3e:
            java.lang.String r6 = "劁"
            java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
            r3[r5] = r6
            goto L64
        L47:
            java.lang.String r6 = "劂"
            java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
            r3[r5] = r6
            goto L64
        L50:
            java.lang.String r6 = "劃"
            java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
            r3[r5] = r6
            goto L64
        L59:
            r3[r5] = r4
            goto L64
        L5c:
            java.lang.String r6 = "劄"
            java.lang.String r6 = com.flashget.kidsdownloader.ProtectedSandApp.s(r6)
            r3[r5] = r6
        L64:
            java.lang.String r5 = "劅"
            java.lang.String r5 = com.flashget.kidsdownloader.ProtectedSandApp.s(r5)
            r6 = 1
            if (r7 == r1) goto L99
            if (r7 == r0) goto L99
            switch(r7) {
                case 10: goto L90;
                case 11: goto L87;
                case 12: goto L7e;
                case 13: goto L75;
                default: goto L72;
            }
        L72:
            r3[r6] = r4
            goto L9b
        L75:
            java.lang.String r4 = "劆"
            java.lang.String r4 = com.flashget.kidsdownloader.ProtectedSandApp.s(r4)
            r3[r6] = r4
            goto L9b
        L7e:
            java.lang.String r4 = "劇"
            java.lang.String r4 = com.flashget.kidsdownloader.ProtectedSandApp.s(r4)
            r3[r6] = r4
            goto L9b
        L87:
            java.lang.String r4 = "劈"
            java.lang.String r4 = com.flashget.kidsdownloader.ProtectedSandApp.s(r4)
            r3[r6] = r4
            goto L9b
        L90:
            java.lang.String r4 = "劉"
            java.lang.String r4 = com.flashget.kidsdownloader.ProtectedSandApp.s(r4)
            r3[r6] = r4
            goto L9b
        L99:
            r3[r6] = r5
        L9b:
            switch(r7) {
                case 1: goto Lb9;
                case 2: goto Lbb;
                case 3: goto Lb9;
                case 4: goto Lbb;
                case 5: goto Lb0;
                case 6: goto La7;
                case 7: goto La7;
                case 8: goto La7;
                case 9: goto La7;
                case 10: goto Lbb;
                case 11: goto Lbb;
                case 12: goto Lbb;
                case 13: goto Lbb;
                default: goto L9e;
            }
        L9e:
            java.lang.String r4 = "劊"
            java.lang.String r4 = com.flashget.kidsdownloader.ProtectedSandApp.s(r4)
            r3[r1] = r4
            goto Lbb
        La7:
            java.lang.String r4 = "劋"
            java.lang.String r4 = com.flashget.kidsdownloader.ProtectedSandApp.s(r4)
            r3[r1] = r4
            goto Lbb
        Lb0:
            java.lang.String r4 = "劌"
            java.lang.String r4 = com.flashget.kidsdownloader.ProtectedSandApp.s(r4)
            r3[r1] = r4
            goto Lbb
        Lb9:
            r3[r1] = r5
        Lbb:
            java.lang.String r2 = java.lang.String.format(r2, r3)
            if (r7 == r1) goto Lcc
            if (r7 == r0) goto Lcc
            switch(r7) {
                case 10: goto Lcc;
                case 11: goto Lcc;
                case 12: goto Lcc;
                case 13: goto Lcc;
                default: goto Lc6;
            }
        Lc6:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>(r2)
            goto Ld1
        Lcc:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r2)
        Ld1:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.jvm.e.$$$reportNull$$$0(int):void");
    }

    static {
        for (e eVar : values()) {
            WRAPPERS_CLASS_NAMES.add(eVar.getWrapperFqName());
            TYPE_BY_NAME.put(eVar.getJavaKeywordName(), eVar);
            TYPE_BY_PRIMITIVE_TYPE.put(eVar.getPrimitiveType(), eVar);
            TYPE_BY_DESC.put(eVar.getDesc(), eVar);
        }
    }

    e(@d5.d i iVar, @d5.d String str, @d5.d String str2, @d5.d String str3) {
        if (iVar == null) {
            $$$reportNull$$$0(6);
        }
        if (str == null) {
            $$$reportNull$$$0(7);
        }
        if (str2 == null) {
            $$$reportNull$$$0(8);
        }
        if (str3 == null) {
            $$$reportNull$$$0(9);
        }
        this.primitiveType = iVar;
        this.name = str;
        this.desc = str2;
        this.wrapperFqName = new kotlin.reflect.jvm.internal.impl.name.c(str3);
    }

    @d5.d
    public static e get(@d5.d String str) {
        if (str == null) {
            $$$reportNull$$$0(1);
        }
        e eVar = TYPE_BY_NAME.get(str);
        if (eVar != null) {
            return eVar;
        }
        throw new AssertionError(g.a(ProtectedSandApp.s("劭"), str));
    }

    @d5.d
    public String getDesc() {
        String str = this.desc;
        if (str == null) {
            $$$reportNull$$$0(12);
        }
        return str;
    }

    @d5.d
    public String getJavaKeywordName() {
        String str = this.name;
        if (str == null) {
            $$$reportNull$$$0(11);
        }
        return str;
    }

    @d5.d
    public i getPrimitiveType() {
        i iVar = this.primitiveType;
        if (iVar == null) {
            $$$reportNull$$$0(10);
        }
        return iVar;
    }

    @d5.d
    public kotlin.reflect.jvm.internal.impl.name.c getWrapperFqName() {
        kotlin.reflect.jvm.internal.impl.name.c cVar = this.wrapperFqName;
        if (cVar == null) {
            $$$reportNull$$$0(13);
        }
        return cVar;
    }

    @d5.d
    public static e get(@d5.d i iVar) {
        if (iVar == null) {
            $$$reportNull$$$0(3);
        }
        e eVar = TYPE_BY_PRIMITIVE_TYPE.get(iVar);
        if (eVar == null) {
            $$$reportNull$$$0(4);
        }
        return eVar;
    }
}
