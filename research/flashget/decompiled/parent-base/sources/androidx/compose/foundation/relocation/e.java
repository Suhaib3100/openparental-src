package androidx.compose.foundation.relocation;

import androidx.compose.foundation.z0;
import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: BringIntoViewRequester.kt */
@z0
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/relocation/e;", "Landroidx/compose/foundation/relocation/d;", "<init>", "()V", "Li0/i;", "rect", "Lkotlin/k2;", "a", "(Li0/i;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/runtime/collection/g;", "Landroidx/compose/foundation/relocation/g;", "Landroidx/compose/runtime/collection/g;", "c", "()Landroidx/compose/runtime/collection/g;", "modifiers", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nBringIntoViewRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterImpl\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,197:1\n1208#2:198\n1187#2,2:199\n460#3,11:201\n*S KotlinDebug\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterImpl\n*L\n115#1:198\n115#1:199,2\n118#1:201,11\n*E\n"})
/* loaded from: classes.dex */
final class e implements d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final androidx.compose.runtime.collection.g<g> modifiers = new androidx.compose.runtime.collection.g<>(new g[16], 0);

    /* compiled from: BringIntoViewRequester.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", f = "BringIntoViewRequester.kt", i = {0, 0, 0, 0}, l = {119}, m = "bringIntoView", n = {"rect", "content$iv", "size$iv", "i$iv"}, s = {"L$0", "L$1", "I$0", "I$1"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f6964b;

        /* renamed from: c, reason: collision with root package name */
        Object f6965c;

        /* renamed from: d, reason: collision with root package name */
        int f6966d;

        /* renamed from: e, reason: collision with root package name */
        int f6967e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f6968f;

        /* renamed from: h, reason: collision with root package name */
        int f6970h;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @m
        public final Object invokeSuspend(@l Object obj) {
            this.f6968f = obj;
            this.f6970h |= Integer.MIN_VALUE;
            return e.this.a(null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
    
        if (r8 < r2) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0062 -> B:10:0x0065). Please report as a decompilation issue!!! */
    @Override // androidx.compose.foundation.relocation.d
    @fg.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@fg.m i0.i r8, @fg.l kotlin.coroutines.d<? super kotlin.k2> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.relocation.e.a
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.relocation.e$a r0 = (androidx.compose.foundation.relocation.e.a) r0
            int r1 = r0.f6970h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6970h = r1
            goto L18
        L13:
            androidx.compose.foundation.relocation.e$a r0 = new androidx.compose.foundation.relocation.e$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f6968f
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f6970h
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            int r8 = r0.f6967e
            int r2 = r0.f6966d
            java.lang.Object r4 = r0.f6965c
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r5 = r0.f6964b
            i0.i r5 = (i0.i) r5
            kotlin.a1.n(r9)
            r9 = r5
            goto L65
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            kotlin.a1.n(r9)
            androidx.compose.runtime.collection.g<androidx.compose.foundation.relocation.g> r9 = r7.modifiers
            int r2 = r9.getSize()
            if (r2 <= 0) goto L68
            java.lang.Object[] r9 = r9.L()
            r4 = 0
            r6 = r9
            r9 = r8
            r8 = r4
            r4 = r6
        L50:
            r5 = r4[r8]
            androidx.compose.foundation.relocation.g r5 = (androidx.compose.foundation.relocation.g) r5
            r0.f6964b = r9
            r0.f6965c = r4
            r0.f6966d = r2
            r0.f6967e = r8
            r0.f6970h = r3
            java.lang.Object r5 = r5.B7(r9, r0)
            if (r5 != r1) goto L65
            return r1
        L65:
            int r8 = r8 + r3
            if (r8 < r2) goto L50
        L68:
            kotlin.k2 r8 = kotlin.k2.f75408a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.relocation.e.a(i0.i, kotlin.coroutines.d):java.lang.Object");
    }

    @l
    public final androidx.compose.runtime.collection.g<g> c() {
        return this.modifiers;
    }
}
