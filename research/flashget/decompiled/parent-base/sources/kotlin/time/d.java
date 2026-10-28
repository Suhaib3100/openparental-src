package kotlin.time;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.c1;
import kotlin.jvm.internal.l0;
import kotlin.o2;
import kotlin.time.r;

/* compiled from: TimeSource.kt */
@o2(markerClass = {l.class})
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002J\u0018\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H¦\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u001b\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0000H¦\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u000eH¦\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH&¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b!¨\u0006\u0014"}, d2 = {"Lkotlin/time/d;", "Lkotlin/time/r;", "", "Lkotlin/time/e;", "duration", "D", "(J)Lkotlin/time/d;", "I", "other", "q0", "(Lkotlin/time/d;)J", "", "r3", "(Lkotlin/time/d;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@c1(version = "1.9")
/* loaded from: classes7.dex */
public interface d extends r, Comparable<d> {

    /* compiled from: TimeSource.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static int a(@fg.l d dVar, @fg.l d dVar2) {
            l0.p(dVar2, ProtectedSandApp.s("蔓\u0001"));
            long q02 = dVar.q0(dVar2);
            e.INSTANCE.getClass();
            return e.h(q02, e.f79210d);
        }

        public static boolean b(@fg.l d dVar) {
            return r.a.a(dVar);
        }

        public static boolean c(@fg.l d dVar) {
            return r.a.b(dVar);
        }

        @fg.l
        public static d d(@fg.l d dVar, long j4) {
            return dVar.D(e.A0(j4));
        }
    }

    @Override // kotlin.time.r
    @fg.l
    d D(long duration);

    @Override // kotlin.time.r
    @fg.l
    d I(long duration);

    boolean equals(@fg.m Object other);

    int hashCode();

    long q0(@fg.l d other);

    int r3(@fg.l d other);
}
