package zc;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Nonnull.java */
@bd.c
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes8.dex */
public @interface g {

    /* compiled from: Nonnull.java */
    public static class a implements bd.f<g> {
        @Override // bd.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public bd.g a(g gVar, Object obj) {
            return obj == null ? bd.g.NEVER : bd.g.ALWAYS;
        }
    }

    bd.g when() default bd.g.ALWAYS;
}
