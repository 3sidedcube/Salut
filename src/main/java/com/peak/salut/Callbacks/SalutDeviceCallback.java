package com.peak.salut.Callbacks;

import com.peak.salut.SalutDevice;

/**
 * Created by Mark on 4/5/2015.
 */
public interface SalutDeviceCallback {
    void onDeviceFound(SalutDevice device, String alertId, String reportingDeviceId, int type);
}
