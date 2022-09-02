package com.hrudyplayz.noleafdecay.fixes;

import net.tclproject.mysteriumlib.asm.common.CustomLoadingPlugin;
import net.tclproject.mysteriumlib.asm.common.FirstClassTransformer;

public class PatchesLoader extends CustomLoadingPlugin {

    // Turns on MysteriumASM Lib. You can do this in only one of your Fix Loaders.

    @Override
    public String[] getASMTransformerClass() {
        return new String[]{FirstClassTransformer.class.getName()};
    }

    @Override
    public void registerFixes() {

        //Registers the class where the methods with the @Fix annotation are
    	registerClassWithFixes("com.hrudyplayz.noleafdecay.fixes.ModFixes");
    }
}
