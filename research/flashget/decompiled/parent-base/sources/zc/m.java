package zc;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: RegEx.java */
@o("RegEx")
@bd.e
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes8.dex */
public @interface m {

    /* compiled from: RegEx.java */
    public static class a implements bd.f<m> {
        @Override // bd.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public bd.g a(m mVar, Object obj) {
            if (!(obj instanceof String)) {
                return bd.g.NEVER;
            }
            try {
                Pattern.compile((String) obj);
                return bd.g.ALWAYS;
            } catch (PatternSyntaxException unused) {
                return bd.g.NEVER;
            }
        }
    }

    bd.g when() default bd.g.ALWAYS;
}
