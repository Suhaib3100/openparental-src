package org.ocpsoft.prettytime.units;

import org.ocpsoft.prettytime.TimeUnit;
import org.ocpsoft.prettytime.impl.ResourcesTimeUnit;

/* loaded from: classes9.dex */
public class Millennium extends ResourcesTimeUnit implements TimeUnit {
    public Millennium() {
        g(31556926000000L);
    }

    @Override // org.ocpsoft.prettytime.impl.ResourcesTimeUnit
    protected String e() {
        return "Millennium";
    }
}
