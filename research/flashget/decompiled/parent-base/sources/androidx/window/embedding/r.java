package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: MatcherUtils.kt */
@androidx.window.core.d
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/window/embedding/r;", "", "<init>", "()V", "", "name", "pattern", "", "c", "(Ljava/lang/String;Ljava/lang/String;)Z", "Landroid/content/ComponentName;", "activityComponent", "ruleComponent", "b", "(Landroid/content/ComponentName;Landroid/content/ComponentName;)Z", "Landroid/app/Activity;", "activity", "a", "(Landroid/app/Activity;Landroid/content/ComponentName;)Z", "Z", "sDebugMatchers", "Ljava/lang/String;", "sMatchersTag", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final boolean sDebugMatchers = false;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final String sMatchersTag = "SplitRuleResolution";

    /* renamed from: a, reason: collision with root package name */
    @fg.l
    public static final r f35751a = new r();

    private r() {
    }

    private final boolean c(String name, String pattern) {
        if (!kotlin.text.v.T2(pattern, "*", false, 2, null)) {
            return false;
        }
        if (l0.g(pattern, "*")) {
            return true;
        }
        if (kotlin.text.v.p3(pattern, "*", 0, false, 6, null) != kotlin.text.v.D3(pattern, "*", 0, false, 6, null) || !kotlin.text.v.J1(pattern, "*", false, 2, null)) {
            throw new IllegalArgumentException("Name pattern with a wildcard must only contain a single wildcard in the end");
        }
        String substring = pattern.substring(0, pattern.length() - 1);
        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return kotlin.text.v.s2(name, substring, false, 2, null);
    }

    public final boolean a(@fg.l Activity activity, @fg.l ComponentName ruleComponent) {
        ComponentName component;
        l0.p(activity, "activity");
        l0.p(ruleComponent, "ruleComponent");
        if (b(activity.getComponentName(), ruleComponent)) {
            return true;
        }
        Intent intent = activity.getIntent();
        if (intent == null || (component = intent.getComponent()) == null) {
            return false;
        }
        return f35751a.b(component, ruleComponent);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(@fg.m android.content.ComponentName r7, @fg.l android.content.ComponentName r8) {
        /*
            r6 = this;
            java.lang.String r0 = "ruleComponent"
            kotlin.jvm.internal.l0.p(r8, r0)
            java.lang.String r0 = "*"
            r1 = 1
            r2 = 0
            if (r7 != 0) goto L22
            java.lang.String r7 = r8.getPackageName()
            boolean r7 = kotlin.jvm.internal.l0.g(r7, r0)
            if (r7 == 0) goto L20
            java.lang.String r7 = r8.getClassName()
            boolean r7 = kotlin.jvm.internal.l0.g(r7, r0)
            if (r7 == 0) goto L20
            goto L21
        L20:
            r1 = r2
        L21:
            return r1
        L22:
            java.lang.String r3 = r7.toString()
            java.lang.String r4 = "activityComponent.toString()"
            kotlin.jvm.internal.l0.o(r3, r4)
            r4 = 2
            r5 = 0
            boolean r0 = kotlin.text.v.T2(r3, r0, r2, r4, r5)
            if (r0 != 0) goto L8e
            java.lang.String r0 = r7.getPackageName()
            java.lang.String r3 = r8.getPackageName()
            boolean r0 = kotlin.jvm.internal.l0.g(r0, r3)
            if (r0 != 0) goto L5c
            java.lang.String r0 = r7.getPackageName()
            java.lang.String r3 = "activityComponent.packageName"
            kotlin.jvm.internal.l0.o(r0, r3)
            java.lang.String r3 = r8.getPackageName()
            java.lang.String r4 = "ruleComponent.packageName"
            kotlin.jvm.internal.l0.o(r3, r4)
            boolean r0 = r6.c(r0, r3)
            if (r0 == 0) goto L5a
            goto L5c
        L5a:
            r0 = r2
            goto L5d
        L5c:
            r0 = r1
        L5d:
            java.lang.String r3 = r7.getClassName()
            java.lang.String r4 = r8.getClassName()
            boolean r3 = kotlin.jvm.internal.l0.g(r3, r4)
            if (r3 != 0) goto L86
            java.lang.String r7 = r7.getClassName()
            java.lang.String r3 = "activityComponent.className"
            kotlin.jvm.internal.l0.o(r7, r3)
            java.lang.String r8 = r8.getClassName()
            java.lang.String r3 = "ruleComponent.className"
            kotlin.jvm.internal.l0.o(r8, r3)
            boolean r7 = r6.c(r7, r8)
            if (r7 == 0) goto L84
            goto L86
        L84:
            r7 = r2
            goto L87
        L86:
            r7 = r1
        L87:
            if (r0 == 0) goto L8c
            if (r7 == 0) goto L8c
            goto L8d
        L8c:
            r1 = r2
        L8d:
            return r1
        L8e:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Wildcard can only be part of the rule."
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.embedding.r.b(android.content.ComponentName, android.content.ComponentName):boolean");
    }
}
