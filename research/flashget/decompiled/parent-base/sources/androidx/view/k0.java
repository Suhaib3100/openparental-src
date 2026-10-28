package androidx.view;

import android.content.res.Resources;
import fg.l;
import kd.j;
import kd.n;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.w;

/* compiled from: EdgeToEdge.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u0000 \u00182\u00020\u0001:\u0001\u0010B5\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0014R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/activity/k0;", "", "", "lightScrim", "darkScrim", "nightMode", "Lkotlin/Function1;", "Landroid/content/res/Resources;", "", "detectDarkMode", "<init>", "(IIILld/l;)V", "isDark", "g", "(Z)I", "h", "a", "I", "b", "d", "()I", "c", "f", "Lld/l;", "e", "()Lld/l;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int lightScrim;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int darkScrim;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int nightMode;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    private final ld.l<Resources, Boolean> detectDarkMode;

    /* compiled from: EdgeToEdge.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0011\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/activity/k0$a;", "", "<init>", "()V", "", "lightScrim", "darkScrim", "Lkotlin/Function1;", "Landroid/content/res/Resources;", "", "detectDarkMode", "Landroidx/activity/k0;", "b", "(IILld/l;)Landroidx/activity/k0;", "scrim", "d", "(I)Landroidx/activity/k0;", "e", "(II)Landroidx/activity/k0;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.activity.k0$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: EdgeToEdge.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/res/Resources;", "resources", "", "a", "(Landroid/content/res/Resources;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.activity.k0$a$a, reason: collision with other inner class name */
        static final class C0007a extends n0 implements ld.l<Resources, Boolean> {

            /* renamed from: b, reason: collision with root package name */
            public static final C0007a f560b = new C0007a(1);

            C0007a() {
                super(1);
            }

            @Override // ld.l
            @l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@l Resources resources) {
                l0.p(resources, "resources");
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            }
        }

        /* compiled from: EdgeToEdge.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/res/Resources;", "<anonymous parameter 0>", "", "a", "(Landroid/content/res/Resources;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.activity.k0$a$b */
        static final class b extends n0 implements ld.l<Resources, Boolean> {

            /* renamed from: b, reason: collision with root package name */
            public static final b f561b = new b(1);

            b() {
                super(1);
            }

            @Override // ld.l
            @l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@l Resources resources) {
                l0.p(resources, "<anonymous parameter 0>");
                return Boolean.TRUE;
            }
        }

        /* compiled from: EdgeToEdge.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/res/Resources;", "<anonymous parameter 0>", "", "a", "(Landroid/content/res/Resources;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.activity.k0$a$c */
        static final class c extends n0 implements ld.l<Resources, Boolean> {

            /* renamed from: b, reason: collision with root package name */
            public static final c f562b = new c(1);

            c() {
                super(1);
            }

            @Override // ld.l
            @l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@l Resources resources) {
                l0.p(resources, "<anonymous parameter 0>");
                return Boolean.FALSE;
            }
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ k0 c(Companion companion, int i4, int i5, ld.l lVar, int i6, Object obj) {
            if ((i6 & 4) != 0) {
                lVar = C0007a.f560b;
            }
            return companion.b(i4, i5, lVar);
        }

        @l
        @j
        @n
        public final k0 a(@androidx.annotation.l int i4, @androidx.annotation.l int i5) {
            return c(this, i4, i5, null, 4, null);
        }

        @l
        @j
        @n
        public final k0 b(@androidx.annotation.l int lightScrim, @androidx.annotation.l int darkScrim, @l ld.l<? super Resources, Boolean> detectDarkMode) {
            l0.p(detectDarkMode, "detectDarkMode");
            return new k0(lightScrim, darkScrim, 0, detectDarkMode, null);
        }

        @l
        @n
        public final k0 d(@androidx.annotation.l int scrim) {
            return new k0(scrim, scrim, 2, b.f561b, null);
        }

        @l
        @n
        public final k0 e(@androidx.annotation.l int scrim, @androidx.annotation.l int darkScrim) {
            return new k0(scrim, darkScrim, 1, c.f562b, null);
        }

        public Companion(w wVar) {
        }
    }

    public /* synthetic */ k0(int i4, int i5, int i6, ld.l lVar, w wVar) {
        this(i4, i5, i6, lVar);
    }

    @l
    @j
    @n
    public static final k0 a(@androidx.annotation.l int i4, @androidx.annotation.l int i5) {
        return INSTANCE.a(i4, i5);
    }

    @l
    @j
    @n
    public static final k0 b(@androidx.annotation.l int i4, @androidx.annotation.l int i5, @l ld.l<? super Resources, Boolean> lVar) {
        return INSTANCE.b(i4, i5, lVar);
    }

    @l
    @n
    public static final k0 c(@androidx.annotation.l int i4) {
        return INSTANCE.d(i4);
    }

    @l
    @n
    public static final k0 i(@androidx.annotation.l int i4, @androidx.annotation.l int i5) {
        return INSTANCE.e(i4, i5);
    }

    /* renamed from: d, reason: from getter */
    public final int getDarkScrim() {
        return this.darkScrim;
    }

    @l
    public final ld.l<Resources, Boolean> e() {
        return this.detectDarkMode;
    }

    /* renamed from: f, reason: from getter */
    public final int getNightMode() {
        return this.nightMode;
    }

    public final int g(boolean isDark) {
        return isDark ? this.darkScrim : this.lightScrim;
    }

    public final int h(boolean isDark) {
        if (this.nightMode == 0) {
            return 0;
        }
        return isDark ? this.darkScrim : this.lightScrim;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private k0(int i4, int i5, int i6, ld.l<? super Resources, Boolean> lVar) {
        this.lightScrim = i4;
        this.darkScrim = i5;
        this.nightMode = i6;
        this.detectDarkMode = lVar;
    }
}
