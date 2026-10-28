package zc;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.regex.Pattern;

/* compiled from: MatchesPattern.java */
@bd.c(applicableTo = String.class)
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes8.dex */
public @interface e {

    /* compiled from: MatchesPattern.java */
    public static class a implements bd.f<e> {
        @Override // bd.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public bd.g a(e eVar, Object obj) {
            return Pattern.compile(eVar.value(), eVar.flags()).matcher((String) obj).matches() ? bd.g.ALWAYS : bd.g.NEVER;
        }
    }

    int flags() default 0;

    @m
    String value();
}
