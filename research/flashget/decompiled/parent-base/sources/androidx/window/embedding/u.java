package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: SplitPairFilter.kt */
@androidx.window.core.d
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\u001a¨\u0006!"}, d2 = {"Landroidx/window/embedding/u;", "", "Landroid/content/ComponentName;", "primaryActivityName", "secondaryActivityName", "", "secondaryActivityIntentAction", "<init>", "(Landroid/content/ComponentName;Landroid/content/ComponentName;Ljava/lang/String;)V", "Landroid/app/Activity;", "primaryActivity", "secondaryActivity", "", "e", "(Landroid/app/Activity;Landroid/app/Activity;)Z", "Landroid/content/Intent;", "secondaryActivityIntent", "d", "(Landroid/app/Activity;Landroid/content/Intent;)Z", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Landroid/content/ComponentName;", "()Landroid/content/ComponentName;", "b", "c", "Ljava/lang/String;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ComponentName primaryActivityName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final ComponentName secondaryActivityName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final String secondaryActivityIntentAction;

    public u(@fg.l ComponentName primaryActivityName, @fg.l ComponentName secondaryActivityName, @fg.m String str) {
        String str2;
        int i4;
        boolean z4;
        CharSequence charSequence;
        String str3;
        Object obj;
        l0.p(primaryActivityName, "primaryActivityName");
        l0.p(secondaryActivityName, "secondaryActivityName");
        this.primaryActivityName = primaryActivityName;
        this.secondaryActivityName = secondaryActivityName;
        this.secondaryActivityIntentAction = str;
        String packageName = primaryActivityName.getPackageName();
        l0.o(packageName, "primaryActivityName.packageName");
        String className = primaryActivityName.getClassName();
        l0.o(className, "primaryActivityName.className");
        String packageName2 = secondaryActivityName.getPackageName();
        l0.o(packageName2, "secondaryActivityName.packageName");
        String className2 = secondaryActivityName.getClassName();
        l0.o(className2, "secondaryActivityName.className");
        if (packageName.length() == 0 || packageName2.length() == 0) {
            throw new IllegalArgumentException("Package name must not be empty");
        }
        if (className.length() == 0 || className2.length() == 0) {
            throw new IllegalArgumentException("Activity class name must not be empty.");
        }
        if (kotlin.text.v.T2(packageName, "*", false, 2, null) && kotlin.text.v.p3(packageName, "*", 0, false, 6, null) != packageName.length() - 1) {
            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.");
        }
        if (kotlin.text.v.T2(className, "*", false, 2, null)) {
            str2 = "Wildcard in package name is only allowed at the end.";
            i4 = 2;
            z4 = false;
            charSequence = "*";
            str3 = className2;
            if (kotlin.text.v.p3(className, "*", 0, false, 6, null) != className.length() - 1) {
                throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.");
            }
            obj = null;
        } else {
            str2 = "Wildcard in package name is only allowed at the end.";
            i4 = 2;
            z4 = false;
            charSequence = "*";
            str3 = className2;
            obj = null;
        }
        if (kotlin.text.v.T2(packageName2, charSequence, z4, i4, obj) && kotlin.text.v.p3(packageName2, "*", 0, false, 6, null) != packageName2.length() - 1) {
            throw new IllegalArgumentException(str2);
        }
        if (kotlin.text.v.T2(str3, charSequence, z4, i4, obj) && kotlin.text.v.p3(str3, "*", 0, false, 6, null) != str3.length() - 1) {
            throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.");
        }
    }

    @fg.l
    /* renamed from: a, reason: from getter */
    public final ComponentName getPrimaryActivityName() {
        return this.primaryActivityName;
    }

    @fg.m
    /* renamed from: b, reason: from getter */
    public final String getSecondaryActivityIntentAction() {
        return this.secondaryActivityIntentAction;
    }

    @fg.l
    /* renamed from: c, reason: from getter */
    public final ComponentName getSecondaryActivityName() {
        return this.secondaryActivityName;
    }

    public final boolean d(@fg.l Activity primaryActivity, @fg.l Intent secondaryActivityIntent) {
        l0.p(primaryActivity, "primaryActivity");
        l0.p(secondaryActivityIntent, "secondaryActivityIntent");
        ComponentName componentName = primaryActivity.getComponentName();
        r rVar = r.f35751a;
        if (!rVar.b(componentName, this.primaryActivityName) || !rVar.b(secondaryActivityIntent.getComponent(), this.secondaryActivityName)) {
            return false;
        }
        String str = this.secondaryActivityIntentAction;
        return str == null || l0.g(str, secondaryActivityIntent.getAction());
    }

    public final boolean e(@fg.l Activity primaryActivity, @fg.l Activity secondaryActivity) {
        l0.p(primaryActivity, "primaryActivity");
        l0.p(secondaryActivity, "secondaryActivity");
        r rVar = r.f35751a;
        boolean z4 = false;
        boolean z5 = rVar.b(primaryActivity.getComponentName(), this.primaryActivityName) && rVar.b(secondaryActivity.getComponentName(), this.secondaryActivityName);
        if (secondaryActivity.getIntent() == null) {
            return z5;
        }
        if (z5) {
            Intent intent = secondaryActivity.getIntent();
            l0.o(intent, "secondaryActivity.intent");
            if (d(primaryActivity, intent)) {
                z4 = true;
            }
        }
        return z4;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof u)) {
            return false;
        }
        u uVar = (u) other;
        return l0.g(this.primaryActivityName, uVar.primaryActivityName) && l0.g(this.secondaryActivityName, uVar.secondaryActivityName) && l0.g(this.secondaryActivityIntentAction, uVar.secondaryActivityIntentAction);
    }

    public int hashCode() {
        int hashCode = (this.secondaryActivityName.hashCode() + (this.primaryActivityName.hashCode() * 31)) * 31;
        String str = this.secondaryActivityIntentAction;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @fg.l
    public String toString() {
        return "SplitPairFilter{primaryActivityName=" + this.primaryActivityName + ", secondaryActivityName=" + this.secondaryActivityName + ", secondaryActivityAction=" + ((Object) this.secondaryActivityIntentAction) + '}';
    }
}
