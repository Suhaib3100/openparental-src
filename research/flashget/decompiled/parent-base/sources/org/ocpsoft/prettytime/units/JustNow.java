package org.ocpsoft.prettytime.units;

import org.ocpsoft.prettytime.TimeUnit;
import org.ocpsoft.prettytime.impl.ResourcesTimeUnit;

/* loaded from: classes9.dex */
public class JustNow extends ResourcesTimeUnit implements TimeUnit {
    public JustNow() {
        f(60000L);
    }

    @Override // org.ocpsoft.prettytime.impl.ResourcesTimeUnit, org.ocpsoft.prettytime.TimeUnit
    public boolean c() {
        return false;
    }

    @Override // org.ocpsoft.prettytime.impl.ResourcesTimeUnit
    protected String e() {
        return "JustNow";
    }
}
