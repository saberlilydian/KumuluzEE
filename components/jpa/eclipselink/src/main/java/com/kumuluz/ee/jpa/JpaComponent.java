package com.kumuluz.ee.jpa;

import com.kumuluz.ee.common.Component;
import com.kumuluz.ee.common.KumuluzServer;
import com.kumuluz.ee.common.config.EeConfig;
import com.kumuluz.ee.common.dependencies.EeComponentDef;
import com.kumuluz.ee.common.dependencies.EeComponentType;
import com.kumuluz.ee.jpa.resources.PersistenceUnitHolder;

import java.util.logging.Logger;

/**
 * @author Tilen
 */
@EeComponentDef(name = "EclipseLink", type = EeComponentType.JPA)
public class JpaComponent implements Component {

    private Logger log = Logger.getLogger(JpaComponent.class.getSimpleName());

    @Override
    public void init(KumuluzServer server, EeConfig eeConfig) {

        PersistenceUnitHolder.getInstance().setConfigs(eeConfig.getPersistenceConfigs());
    }

    @Override
    public void load() {

        log.info("Initiating EclipseLink");
    }
}
