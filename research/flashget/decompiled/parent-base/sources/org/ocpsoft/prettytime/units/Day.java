package org.ocpsoft.prettytime.units;

import org.ocpsoft.prettytime.TimeUnit;
import org.ocpsoft.prettytime.impl.ResourcesTimeUnit;

/* loaded from: classes9.dex */
public class Day extends ResourcesTimeUnit implements TimeUnit {
    public Day() {
        g(86400000L);
    }

    @Override // org.ocpsoft.prettytime.impl.ResourcesTimeUnit
    protected String e() {
        return "Day";
    }
}
