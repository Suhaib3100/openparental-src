package org.ocpsoft.prettytime.units;

import org.ocpsoft.prettytime.TimeUnit;
import org.ocpsoft.prettytime.impl.ResourcesTimeUnit;

/* loaded from: classes9.dex */
public class Second extends ResourcesTimeUnit implements TimeUnit {
    public Second() {
        g(1000L);
    }

    @Override // org.ocpsoft.prettytime.impl.ResourcesTimeUnit
    protected String e() {
        return "Second";
    }
}
