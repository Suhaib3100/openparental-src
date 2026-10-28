package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.jvm.internal.r1;
import kotlin.k2;
import kotlinx.coroutines.z1;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: WhileSelect.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a4\u0010\u0006\u001a\u00020\u00032\u001f\b\u0004\u0010\u0005\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000¢\u0006\u0002\b\u0004H\u0087Hø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lkotlin/Function1;", "Lkotlinx/coroutines/selects/c;", "", "Lkotlin/k2;", "Lkotlin/u;", "builder", "a", "(Lld/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nWhileSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WhileSelect.kt\nkotlinx/coroutines/selects/WhileSelectKt\n+ 2 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,33:1\n55#2,8:34\n*S KotlinDebug\n*F\n+ 1 WhileSelect.kt\nkotlinx/coroutines/selects/WhileSelectKt\n*L\n31#1:34,8\n*E\n"})
/* loaded from: classes7.dex */
public final class u {

    /* compiled from: WhileSelect.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.selects.WhileSelectKt", f = "WhileSelect.kt", i = {0}, l = {41}, m = "whileSelect", n = {"builder"}, s = {"L$0"})
    @Metadata(k = 3, mv = {1, 8, 0}, xi = SyslogAppender.LOG_LOCAL6)
    @r1({"SMAP\nWhileSelect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WhileSelect.kt\nkotlinx/coroutines/selects/WhileSelectKt$whileSelect$1\n*L\n1#1,33:1\n*E\n"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: b, reason: collision with root package name */
        Object f81085b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f81086c;

        /* renamed from: d, reason: collision with root package name */
        int f81087d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @fg.m
        public final Object invokeSuspend(@fg.l Object obj) {
            this.f81086c = obj;
            this.f81087d |= Integer.MIN_VALUE;
            return u.a(null, this);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004e -> B:10:0x0051). Please report as a decompilation issue!!! */
    @fg.m
    @kotlinx.coroutines.z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@fg.l ld.l<? super kotlinx.coroutines.selects.c<? super java.lang.Boolean>, kotlin.k2> r4, @fg.l kotlin.coroutines.d<? super kotlin.k2> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.selects.u.a
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.selects.u$a r0 = (kotlinx.coroutines.selects.u.a) r0
            int r1 = r0.f81087d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f81087d = r1
            goto L18
        L13:
            kotlinx.coroutines.selects.u$a r0 = new kotlinx.coroutines.selects.u$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f81086c
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.COROUTINE_SUSPENDED
            int r2 = r0.f81087d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.f81085b
            ld.l r4 = (ld.l) r4
            kotlin.a1.n(r5)
            goto L51
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "裇\u0001"
            java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.a1.n(r5)
        L3a:
            kotlinx.coroutines.selects.l r5 = new kotlinx.coroutines.selects.l
            kotlin.coroutines.g r2 = r0.getContext()
            r5.<init>(r2)
            r4.invoke(r5)
            r0.f81085b = r4
            r0.f81087d = r3
            java.lang.Object r5 = kotlinx.coroutines.selects.l.Z(r5, r0)
            if (r5 != r1) goto L51
            return r1
        L51:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L3a
            kotlin.k2 r4 = kotlin.k2.f75408a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.selects.u.a(ld.l, kotlin.coroutines.d):java.lang.Object");
    }

    @z1
    private static final Object b(ld.l<? super c<? super Boolean>, k2> lVar, kotlin.coroutines.d<? super k2> dVar) {
        throw null;
    }
}
