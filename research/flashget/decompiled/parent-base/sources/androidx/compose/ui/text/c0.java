package androidx.compose.ui.text;

import kotlin.Metadata;

/* compiled from: AndroidTextStyle.android.kt */
@androidx.compose.runtime.internal.u(parameters = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0016B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006B\u001d\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\tB\u0013\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\nJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/text/c0;", "", "", "includeFontPadding", "<init>", "(Z)V", "()V", "Landroidx/compose/ui/text/j;", "emojiSupportMatch", "(IZLkotlin/jvm/internal/w;)V", "(ILkotlin/jvm/internal/w;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "e", "(Landroidx/compose/ui/text/c0;)Landroidx/compose/ui/text/c0;", "a", "Z", "c", "()Z", "d", "b", "I", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f20605d = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean includeFontPadding;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int emojiSupportMatch;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: e, reason: collision with root package name */
    @fg.l
    private static final c0 f20606e = new c0();

    /* compiled from: AndroidTextStyle.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/c0$a;", "", "<init>", "()V", "Landroidx/compose/ui/text/c0;", "Default", "Landroidx/compose/ui/text/c0;", "a", "()Landroidx/compose/ui/text/c0;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.text.c0$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final c0 a() {
            return c0.f20606e;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    public /* synthetic */ c0(int i4, kotlin.jvm.internal.w wVar) {
        this(i4);
    }

    public static /* synthetic */ void d() {
    }

    /* renamed from: b, reason: from getter */
    public final int getEmojiSupportMatch() {
        return this.emojiSupportMatch;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIncludeFontPadding() {
        return this.includeFontPadding;
    }

    @fg.l
    public final c0 e(@fg.m c0 other) {
        return other == null ? this : other;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) other;
        return this.includeFontPadding == c0Var.includeFontPadding && j.f(this.emojiSupportMatch, c0Var.emojiSupportMatch);
    }

    public int hashCode() {
        return j.g(this.emojiSupportMatch) + (Boolean.hashCode(this.includeFontPadding) * 31);
    }

    @fg.l
    public String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.includeFontPadding + ", emojiSupportMatch=" + ((Object) j.h(this.emojiSupportMatch)) + ')';
    }

    public /* synthetic */ c0(int i4, boolean z4, kotlin.jvm.internal.w wVar) {
        this(i4, z4);
    }

    public c0(boolean z4) {
        this.includeFontPadding = z4;
        j.INSTANCE.getClass();
        this.emojiSupportMatch = j.f21161c;
    }

    public /* synthetic */ c0(boolean z4, int i4, kotlin.jvm.internal.w wVar) {
        this((i4 & 1) != 0 ? false : z4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c0(int r1, boolean r2, int r3, kotlin.jvm.internal.w r4) {
        /*
            r0 = this;
            r4 = r3 & 1
            if (r4 == 0) goto Ld
            androidx.compose.ui.text.j$a r1 = androidx.compose.ui.text.j.INSTANCE
            r1.getClass()
            int r1 = androidx.compose.ui.text.j.a()
        Ld:
            r3 = r3 & 2
            if (r3 == 0) goto L12
            r2 = 0
        L12:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.c0.<init>(int, boolean, int, kotlin.jvm.internal.w):void");
    }

    private c0(int i4, boolean z4) {
        this.includeFontPadding = z4;
        this.emojiSupportMatch = i4;
    }

    private c0(int i4) {
        this.includeFontPadding = false;
        this.emojiSupportMatch = i4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c0(int r1, int r2, kotlin.jvm.internal.w r3) {
        /*
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto Ld
            androidx.compose.ui.text.j$a r1 = androidx.compose.ui.text.j.INSTANCE
            r1.getClass()
            int r1 = androidx.compose.ui.text.j.a()
        Ld:
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.c0.<init>(int, int, kotlin.jvm.internal.w):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c0() {
        this(j.f21161c, false);
        j.INSTANCE.getClass();
    }
}
