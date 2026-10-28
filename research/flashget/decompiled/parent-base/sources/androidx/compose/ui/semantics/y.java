package androidx.compose.ui.semantics;

import kotlin.Metadata;
import kotlin.jvm.internal.n0;

/* compiled from: SemanticsProperties.kt */
@androidx.compose.runtime.internal.u(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u001e\b\u0002\u0010\u0006\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bB7\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u001c\u0010\u0006\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005¢\u0006\u0004\b\u0007\u0010\fJ!\u0010\u000f\u001a\u0004\u0018\u00018\u00002\b\u0010\r\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0086\u0002¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00112\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u0017\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u001cR0\u0010\u0006\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010!R$\u0010\n\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0015\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Landroidx/compose/ui/semantics/y;", "T", "", "", "name", "Lkotlin/Function2;", "mergePolicy", "<init>", "(Ljava/lang/String;Lld/p;)V", "", "isImportantForAccessibility", "(Ljava/lang/String;Z)V", "(Ljava/lang/String;ZLld/p;)V", "parentValue", "childValue", "e", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/compose/ui/semantics/z;", "thisRef", "Lkotlin/reflect/o;", "property", "c", "(Landroidx/compose/ui/semantics/z;Lkotlin/reflect/o;)Ljava/lang/Object;", "value", "Lkotlin/k2;", "f", "(Landroidx/compose/ui/semantics/z;Lkotlin/reflect/o;Ljava/lang/Object;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "Lld/p;", "()Lld/p;", "<set-?>", "Z", "d", "()Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class y<T> {

    /* renamed from: d, reason: collision with root package name */
    public static final int f20411d = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ld.p<T, T, T> mergePolicy;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isImportantForAccessibility;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SemanticsProperties.kt */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0006\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\b\u0010\u0002\u001a\u0004\u0018\u0001H\u00012\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "T", "parentValue", "childValue", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends n0 implements ld.p<T, T, T> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f20415b = new a(2);

        a() {
            super(2);
        }

        @Override // ld.p
        @fg.m
        public final T invoke(@fg.m T t4, T t5) {
            return t4 == null ? t5 : t4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y(@fg.l String str, @fg.l ld.p<? super T, ? super T, ? extends T> pVar) {
        this.name = str;
        this.mergePolicy = pVar;
    }

    @fg.l
    public final ld.p<T, T, T> a() {
        return this.mergePolicy;
    }

    @fg.l
    /* renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final T c(@fg.l z thisRef, @fg.l kotlin.reflect.o<?> property) {
        return (T) w.F1();
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsImportantForAccessibility() {
        return this.isImportantForAccessibility;
    }

    @fg.m
    public final T e(@fg.m T parentValue, T childValue) {
        return this.mergePolicy.invoke(parentValue, childValue);
    }

    public final void f(@fg.l z thisRef, @fg.l kotlin.reflect.o<?> property, T value) {
        thisRef.b(this, value);
    }

    @fg.l
    public String toString() {
        return "AccessibilityKey: " + this.name;
    }

    public /* synthetic */ y(String str, ld.p pVar, int i4, kotlin.jvm.internal.w wVar) {
        this(str, (i4 & 2) != 0 ? a.f20415b : pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y(@fg.l String str, boolean z4) {
        this(str, null, 2, 0 == true ? 1 : 0);
        this.isImportantForAccessibility = z4;
    }

    public y(@fg.l String str, boolean z4, @fg.l ld.p<? super T, ? super T, ? extends T> pVar) {
        this(str, pVar);
        this.isImportantForAccessibility = z4;
    }
}
