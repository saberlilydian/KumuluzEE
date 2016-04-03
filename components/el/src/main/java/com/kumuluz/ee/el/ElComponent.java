package com.kumuluz.ee.el;

import com.kumuluz.ee.common.Component;
import com.kumuluz.ee.common.KumuluzServer;
import com.kumuluz.ee.common.config.EeConfig;
import com.kumuluz.ee.common.dependencies.EeComponentDef;
import com.kumuluz.ee.common.dependencies.EeComponentType;

import java.util.logging.Logger;

/**
 * @author Tilen
 */
@EeComponentDef(name = "UEL", type = EeComponentType.EL)
public class ElComponent implements Component {

    private Logger log = Logger.getLogger(ElComponent.class.getSimpleName());

    @Override
    public void init(KumuluzServer server, EeConfig eeConfig) {
    }

    @Override
    public void load() {

        log.info("Initiating UEL");
    }
}
