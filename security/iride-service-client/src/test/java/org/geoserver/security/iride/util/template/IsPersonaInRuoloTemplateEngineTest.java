/*
 *  Simple SOAP service client for doing authentication and authorization operations using CSI-Piemonte IRIDE Service.
 *  Copyright (C) 2016  Regione Piemonte (www.regione.piemonte.it)
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License along
 *  with this program; if not, write to the Free Software Foundation, Inc.,
 *  51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */
package org.geoserver.security.iride.util.template;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import org.geoserver.security.iride.entity.IrideIdentity;
import org.geoserver.security.iride.entity.IrideRole;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author "Simone Cornacchia - seancrow76@gmail.com, simone.cornacchia@consulenti.csi.it (CSI:71740)"
 */
public final class IsPersonaInRuoloTemplateEngineTest extends AbstractTemplateEngineTest {

    /**
     * Constructor.
     *
     * @param templateName
     * @param contextBeanName
     */
    public IsPersonaInRuoloTemplateEngineTest(String templateName, String contextBeanName) {
        super(templateName, contextBeanName);
    }

    @Parameters(name = "Processing {0} template, with {1} Spring Bean context")
    public static Collection<String[]> parameters() {
        return Arrays.asList(
            new String[][] {
                {"isPersonaInRuolo", "irideIdentityAndRole"},
            }
        );
    }

    /* (non-Javadoc)
     * @see org.geoserver.security.iride.util.template.AbstractTemplateEngineTest#doTestTemplateCompilation()
     */
    @Override
    protected void doTestTemplateCompilation() throws IOException {
        final String result = this.processTemplate();

        assertThat(result, not(isEmptyOrNullString()));

        final IrideIdentity irideIdentity = (IrideIdentity) this.getContext().get("irideIdentity");

        assertThat(result, hasXPath("/*[local-name()='Envelope']/*[local-name()='Body']/*[local-name()='isPersonaInRuolo']/*[local-name()='in0']/*[local-name()='codFiscale']", equalTo(irideIdentity.getCodFiscale())));
        assertThat(result, hasXPath("/*[local-name()='Envelope']/*[local-name()='Body']/*[local-name()='isPersonaInRuolo']/*[local-name()='in0']/*[local-name()='nome']", equalTo(irideIdentity.getNome())));
        assertThat(result, hasXPath("/*[local-name()='Envelope']/*[local-name()='Body']/*[local-name()='isPersonaInRuolo']/*[local-name()='in0']/*[local-name()='cognome']", equalTo(irideIdentity.getCognome())));
        assertThat(result, hasXPath("/*[local-name()='Envelope']/*[local-name()='Body']/*[local-name()='isPersonaInRuolo']/*[local-name()='in0']/*[local-name()='idProvider']", equalTo(irideIdentity.getIdProvider())));
        assertThat(result, hasXPath("/*[local-name()='Envelope']/*[local-name()='Body']/*[local-name()='isPersonaInRuolo']/*[local-name()='in0']/*[local-name()='timestamp']", equalTo(irideIdentity.getTimestamp())));
        assertThat(result, hasXPath("/*[local-name()='Envelope']/*[local-name()='Body']/*[local-name()='isPersonaInRuolo']/*[local-name()='in0']/*[local-name()='livelloAutenticazione']", equalTo(String.valueOf(irideIdentity.getLivelloAutenticazione()))));
        assertThat(result, hasXPath("/*[local-name()='Envelope']/*[local-name()='Body']/*[local-name()='isPersonaInRuolo']/*[local-name()='in0']/*[local-name()='mac']", equalTo(irideIdentity.getMac())));
        assertThat(result, hasXPath("/*[local-name()='Envelope']/*[local-name()='Body']/*[local-name()='isPersonaInRuolo']/*[local-name()='in0']/*[local-name()='rappresentazioneInterna']", equalTo(irideIdentity.toInternalRepresentation())));

        final IrideRole role = (IrideRole) this.getContext().get("role");

        assertThat(result, hasXPath("/*[local-name()='Envelope']/*[local-name()='Body']/*[local-name()='isPersonaInRuolo']/*[local-name()='in1']/*[local-name()='codiceRuolo']", equalTo(role.getCode())));
        assertThat(result, hasXPath("/*[local-name()='Envelope']/*[local-name()='Body']/*[local-name()='isPersonaInRuolo']/*[local-name()='in1']/*[local-name()='mnemonico']", equalTo(role.toMnemonicRepresentation())));
        assertThat(result, hasXPath("/*[local-name()='Envelope']/*[local-name()='Body']/*[local-name()='isPersonaInRuolo']/*[local-name()='in1']/*[local-name()='codiceDominio']", equalTo(role.getDomain())));
    }

}
