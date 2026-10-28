package kotlin.reflect.jvm.internal.impl.renderer;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.text.v;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DescriptorRenderer.kt */
/* loaded from: classes7.dex */
public abstract class m {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m HTML;
    public static final m PLAIN;

    /* compiled from: DescriptorRenderer.kt */
    static final class a extends m {
        a(String str, int i4) {
            super(str, i4, null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.m
        @fg.l
        public String escape(@fg.l String str) {
            l0.p(str, ProtectedSandApp.s("硞\u0001"));
            return v.i2(v.i2(str, ProtectedSandApp.s("硟\u0001"), ProtectedSandApp.s("硠\u0001"), false, 4, null), ProtectedSandApp.s("硡\u0001"), ProtectedSandApp.s("硢\u0001"), false, 4, null);
        }
    }

    /* compiled from: DescriptorRenderer.kt */
    static final class b extends m {
        b(String str, int i4) {
            super(str, i4, null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.renderer.m
        @fg.l
        public String escape(@fg.l String str) {
            l0.p(str, ProtectedSandApp.s("硣\u0001"));
            return str;
        }
    }

    private static final /* synthetic */ m[] $values() {
        return new m[]{PLAIN, HTML};
    }

    static {
        w wVar = null;
        PLAIN = new b(ProtectedSandApp.s("硜\u0001"), 0, wVar);
        HTML = new a(ProtectedSandApp.s("硝\u0001"), 1, wVar);
        m[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
    }

    public /* synthetic */ m(String str, int i4, w wVar) {
        this(str, i4);
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }

    @fg.l
    public abstract String escape(@fg.l String str);

    private m(String str, int i4) {
    }
}
