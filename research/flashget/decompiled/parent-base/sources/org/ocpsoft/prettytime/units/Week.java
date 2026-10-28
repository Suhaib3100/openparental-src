package org.ocpsoft.prettytime.units;

import org.ocpsoft.prettytime.TimeUnit;
import org.ocpsoft.prettytime.impl.ResourcesTimeUnit;

/* loaded from: classes9.dex */
public class Week extends ResourcesTimeUnit implements TimeUnit {
    public Week() {
        g(604800000L);
    }

    @Override // org.ocpsoft.prettytime.impl.ResourcesTimeUnit
    protected String e() {
        return "Week";
    }
}
