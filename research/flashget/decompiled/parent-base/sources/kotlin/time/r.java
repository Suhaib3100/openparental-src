package kotlin.time;

import kotlin.Metadata;
import kotlin.c1;
import kotlin.o2;

/* compiled from: TimeSource.kt */
@o2(markerClass = {l.class})
@c1(version = "1.9")
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000b\u0082\u0002\u0004\n\u0002\b!¨\u0006\r"}, d2 = {"Lkotlin/time/r;", "", "Lkotlin/time/e;", "a", "()J", "duration", "D", "(J)Lkotlin/time/r;", "I", "", "b", "()Z", "c", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface r {

    /* compiled from: TimeSource.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static boolean a(@fg.l r rVar) {
            return e.f0(rVar.a());
        }

        public static boolean b(@fg.l r rVar) {
            return !e.f0(rVar.a());
        }

        @fg.l
        public static r c(@fg.l r rVar, long j4) {
            return rVar.D(e.A0(j4));
        }

        @fg.l
        public static r d(@fg.l r rVar, long j4) {
            return new c(rVar, j4, null);
        }
    }

    @fg.l
    r D(long duration);

    @fg.l
    r I(long duration);

    long a();

    boolean b();

    boolean c();
}
