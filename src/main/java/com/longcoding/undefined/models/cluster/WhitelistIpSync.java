package com.longcoding.undefined.models.cluster;

import com.longcoding.undefined.models.enumeration.SyncType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created by longcoding on 19. 1. 18..
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WhitelistIpSync {

    SyncType type;
    String appId;
    List<String> requestIps;

}