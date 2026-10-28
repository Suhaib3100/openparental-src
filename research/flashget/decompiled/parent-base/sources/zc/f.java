package zc;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Nonnegative.java */
@bd.c(applicableTo = Number.class)
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes8.dex */
public @interface f {

    /* compiled from: Nonnegative.java */
    public static class a implements bd.f<f> {
        @Override // bd.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public bd.g a(f fVar, Object obj) {
            if (!(obj instanceof Number)) {
                return bd.g.NEVER;
            }
            Number number = (Number) obj;
            return (!(number instanceof Long) ? !(!(number instanceof Double) ? !(!(number instanceof Float) ? number.intValue() < 0 : number.floatValue() < 0.0f) : number.doubleValue() < com.google.firebase.remoteconfig.p.f60679p) : number.longValue() < 0) ? bd.g.ALWAYS : bd.g.NEVER;
        }
    }

    bd.g when() default bd.g.ALWAYS;
}
