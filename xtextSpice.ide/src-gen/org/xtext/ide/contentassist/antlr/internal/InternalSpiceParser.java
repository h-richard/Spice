package org.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.services.SpiceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpiceParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'methodException'", "'other'", "'unknownNamespace'", "'objectNotFound'", "'methodNotFound'", "'parametersNotMatching'", "'returnTypeNotMatching'", "'e'", "'E'", "'true'", "'false'", "'continue'", "'skip'", "'exit'", "'localstop'", "'Simulation'", "'xmod_id:'", "'('", "','", "')'", "'{'", "'}'", "'Component'", "'View'", "'host'", "'port'", "'period'", "'observe'", "';'", "'='", "'['", "']'", "'Action'", "'on'", "'returns'", "'call'", "'onError'", "'then'", "'-'", "'.'", "'DF'", "'observable'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSpiceParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSpiceParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSpiceParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSpice.g"; }


    	private SpiceGrammarAccess grammarAccess;

    	public void setGrammarAccess(SpiceGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleSimulation"
    // InternalSpice.g:53:1: entryRuleSimulation : ruleSimulation EOF ;
    public final void entryRuleSimulation() throws RecognitionException {
        try {
            // InternalSpice.g:54:1: ( ruleSimulation EOF )
            // InternalSpice.g:55:1: ruleSimulation EOF
            {
             before(grammarAccess.getSimulationRule()); 
            pushFollow(FOLLOW_1);
            ruleSimulation();

            state._fsp--;

             after(grammarAccess.getSimulationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimulation"


    // $ANTLR start "ruleSimulation"
    // InternalSpice.g:62:1: ruleSimulation : ( ( rule__Simulation__Group__0 ) ) ;
    public final void ruleSimulation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:66:2: ( ( ( rule__Simulation__Group__0 ) ) )
            // InternalSpice.g:67:2: ( ( rule__Simulation__Group__0 ) )
            {
            // InternalSpice.g:67:2: ( ( rule__Simulation__Group__0 ) )
            // InternalSpice.g:68:3: ( rule__Simulation__Group__0 )
            {
             before(grammarAccess.getSimulationAccess().getGroup()); 
            // InternalSpice.g:69:3: ( rule__Simulation__Group__0 )
            // InternalSpice.g:69:4: rule__Simulation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Simulation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimulationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimulation"


    // $ANTLR start "entryRuleComponent"
    // InternalSpice.g:78:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalSpice.g:79:1: ( ruleComponent EOF )
            // InternalSpice.g:80:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalSpice.g:87:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:91:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalSpice.g:92:2: ( ( rule__Component__Group__0 ) )
            {
            // InternalSpice.g:92:2: ( ( rule__Component__Group__0 ) )
            // InternalSpice.g:93:3: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // InternalSpice.g:94:3: ( rule__Component__Group__0 )
            // InternalSpice.g:94:4: rule__Component__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleView"
    // InternalSpice.g:103:1: entryRuleView : ruleView EOF ;
    public final void entryRuleView() throws RecognitionException {
        try {
            // InternalSpice.g:104:1: ( ruleView EOF )
            // InternalSpice.g:105:1: ruleView EOF
            {
             before(grammarAccess.getViewRule()); 
            pushFollow(FOLLOW_1);
            ruleView();

            state._fsp--;

             after(grammarAccess.getViewRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleView"


    // $ANTLR start "ruleView"
    // InternalSpice.g:112:1: ruleView : ( ( rule__View__Group__0 ) ) ;
    public final void ruleView() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:116:2: ( ( ( rule__View__Group__0 ) ) )
            // InternalSpice.g:117:2: ( ( rule__View__Group__0 ) )
            {
            // InternalSpice.g:117:2: ( ( rule__View__Group__0 ) )
            // InternalSpice.g:118:3: ( rule__View__Group__0 )
            {
             before(grammarAccess.getViewAccess().getGroup()); 
            // InternalSpice.g:119:3: ( rule__View__Group__0 )
            // InternalSpice.g:119:4: rule__View__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__View__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getViewAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleView"


    // $ANTLR start "entryRuleAttribute"
    // InternalSpice.g:128:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalSpice.g:129:1: ( ruleAttribute EOF )
            // InternalSpice.g:130:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalSpice.g:137:1: ruleAttribute : ( ( rule__Attribute__Alternatives ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:141:2: ( ( ( rule__Attribute__Alternatives ) ) )
            // InternalSpice.g:142:2: ( ( rule__Attribute__Alternatives ) )
            {
            // InternalSpice.g:142:2: ( ( rule__Attribute__Alternatives ) )
            // InternalSpice.g:143:3: ( rule__Attribute__Alternatives )
            {
             before(grammarAccess.getAttributeAccess().getAlternatives()); 
            // InternalSpice.g:144:3: ( rule__Attribute__Alternatives )
            // InternalSpice.g:144:4: rule__Attribute__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleIntBasic"
    // InternalSpice.g:153:1: entryRuleIntBasic : ruleIntBasic EOF ;
    public final void entryRuleIntBasic() throws RecognitionException {
        try {
            // InternalSpice.g:154:1: ( ruleIntBasic EOF )
            // InternalSpice.g:155:1: ruleIntBasic EOF
            {
             before(grammarAccess.getIntBasicRule()); 
            pushFollow(FOLLOW_1);
            ruleIntBasic();

            state._fsp--;

             after(grammarAccess.getIntBasicRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntBasic"


    // $ANTLR start "ruleIntBasic"
    // InternalSpice.g:162:1: ruleIntBasic : ( ( rule__IntBasic__Group__0 ) ) ;
    public final void ruleIntBasic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:166:2: ( ( ( rule__IntBasic__Group__0 ) ) )
            // InternalSpice.g:167:2: ( ( rule__IntBasic__Group__0 ) )
            {
            // InternalSpice.g:167:2: ( ( rule__IntBasic__Group__0 ) )
            // InternalSpice.g:168:3: ( rule__IntBasic__Group__0 )
            {
             before(grammarAccess.getIntBasicAccess().getGroup()); 
            // InternalSpice.g:169:3: ( rule__IntBasic__Group__0 )
            // InternalSpice.g:169:4: rule__IntBasic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntBasic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntBasicAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntBasic"


    // $ANTLR start "entryRuleIntArray"
    // InternalSpice.g:178:1: entryRuleIntArray : ruleIntArray EOF ;
    public final void entryRuleIntArray() throws RecognitionException {
        try {
            // InternalSpice.g:179:1: ( ruleIntArray EOF )
            // InternalSpice.g:180:1: ruleIntArray EOF
            {
             before(grammarAccess.getIntArrayRule()); 
            pushFollow(FOLLOW_1);
            ruleIntArray();

            state._fsp--;

             after(grammarAccess.getIntArrayRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntArray"


    // $ANTLR start "ruleIntArray"
    // InternalSpice.g:187:1: ruleIntArray : ( ( rule__IntArray__Group__0 ) ) ;
    public final void ruleIntArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:191:2: ( ( ( rule__IntArray__Group__0 ) ) )
            // InternalSpice.g:192:2: ( ( rule__IntArray__Group__0 ) )
            {
            // InternalSpice.g:192:2: ( ( rule__IntArray__Group__0 ) )
            // InternalSpice.g:193:3: ( rule__IntArray__Group__0 )
            {
             before(grammarAccess.getIntArrayAccess().getGroup()); 
            // InternalSpice.g:194:3: ( rule__IntArray__Group__0 )
            // InternalSpice.g:194:4: rule__IntArray__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__IntArray__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntArray"


    // $ANTLR start "entryRuleDoubleBasic"
    // InternalSpice.g:203:1: entryRuleDoubleBasic : ruleDoubleBasic EOF ;
    public final void entryRuleDoubleBasic() throws RecognitionException {
        try {
            // InternalSpice.g:204:1: ( ruleDoubleBasic EOF )
            // InternalSpice.g:205:1: ruleDoubleBasic EOF
            {
             before(grammarAccess.getDoubleBasicRule()); 
            pushFollow(FOLLOW_1);
            ruleDoubleBasic();

            state._fsp--;

             after(grammarAccess.getDoubleBasicRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDoubleBasic"


    // $ANTLR start "ruleDoubleBasic"
    // InternalSpice.g:212:1: ruleDoubleBasic : ( ( rule__DoubleBasic__Group__0 ) ) ;
    public final void ruleDoubleBasic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:216:2: ( ( ( rule__DoubleBasic__Group__0 ) ) )
            // InternalSpice.g:217:2: ( ( rule__DoubleBasic__Group__0 ) )
            {
            // InternalSpice.g:217:2: ( ( rule__DoubleBasic__Group__0 ) )
            // InternalSpice.g:218:3: ( rule__DoubleBasic__Group__0 )
            {
             before(grammarAccess.getDoubleBasicAccess().getGroup()); 
            // InternalSpice.g:219:3: ( rule__DoubleBasic__Group__0 )
            // InternalSpice.g:219:4: rule__DoubleBasic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DoubleBasic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDoubleBasicAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDoubleBasic"


    // $ANTLR start "entryRuleDoubleArray"
    // InternalSpice.g:228:1: entryRuleDoubleArray : ruleDoubleArray EOF ;
    public final void entryRuleDoubleArray() throws RecognitionException {
        try {
            // InternalSpice.g:229:1: ( ruleDoubleArray EOF )
            // InternalSpice.g:230:1: ruleDoubleArray EOF
            {
             before(grammarAccess.getDoubleArrayRule()); 
            pushFollow(FOLLOW_1);
            ruleDoubleArray();

            state._fsp--;

             after(grammarAccess.getDoubleArrayRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDoubleArray"


    // $ANTLR start "ruleDoubleArray"
    // InternalSpice.g:237:1: ruleDoubleArray : ( ( rule__DoubleArray__Group__0 ) ) ;
    public final void ruleDoubleArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:241:2: ( ( ( rule__DoubleArray__Group__0 ) ) )
            // InternalSpice.g:242:2: ( ( rule__DoubleArray__Group__0 ) )
            {
            // InternalSpice.g:242:2: ( ( rule__DoubleArray__Group__0 ) )
            // InternalSpice.g:243:3: ( rule__DoubleArray__Group__0 )
            {
             before(grammarAccess.getDoubleArrayAccess().getGroup()); 
            // InternalSpice.g:244:3: ( rule__DoubleArray__Group__0 )
            // InternalSpice.g:244:4: rule__DoubleArray__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DoubleArray__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDoubleArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDoubleArray"


    // $ANTLR start "entryRuleStringBasic"
    // InternalSpice.g:253:1: entryRuleStringBasic : ruleStringBasic EOF ;
    public final void entryRuleStringBasic() throws RecognitionException {
        try {
            // InternalSpice.g:254:1: ( ruleStringBasic EOF )
            // InternalSpice.g:255:1: ruleStringBasic EOF
            {
             before(grammarAccess.getStringBasicRule()); 
            pushFollow(FOLLOW_1);
            ruleStringBasic();

            state._fsp--;

             after(grammarAccess.getStringBasicRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringBasic"


    // $ANTLR start "ruleStringBasic"
    // InternalSpice.g:262:1: ruleStringBasic : ( ( rule__StringBasic__Group__0 ) ) ;
    public final void ruleStringBasic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:266:2: ( ( ( rule__StringBasic__Group__0 ) ) )
            // InternalSpice.g:267:2: ( ( rule__StringBasic__Group__0 ) )
            {
            // InternalSpice.g:267:2: ( ( rule__StringBasic__Group__0 ) )
            // InternalSpice.g:268:3: ( rule__StringBasic__Group__0 )
            {
             before(grammarAccess.getStringBasicAccess().getGroup()); 
            // InternalSpice.g:269:3: ( rule__StringBasic__Group__0 )
            // InternalSpice.g:269:4: rule__StringBasic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringBasic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringBasicAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringBasic"


    // $ANTLR start "entryRuleStringArray"
    // InternalSpice.g:278:1: entryRuleStringArray : ruleStringArray EOF ;
    public final void entryRuleStringArray() throws RecognitionException {
        try {
            // InternalSpice.g:279:1: ( ruleStringArray EOF )
            // InternalSpice.g:280:1: ruleStringArray EOF
            {
             before(grammarAccess.getStringArrayRule()); 
            pushFollow(FOLLOW_1);
            ruleStringArray();

            state._fsp--;

             after(grammarAccess.getStringArrayRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringArray"


    // $ANTLR start "ruleStringArray"
    // InternalSpice.g:287:1: ruleStringArray : ( ( rule__StringArray__Group__0 ) ) ;
    public final void ruleStringArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:291:2: ( ( ( rule__StringArray__Group__0 ) ) )
            // InternalSpice.g:292:2: ( ( rule__StringArray__Group__0 ) )
            {
            // InternalSpice.g:292:2: ( ( rule__StringArray__Group__0 ) )
            // InternalSpice.g:293:3: ( rule__StringArray__Group__0 )
            {
             before(grammarAccess.getStringArrayAccess().getGroup()); 
            // InternalSpice.g:294:3: ( rule__StringArray__Group__0 )
            // InternalSpice.g:294:4: rule__StringArray__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringArray__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringArray"


    // $ANTLR start "entryRuleBooleanBasic"
    // InternalSpice.g:303:1: entryRuleBooleanBasic : ruleBooleanBasic EOF ;
    public final void entryRuleBooleanBasic() throws RecognitionException {
        try {
            // InternalSpice.g:304:1: ( ruleBooleanBasic EOF )
            // InternalSpice.g:305:1: ruleBooleanBasic EOF
            {
             before(grammarAccess.getBooleanBasicRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanBasic();

            state._fsp--;

             after(grammarAccess.getBooleanBasicRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanBasic"


    // $ANTLR start "ruleBooleanBasic"
    // InternalSpice.g:312:1: ruleBooleanBasic : ( ( rule__BooleanBasic__Group__0 ) ) ;
    public final void ruleBooleanBasic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:316:2: ( ( ( rule__BooleanBasic__Group__0 ) ) )
            // InternalSpice.g:317:2: ( ( rule__BooleanBasic__Group__0 ) )
            {
            // InternalSpice.g:317:2: ( ( rule__BooleanBasic__Group__0 ) )
            // InternalSpice.g:318:3: ( rule__BooleanBasic__Group__0 )
            {
             before(grammarAccess.getBooleanBasicAccess().getGroup()); 
            // InternalSpice.g:319:3: ( rule__BooleanBasic__Group__0 )
            // InternalSpice.g:319:4: rule__BooleanBasic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanBasic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanBasicAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanBasic"


    // $ANTLR start "entryRuleBooleanArray"
    // InternalSpice.g:328:1: entryRuleBooleanArray : ruleBooleanArray EOF ;
    public final void entryRuleBooleanArray() throws RecognitionException {
        try {
            // InternalSpice.g:329:1: ( ruleBooleanArray EOF )
            // InternalSpice.g:330:1: ruleBooleanArray EOF
            {
             before(grammarAccess.getBooleanArrayRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanArray();

            state._fsp--;

             after(grammarAccess.getBooleanArrayRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanArray"


    // $ANTLR start "ruleBooleanArray"
    // InternalSpice.g:337:1: ruleBooleanArray : ( ( rule__BooleanArray__Group__0 ) ) ;
    public final void ruleBooleanArray() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:341:2: ( ( ( rule__BooleanArray__Group__0 ) ) )
            // InternalSpice.g:342:2: ( ( rule__BooleanArray__Group__0 ) )
            {
            // InternalSpice.g:342:2: ( ( rule__BooleanArray__Group__0 ) )
            // InternalSpice.g:343:3: ( rule__BooleanArray__Group__0 )
            {
             before(grammarAccess.getBooleanArrayAccess().getGroup()); 
            // InternalSpice.g:344:3: ( rule__BooleanArray__Group__0 )
            // InternalSpice.g:344:4: rule__BooleanArray__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanArray__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanArray"


    // $ANTLR start "entryRuleXmod_Action"
    // InternalSpice.g:353:1: entryRuleXmod_Action : ruleXmod_Action EOF ;
    public final void entryRuleXmod_Action() throws RecognitionException {
        try {
            // InternalSpice.g:354:1: ( ruleXmod_Action EOF )
            // InternalSpice.g:355:1: ruleXmod_Action EOF
            {
             before(grammarAccess.getXmod_ActionRule()); 
            pushFollow(FOLLOW_1);
            ruleXmod_Action();

            state._fsp--;

             after(grammarAccess.getXmod_ActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXmod_Action"


    // $ANTLR start "ruleXmod_Action"
    // InternalSpice.g:362:1: ruleXmod_Action : ( ( rule__Xmod_Action__Group__0 ) ) ;
    public final void ruleXmod_Action() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:366:2: ( ( ( rule__Xmod_Action__Group__0 ) ) )
            // InternalSpice.g:367:2: ( ( rule__Xmod_Action__Group__0 ) )
            {
            // InternalSpice.g:367:2: ( ( rule__Xmod_Action__Group__0 ) )
            // InternalSpice.g:368:3: ( rule__Xmod_Action__Group__0 )
            {
             before(grammarAccess.getXmod_ActionAccess().getGroup()); 
            // InternalSpice.g:369:3: ( rule__Xmod_Action__Group__0 )
            // InternalSpice.g:369:4: rule__Xmod_Action__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Xmod_Action__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXmod_ActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXmod_Action"


    // $ANTLR start "entryRuleXmod_OperationDef"
    // InternalSpice.g:378:1: entryRuleXmod_OperationDef : ruleXmod_OperationDef EOF ;
    public final void entryRuleXmod_OperationDef() throws RecognitionException {
        try {
            // InternalSpice.g:379:1: ( ruleXmod_OperationDef EOF )
            // InternalSpice.g:380:1: ruleXmod_OperationDef EOF
            {
             before(grammarAccess.getXmod_OperationDefRule()); 
            pushFollow(FOLLOW_1);
            ruleXmod_OperationDef();

            state._fsp--;

             after(grammarAccess.getXmod_OperationDefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXmod_OperationDef"


    // $ANTLR start "ruleXmod_OperationDef"
    // InternalSpice.g:387:1: ruleXmod_OperationDef : ( ( rule__Xmod_OperationDef__Group__0 ) ) ;
    public final void ruleXmod_OperationDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:391:2: ( ( ( rule__Xmod_OperationDef__Group__0 ) ) )
            // InternalSpice.g:392:2: ( ( rule__Xmod_OperationDef__Group__0 ) )
            {
            // InternalSpice.g:392:2: ( ( rule__Xmod_OperationDef__Group__0 ) )
            // InternalSpice.g:393:3: ( rule__Xmod_OperationDef__Group__0 )
            {
             before(grammarAccess.getXmod_OperationDefAccess().getGroup()); 
            // InternalSpice.g:394:3: ( rule__Xmod_OperationDef__Group__0 )
            // InternalSpice.g:394:4: rule__Xmod_OperationDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Xmod_OperationDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXmod_OperationDefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXmod_OperationDef"


    // $ANTLR start "entryRuleXmod_OperationCall"
    // InternalSpice.g:403:1: entryRuleXmod_OperationCall : ruleXmod_OperationCall EOF ;
    public final void entryRuleXmod_OperationCall() throws RecognitionException {
        try {
            // InternalSpice.g:404:1: ( ruleXmod_OperationCall EOF )
            // InternalSpice.g:405:1: ruleXmod_OperationCall EOF
            {
             before(grammarAccess.getXmod_OperationCallRule()); 
            pushFollow(FOLLOW_1);
            ruleXmod_OperationCall();

            state._fsp--;

             after(grammarAccess.getXmod_OperationCallRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXmod_OperationCall"


    // $ANTLR start "ruleXmod_OperationCall"
    // InternalSpice.g:412:1: ruleXmod_OperationCall : ( ( rule__Xmod_OperationCall__Group__0 ) ) ;
    public final void ruleXmod_OperationCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:416:2: ( ( ( rule__Xmod_OperationCall__Group__0 ) ) )
            // InternalSpice.g:417:2: ( ( rule__Xmod_OperationCall__Group__0 ) )
            {
            // InternalSpice.g:417:2: ( ( rule__Xmod_OperationCall__Group__0 ) )
            // InternalSpice.g:418:3: ( rule__Xmod_OperationCall__Group__0 )
            {
             before(grammarAccess.getXmod_OperationCallAccess().getGroup()); 
            // InternalSpice.g:419:3: ( rule__Xmod_OperationCall__Group__0 )
            // InternalSpice.g:419:4: rule__Xmod_OperationCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Xmod_OperationCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXmod_OperationCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXmod_OperationCall"


    // $ANTLR start "entryRuleXmod_Exception"
    // InternalSpice.g:428:1: entryRuleXmod_Exception : ruleXmod_Exception EOF ;
    public final void entryRuleXmod_Exception() throws RecognitionException {
        try {
            // InternalSpice.g:429:1: ( ruleXmod_Exception EOF )
            // InternalSpice.g:430:1: ruleXmod_Exception EOF
            {
             before(grammarAccess.getXmod_ExceptionRule()); 
            pushFollow(FOLLOW_1);
            ruleXmod_Exception();

            state._fsp--;

             after(grammarAccess.getXmod_ExceptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXmod_Exception"


    // $ANTLR start "ruleXmod_Exception"
    // InternalSpice.g:437:1: ruleXmod_Exception : ( ( rule__Xmod_Exception__Group__0 ) ) ;
    public final void ruleXmod_Exception() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:441:2: ( ( ( rule__Xmod_Exception__Group__0 ) ) )
            // InternalSpice.g:442:2: ( ( rule__Xmod_Exception__Group__0 ) )
            {
            // InternalSpice.g:442:2: ( ( rule__Xmod_Exception__Group__0 ) )
            // InternalSpice.g:443:3: ( rule__Xmod_Exception__Group__0 )
            {
             before(grammarAccess.getXmod_ExceptionAccess().getGroup()); 
            // InternalSpice.g:444:3: ( rule__Xmod_Exception__Group__0 )
            // InternalSpice.g:444:4: rule__Xmod_Exception__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Xmod_Exception__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXmod_ExceptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXmod_Exception"


    // $ANTLR start "entryRuleXmod_ExceptionKind_Filtered"
    // InternalSpice.g:453:1: entryRuleXmod_ExceptionKind_Filtered : ruleXmod_ExceptionKind_Filtered EOF ;
    public final void entryRuleXmod_ExceptionKind_Filtered() throws RecognitionException {
        try {
            // InternalSpice.g:454:1: ( ruleXmod_ExceptionKind_Filtered EOF )
            // InternalSpice.g:455:1: ruleXmod_ExceptionKind_Filtered EOF
            {
             before(grammarAccess.getXmod_ExceptionKind_FilteredRule()); 
            pushFollow(FOLLOW_1);
            ruleXmod_ExceptionKind_Filtered();

            state._fsp--;

             after(grammarAccess.getXmod_ExceptionKind_FilteredRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXmod_ExceptionKind_Filtered"


    // $ANTLR start "ruleXmod_ExceptionKind_Filtered"
    // InternalSpice.g:462:1: ruleXmod_ExceptionKind_Filtered : ( 'methodException' ) ;
    public final void ruleXmod_ExceptionKind_Filtered() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:466:2: ( ( 'methodException' ) )
            // InternalSpice.g:467:2: ( 'methodException' )
            {
            // InternalSpice.g:467:2: ( 'methodException' )
            // InternalSpice.g:468:3: 'methodException'
            {
             before(grammarAccess.getXmod_ExceptionKind_FilteredAccess().getMethodExceptionKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getXmod_ExceptionKind_FilteredAccess().getMethodExceptionKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXmod_ExceptionKind_Filtered"


    // $ANTLR start "entryRuleXmod_ExceptionKind_Unfiltered"
    // InternalSpice.g:478:1: entryRuleXmod_ExceptionKind_Unfiltered : ruleXmod_ExceptionKind_Unfiltered EOF ;
    public final void entryRuleXmod_ExceptionKind_Unfiltered() throws RecognitionException {
        try {
            // InternalSpice.g:479:1: ( ruleXmod_ExceptionKind_Unfiltered EOF )
            // InternalSpice.g:480:1: ruleXmod_ExceptionKind_Unfiltered EOF
            {
             before(grammarAccess.getXmod_ExceptionKind_UnfilteredRule()); 
            pushFollow(FOLLOW_1);
            ruleXmod_ExceptionKind_Unfiltered();

            state._fsp--;

             after(grammarAccess.getXmod_ExceptionKind_UnfilteredRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXmod_ExceptionKind_Unfiltered"


    // $ANTLR start "ruleXmod_ExceptionKind_Unfiltered"
    // InternalSpice.g:487:1: ruleXmod_ExceptionKind_Unfiltered : ( ( rule__Xmod_ExceptionKind_Unfiltered__Alternatives ) ) ;
    public final void ruleXmod_ExceptionKind_Unfiltered() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:491:2: ( ( ( rule__Xmod_ExceptionKind_Unfiltered__Alternatives ) ) )
            // InternalSpice.g:492:2: ( ( rule__Xmod_ExceptionKind_Unfiltered__Alternatives ) )
            {
            // InternalSpice.g:492:2: ( ( rule__Xmod_ExceptionKind_Unfiltered__Alternatives ) )
            // InternalSpice.g:493:3: ( rule__Xmod_ExceptionKind_Unfiltered__Alternatives )
            {
             before(grammarAccess.getXmod_ExceptionKind_UnfilteredAccess().getAlternatives()); 
            // InternalSpice.g:494:3: ( rule__Xmod_ExceptionKind_Unfiltered__Alternatives )
            // InternalSpice.g:494:4: rule__Xmod_ExceptionKind_Unfiltered__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Xmod_ExceptionKind_Unfiltered__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getXmod_ExceptionKind_UnfilteredAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXmod_ExceptionKind_Unfiltered"


    // $ANTLR start "entryRuleEDouble"
    // InternalSpice.g:503:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalSpice.g:504:1: ( ruleEDouble EOF )
            // InternalSpice.g:505:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalSpice.g:512:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:516:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalSpice.g:517:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalSpice.g:517:2: ( ( rule__EDouble__Group__0 ) )
            // InternalSpice.g:518:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalSpice.g:519:3: ( rule__EDouble__Group__0 )
            // InternalSpice.g:519:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEInt"
    // InternalSpice.g:528:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalSpice.g:529:1: ( ruleEInt EOF )
            // InternalSpice.g:530:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalSpice.g:537:1: ruleEInt : ( RULE_INT ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:541:2: ( ( RULE_INT ) )
            // InternalSpice.g:542:2: ( RULE_INT )
            {
            // InternalSpice.g:542:2: ( RULE_INT )
            // InternalSpice.g:543:3: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleELong"
    // InternalSpice.g:553:1: entryRuleELong : ruleELong EOF ;
    public final void entryRuleELong() throws RecognitionException {
        try {
            // InternalSpice.g:554:1: ( ruleELong EOF )
            // InternalSpice.g:555:1: ruleELong EOF
            {
             before(grammarAccess.getELongRule()); 
            pushFollow(FOLLOW_1);
            ruleELong();

            state._fsp--;

             after(grammarAccess.getELongRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleELong"


    // $ANTLR start "ruleELong"
    // InternalSpice.g:562:1: ruleELong : ( RULE_INT ) ;
    public final void ruleELong() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:566:2: ( ( RULE_INT ) )
            // InternalSpice.g:567:2: ( RULE_INT )
            {
            // InternalSpice.g:567:2: ( RULE_INT )
            // InternalSpice.g:568:3: RULE_INT
            {
             before(grammarAccess.getELongAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getELongAccess().getINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleELong"


    // $ANTLR start "entryRuleEString"
    // InternalSpice.g:578:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSpice.g:579:1: ( ruleEString EOF )
            // InternalSpice.g:580:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalSpice.g:587:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:591:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalSpice.g:592:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalSpice.g:592:2: ( ( rule__EString__Alternatives ) )
            // InternalSpice.g:593:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalSpice.g:594:3: ( rule__EString__Alternatives )
            // InternalSpice.g:594:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEBoolean"
    // InternalSpice.g:603:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalSpice.g:604:1: ( ruleEBoolean EOF )
            // InternalSpice.g:605:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalSpice.g:612:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:616:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalSpice.g:617:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalSpice.g:617:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalSpice.g:618:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalSpice.g:619:3: ( rule__EBoolean__Alternatives )
            // InternalSpice.g:619:4: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "ruleXmod_ExceptionReaction"
    // InternalSpice.g:628:1: ruleXmod_ExceptionReaction : ( ( rule__Xmod_ExceptionReaction__Alternatives ) ) ;
    public final void ruleXmod_ExceptionReaction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:632:1: ( ( ( rule__Xmod_ExceptionReaction__Alternatives ) ) )
            // InternalSpice.g:633:2: ( ( rule__Xmod_ExceptionReaction__Alternatives ) )
            {
            // InternalSpice.g:633:2: ( ( rule__Xmod_ExceptionReaction__Alternatives ) )
            // InternalSpice.g:634:3: ( rule__Xmod_ExceptionReaction__Alternatives )
            {
             before(grammarAccess.getXmod_ExceptionReactionAccess().getAlternatives()); 
            // InternalSpice.g:635:3: ( rule__Xmod_ExceptionReaction__Alternatives )
            // InternalSpice.g:635:4: rule__Xmod_ExceptionReaction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Xmod_ExceptionReaction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getXmod_ExceptionReactionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXmod_ExceptionReaction"


    // $ANTLR start "rule__Attribute__Alternatives"
    // InternalSpice.g:643:1: rule__Attribute__Alternatives : ( ( ruleIntBasic ) | ( ruleIntArray ) | ( ruleDoubleBasic ) | ( ruleDoubleArray ) | ( ruleStringBasic ) | ( ruleStringArray ) | ( ruleBooleanBasic ) | ( ruleBooleanArray ) );
    public final void rule__Attribute__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:647:1: ( ( ruleIntBasic ) | ( ruleIntArray ) | ( ruleDoubleBasic ) | ( ruleDoubleArray ) | ( ruleStringBasic ) | ( ruleStringArray ) | ( ruleBooleanBasic ) | ( ruleBooleanArray ) )
            int alt1=8;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalSpice.g:648:2: ( ruleIntBasic )
                    {
                    // InternalSpice.g:648:2: ( ruleIntBasic )
                    // InternalSpice.g:649:3: ruleIntBasic
                    {
                     before(grammarAccess.getAttributeAccess().getIntBasicParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntBasic();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getIntBasicParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpice.g:654:2: ( ruleIntArray )
                    {
                    // InternalSpice.g:654:2: ( ruleIntArray )
                    // InternalSpice.g:655:3: ruleIntArray
                    {
                     before(grammarAccess.getAttributeAccess().getIntArrayParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIntArray();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getIntArrayParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpice.g:660:2: ( ruleDoubleBasic )
                    {
                    // InternalSpice.g:660:2: ( ruleDoubleBasic )
                    // InternalSpice.g:661:3: ruleDoubleBasic
                    {
                     before(grammarAccess.getAttributeAccess().getDoubleBasicParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDoubleBasic();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getDoubleBasicParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSpice.g:666:2: ( ruleDoubleArray )
                    {
                    // InternalSpice.g:666:2: ( ruleDoubleArray )
                    // InternalSpice.g:667:3: ruleDoubleArray
                    {
                     before(grammarAccess.getAttributeAccess().getDoubleArrayParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDoubleArray();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getDoubleArrayParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSpice.g:672:2: ( ruleStringBasic )
                    {
                    // InternalSpice.g:672:2: ( ruleStringBasic )
                    // InternalSpice.g:673:3: ruleStringBasic
                    {
                     before(grammarAccess.getAttributeAccess().getStringBasicParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleStringBasic();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getStringBasicParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSpice.g:678:2: ( ruleStringArray )
                    {
                    // InternalSpice.g:678:2: ( ruleStringArray )
                    // InternalSpice.g:679:3: ruleStringArray
                    {
                     before(grammarAccess.getAttributeAccess().getStringArrayParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleStringArray();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getStringArrayParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSpice.g:684:2: ( ruleBooleanBasic )
                    {
                    // InternalSpice.g:684:2: ( ruleBooleanBasic )
                    // InternalSpice.g:685:3: ruleBooleanBasic
                    {
                     before(grammarAccess.getAttributeAccess().getBooleanBasicParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanBasic();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getBooleanBasicParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSpice.g:690:2: ( ruleBooleanArray )
                    {
                    // InternalSpice.g:690:2: ( ruleBooleanArray )
                    // InternalSpice.g:691:3: ruleBooleanArray
                    {
                     before(grammarAccess.getAttributeAccess().getBooleanArrayParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanArray();

                    state._fsp--;

                     after(grammarAccess.getAttributeAccess().getBooleanArrayParserRuleCall_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Alternatives"


    // $ANTLR start "rule__Xmod_Exception__Alternatives_1"
    // InternalSpice.g:700:1: rule__Xmod_Exception__Alternatives_1 : ( ( ( rule__Xmod_Exception__KindAssignment_1_0 ) ) | ( ( rule__Xmod_Exception__Group_1_1__0 ) ) );
    public final void rule__Xmod_Exception__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:704:1: ( ( ( rule__Xmod_Exception__KindAssignment_1_0 ) ) | ( ( rule__Xmod_Exception__Group_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=12 && LA2_0<=17)) ) {
                alt2=1;
            }
            else if ( (LA2_0==11) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSpice.g:705:2: ( ( rule__Xmod_Exception__KindAssignment_1_0 ) )
                    {
                    // InternalSpice.g:705:2: ( ( rule__Xmod_Exception__KindAssignment_1_0 ) )
                    // InternalSpice.g:706:3: ( rule__Xmod_Exception__KindAssignment_1_0 )
                    {
                     before(grammarAccess.getXmod_ExceptionAccess().getKindAssignment_1_0()); 
                    // InternalSpice.g:707:3: ( rule__Xmod_Exception__KindAssignment_1_0 )
                    // InternalSpice.g:707:4: rule__Xmod_Exception__KindAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Xmod_Exception__KindAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXmod_ExceptionAccess().getKindAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpice.g:711:2: ( ( rule__Xmod_Exception__Group_1_1__0 ) )
                    {
                    // InternalSpice.g:711:2: ( ( rule__Xmod_Exception__Group_1_1__0 ) )
                    // InternalSpice.g:712:3: ( rule__Xmod_Exception__Group_1_1__0 )
                    {
                     before(grammarAccess.getXmod_ExceptionAccess().getGroup_1_1()); 
                    // InternalSpice.g:713:3: ( rule__Xmod_Exception__Group_1_1__0 )
                    // InternalSpice.g:713:4: rule__Xmod_Exception__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Xmod_Exception__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getXmod_ExceptionAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_Exception__Alternatives_1"


    // $ANTLR start "rule__Xmod_ExceptionKind_Unfiltered__Alternatives"
    // InternalSpice.g:721:1: rule__Xmod_ExceptionKind_Unfiltered__Alternatives : ( ( 'other' ) | ( 'unknownNamespace' ) | ( 'objectNotFound' ) | ( 'methodNotFound' ) | ( 'parametersNotMatching' ) | ( 'returnTypeNotMatching' ) );
    public final void rule__Xmod_ExceptionKind_Unfiltered__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:725:1: ( ( 'other' ) | ( 'unknownNamespace' ) | ( 'objectNotFound' ) | ( 'methodNotFound' ) | ( 'parametersNotMatching' ) | ( 'returnTypeNotMatching' ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            case 15:
                {
                alt3=4;
                }
                break;
            case 16:
                {
                alt3=5;
                }
                break;
            case 17:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalSpice.g:726:2: ( 'other' )
                    {
                    // InternalSpice.g:726:2: ( 'other' )
                    // InternalSpice.g:727:3: 'other'
                    {
                     before(grammarAccess.getXmod_ExceptionKind_UnfilteredAccess().getOtherKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getXmod_ExceptionKind_UnfilteredAccess().getOtherKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpice.g:732:2: ( 'unknownNamespace' )
                    {
                    // InternalSpice.g:732:2: ( 'unknownNamespace' )
                    // InternalSpice.g:733:3: 'unknownNamespace'
                    {
                     before(grammarAccess.getXmod_ExceptionKind_UnfilteredAccess().getUnknownNamespaceKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getXmod_ExceptionKind_UnfilteredAccess().getUnknownNamespaceKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpice.g:738:2: ( 'objectNotFound' )
                    {
                    // InternalSpice.g:738:2: ( 'objectNotFound' )
                    // InternalSpice.g:739:3: 'objectNotFound'
                    {
                     before(grammarAccess.getXmod_ExceptionKind_UnfilteredAccess().getObjectNotFoundKeyword_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getXmod_ExceptionKind_UnfilteredAccess().getObjectNotFoundKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSpice.g:744:2: ( 'methodNotFound' )
                    {
                    // InternalSpice.g:744:2: ( 'methodNotFound' )
                    // InternalSpice.g:745:3: 'methodNotFound'
                    {
                     before(grammarAccess.getXmod_ExceptionKind_UnfilteredAccess().getMethodNotFoundKeyword_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getXmod_ExceptionKind_UnfilteredAccess().getMethodNotFoundKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSpice.g:750:2: ( 'parametersNotMatching' )
                    {
                    // InternalSpice.g:750:2: ( 'parametersNotMatching' )
                    // InternalSpice.g:751:3: 'parametersNotMatching'
                    {
                     before(grammarAccess.getXmod_ExceptionKind_UnfilteredAccess().getParametersNotMatchingKeyword_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getXmod_ExceptionKind_UnfilteredAccess().getParametersNotMatchingKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSpice.g:756:2: ( 'returnTypeNotMatching' )
                    {
                    // InternalSpice.g:756:2: ( 'returnTypeNotMatching' )
                    // InternalSpice.g:757:3: 'returnTypeNotMatching'
                    {
                     before(grammarAccess.getXmod_ExceptionKind_UnfilteredAccess().getReturnTypeNotMatchingKeyword_5()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getXmod_ExceptionKind_UnfilteredAccess().getReturnTypeNotMatchingKeyword_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_ExceptionKind_Unfiltered__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalSpice.g:766:1: rule__EDouble__Alternatives_4_0 : ( ( 'e' ) | ( 'E' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:770:1: ( ( 'e' ) | ( 'E' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            else if ( (LA4_0==19) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSpice.g:771:2: ( 'e' )
                    {
                    // InternalSpice.g:771:2: ( 'e' )
                    // InternalSpice.g:772:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpice.g:777:2: ( 'E' )
                    {
                    // InternalSpice.g:777:2: ( 'E' )
                    // InternalSpice.g:778:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalSpice.g:787:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:791:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSpice.g:792:2: ( RULE_STRING )
                    {
                    // InternalSpice.g:792:2: ( RULE_STRING )
                    // InternalSpice.g:793:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpice.g:798:2: ( RULE_ID )
                    {
                    // InternalSpice.g:798:2: ( RULE_ID )
                    // InternalSpice.g:799:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalSpice.g:808:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:812:1: ( ( 'true' ) | ( 'false' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            else if ( (LA6_0==21) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalSpice.g:813:2: ( 'true' )
                    {
                    // InternalSpice.g:813:2: ( 'true' )
                    // InternalSpice.g:814:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpice.g:819:2: ( 'false' )
                    {
                    // InternalSpice.g:819:2: ( 'false' )
                    // InternalSpice.g:820:3: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__Xmod_ExceptionReaction__Alternatives"
    // InternalSpice.g:829:1: rule__Xmod_ExceptionReaction__Alternatives : ( ( ( 'continue' ) ) | ( ( 'skip' ) ) | ( ( 'exit' ) ) | ( ( 'localstop' ) ) );
    public final void rule__Xmod_ExceptionReaction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:833:1: ( ( ( 'continue' ) ) | ( ( 'skip' ) ) | ( ( 'exit' ) ) | ( ( 'localstop' ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt7=1;
                }
                break;
            case 23:
                {
                alt7=2;
                }
                break;
            case 24:
                {
                alt7=3;
                }
                break;
            case 25:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSpice.g:834:2: ( ( 'continue' ) )
                    {
                    // InternalSpice.g:834:2: ( ( 'continue' ) )
                    // InternalSpice.g:835:3: ( 'continue' )
                    {
                     before(grammarAccess.getXmod_ExceptionReactionAccess().getContinueEnumLiteralDeclaration_0()); 
                    // InternalSpice.g:836:3: ( 'continue' )
                    // InternalSpice.g:836:4: 'continue'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getXmod_ExceptionReactionAccess().getContinueEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpice.g:840:2: ( ( 'skip' ) )
                    {
                    // InternalSpice.g:840:2: ( ( 'skip' ) )
                    // InternalSpice.g:841:3: ( 'skip' )
                    {
                     before(grammarAccess.getXmod_ExceptionReactionAccess().getSkipEnumLiteralDeclaration_1()); 
                    // InternalSpice.g:842:3: ( 'skip' )
                    // InternalSpice.g:842:4: 'skip'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getXmod_ExceptionReactionAccess().getSkipEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpice.g:846:2: ( ( 'exit' ) )
                    {
                    // InternalSpice.g:846:2: ( ( 'exit' ) )
                    // InternalSpice.g:847:3: ( 'exit' )
                    {
                     before(grammarAccess.getXmod_ExceptionReactionAccess().getExitEnumLiteralDeclaration_2()); 
                    // InternalSpice.g:848:3: ( 'exit' )
                    // InternalSpice.g:848:4: 'exit'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getXmod_ExceptionReactionAccess().getExitEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSpice.g:852:2: ( ( 'localstop' ) )
                    {
                    // InternalSpice.g:852:2: ( ( 'localstop' ) )
                    // InternalSpice.g:853:3: ( 'localstop' )
                    {
                     before(grammarAccess.getXmod_ExceptionReactionAccess().getLocalstopEnumLiteralDeclaration_3()); 
                    // InternalSpice.g:854:3: ( 'localstop' )
                    // InternalSpice.g:854:4: 'localstop'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getXmod_ExceptionReactionAccess().getLocalstopEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_ExceptionReaction__Alternatives"


    // $ANTLR start "rule__Simulation__Group__0"
    // InternalSpice.g:862:1: rule__Simulation__Group__0 : rule__Simulation__Group__0__Impl rule__Simulation__Group__1 ;
    public final void rule__Simulation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:866:1: ( rule__Simulation__Group__0__Impl rule__Simulation__Group__1 )
            // InternalSpice.g:867:2: rule__Simulation__Group__0__Impl rule__Simulation__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Simulation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simulation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group__0"


    // $ANTLR start "rule__Simulation__Group__0__Impl"
    // InternalSpice.g:874:1: rule__Simulation__Group__0__Impl : ( 'Simulation' ) ;
    public final void rule__Simulation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:878:1: ( ( 'Simulation' ) )
            // InternalSpice.g:879:1: ( 'Simulation' )
            {
            // InternalSpice.g:879:1: ( 'Simulation' )
            // InternalSpice.g:880:2: 'Simulation'
            {
             before(grammarAccess.getSimulationAccess().getSimulationKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSimulationAccess().getSimulationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group__0__Impl"


    // $ANTLR start "rule__Simulation__Group__1"
    // InternalSpice.g:889:1: rule__Simulation__Group__1 : rule__Simulation__Group__1__Impl rule__Simulation__Group__2 ;
    public final void rule__Simulation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:893:1: ( rule__Simulation__Group__1__Impl rule__Simulation__Group__2 )
            // InternalSpice.g:894:2: rule__Simulation__Group__1__Impl rule__Simulation__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Simulation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simulation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group__1"


    // $ANTLR start "rule__Simulation__Group__1__Impl"
    // InternalSpice.g:901:1: rule__Simulation__Group__1__Impl : ( 'xmod_id:' ) ;
    public final void rule__Simulation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:905:1: ( ( 'xmod_id:' ) )
            // InternalSpice.g:906:1: ( 'xmod_id:' )
            {
            // InternalSpice.g:906:1: ( 'xmod_id:' )
            // InternalSpice.g:907:2: 'xmod_id:'
            {
             before(grammarAccess.getSimulationAccess().getXmod_idKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSimulationAccess().getXmod_idKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group__1__Impl"


    // $ANTLR start "rule__Simulation__Group__2"
    // InternalSpice.g:916:1: rule__Simulation__Group__2 : rule__Simulation__Group__2__Impl rule__Simulation__Group__3 ;
    public final void rule__Simulation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:920:1: ( rule__Simulation__Group__2__Impl rule__Simulation__Group__3 )
            // InternalSpice.g:921:2: rule__Simulation__Group__2__Impl rule__Simulation__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Simulation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simulation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group__2"


    // $ANTLR start "rule__Simulation__Group__2__Impl"
    // InternalSpice.g:928:1: rule__Simulation__Group__2__Impl : ( ( rule__Simulation__Xmod_idAssignment_2 ) ) ;
    public final void rule__Simulation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:932:1: ( ( ( rule__Simulation__Xmod_idAssignment_2 ) ) )
            // InternalSpice.g:933:1: ( ( rule__Simulation__Xmod_idAssignment_2 ) )
            {
            // InternalSpice.g:933:1: ( ( rule__Simulation__Xmod_idAssignment_2 ) )
            // InternalSpice.g:934:2: ( rule__Simulation__Xmod_idAssignment_2 )
            {
             before(grammarAccess.getSimulationAccess().getXmod_idAssignment_2()); 
            // InternalSpice.g:935:2: ( rule__Simulation__Xmod_idAssignment_2 )
            // InternalSpice.g:935:3: rule__Simulation__Xmod_idAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Simulation__Xmod_idAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSimulationAccess().getXmod_idAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group__2__Impl"


    // $ANTLR start "rule__Simulation__Group__3"
    // InternalSpice.g:943:1: rule__Simulation__Group__3 : rule__Simulation__Group__3__Impl rule__Simulation__Group__4 ;
    public final void rule__Simulation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:947:1: ( rule__Simulation__Group__3__Impl rule__Simulation__Group__4 )
            // InternalSpice.g:948:2: rule__Simulation__Group__3__Impl rule__Simulation__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Simulation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simulation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group__3"


    // $ANTLR start "rule__Simulation__Group__3__Impl"
    // InternalSpice.g:955:1: rule__Simulation__Group__3__Impl : ( '(' ) ;
    public final void rule__Simulation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:959:1: ( ( '(' ) )
            // InternalSpice.g:960:1: ( '(' )
            {
            // InternalSpice.g:960:1: ( '(' )
            // InternalSpice.g:961:2: '('
            {
             before(grammarAccess.getSimulationAccess().getLeftParenthesisKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSimulationAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group__3__Impl"


    // $ANTLR start "rule__Simulation__Group__4"
    // InternalSpice.g:970:1: rule__Simulation__Group__4 : rule__Simulation__Group__4__Impl rule__Simulation__Group__5 ;
    public final void rule__Simulation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:974:1: ( rule__Simulation__Group__4__Impl rule__Simulation__Group__5 )
            // InternalSpice.g:975:2: rule__Simulation__Group__4__Impl rule__Simulation__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Simulation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simulation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group__4"


    // $ANTLR start "rule__Simulation__Group__4__Impl"
    // InternalSpice.g:982:1: rule__Simulation__Group__4__Impl : ( ( rule__Simulation__StartTimeAssignment_4 ) ) ;
    public final void rule__Simulation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:986:1: ( ( ( rule__Simulation__StartTimeAssignment_4 ) ) )
            // InternalSpice.g:987:1: ( ( rule__Simulation__StartTimeAssignment_4 ) )
            {
            // InternalSpice.g:987:1: ( ( rule__Simulation__StartTimeAssignment_4 ) )
            // InternalSpice.g:988:2: ( rule__Simulation__StartTimeAssignment_4 )
            {
             before(grammarAccess.getSimulationAccess().getStartTimeAssignment_4()); 
            // InternalSpice.g:989:2: ( rule__Simulation__StartTimeAssignment_4 )
            // InternalSpice.g:989:3: rule__Simulation__StartTimeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Simulation__StartTimeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSimulationAccess().getStartTimeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group__4__Impl"


    // $ANTLR start "rule__Simulation__Group__5"
    // InternalSpice.g:997:1: rule__Simulation__Group__5 : rule__Simulation__Group__5__Impl rule__Simulation__Group__6 ;
    public final void rule__Simulation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1001:1: ( rule__Simulation__Group__5__Impl rule__Simulation__Group__6 )
            // InternalSpice.g:1002:2: rule__Simulation__Group__5__Impl rule__Simulation__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Simulation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simulation__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group__5"


    // $ANTLR start "rule__Simulation__Group__5__Impl"
    // InternalSpice.g:1009:1: rule__Simulation__Group__5__Impl : ( ',' ) ;
    public final void rule__Simulation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1013:1: ( ( ',' ) )
            // InternalSpice.g:1014:1: ( ',' )
            {
            // InternalSpice.g:1014:1: ( ',' )
            // InternalSpice.g:1015:2: ','
            {
             before(grammarAccess.getSimulationAccess().getCommaKeyword_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSimulationAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group__5__Impl"


    // $ANTLR start "rule__Simulation__Group__6"
    // InternalSpice.g:1024:1: rule__Simulation__Group__6 : rule__Simulation__Group__6__Impl rule__Simulation__Group__7 ;
    public final void rule__Simulation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1028:1: ( rule__Simulation__Group__6__Impl rule__Simulation__Group__7 )
            // InternalSpice.g:1029:2: rule__Simulation__Group__6__Impl rule__Simulation__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Simulation__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simulation__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group__6"


    // $ANTLR start "rule__Simulation__Group__6__Impl"
    // InternalSpice.g:1036:1: rule__Simulation__Group__6__Impl : ( ( rule__Simulation__EndTimeAssignment_6 ) ) ;
    public final void rule__Simulation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1040:1: ( ( ( rule__Simulation__EndTimeAssignment_6 ) ) )
            // InternalSpice.g:1041:1: ( ( rule__Simulation__EndTimeAssignment_6 ) )
            {
            // InternalSpice.g:1041:1: ( ( rule__Simulation__EndTimeAssignment_6 ) )
            // InternalSpice.g:1042:2: ( rule__Simulation__EndTimeAssignment_6 )
            {
             before(grammarAccess.getSimulationAccess().getEndTimeAssignment_6()); 
            // InternalSpice.g:1043:2: ( rule__Simulation__EndTimeAssignment_6 )
            // InternalSpice.g:1043:3: rule__Simulation__EndTimeAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Simulation__EndTimeAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSimulationAccess().getEndTimeAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group__6__Impl"


    // $ANTLR start "rule__Simulation__Group__7"
    // InternalSpice.g:1051:1: rule__Simulation__Group__7 : rule__Simulation__Group__7__Impl rule__Simulation__Group__8 ;
    public final void rule__Simulation__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1055:1: ( rule__Simulation__Group__7__Impl rule__Simulation__Group__8 )
            // InternalSpice.g:1056:2: rule__Simulation__Group__7__Impl rule__Simulation__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__Simulation__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simulation__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group__7"


    // $ANTLR start "rule__Simulation__Group__7__Impl"
    // InternalSpice.g:1063:1: rule__Simulation__Group__7__Impl : ( ',' ) ;
    public final void rule__Simulation__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1067:1: ( ( ',' ) )
            // InternalSpice.g:1068:1: ( ',' )
            {
            // InternalSpice.g:1068:1: ( ',' )
            // InternalSpice.g:1069:2: ','
            {
             before(grammarAccess.getSimulationAccess().getCommaKeyword_7()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSimulationAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group__7__Impl"


    // $ANTLR start "rule__Simulation__Group__8"
    // InternalSpice.g:1078:1: rule__Simulation__Group__8 : rule__Simulation__Group__8__Impl rule__Simulation__Group__9 ;
    public final void rule__Simulation__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1082:1: ( rule__Simulation__Group__8__Impl rule__Simulation__Group__9 )
            // InternalSpice.g:1083:2: rule__Simulation__Group__8__Impl rule__Simulation__Group__9
            {
            pushFollow(FOLLOW_8);
            rule__Simulation__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simulation__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group__8"


    // $ANTLR start "rule__Simulation__Group__8__Impl"
    // InternalSpice.g:1090:1: rule__Simulation__Group__8__Impl : ( ( rule__Simulation__DurationStepAssignment_8 ) ) ;
    public final void rule__Simulation__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1094:1: ( ( ( rule__Simulation__DurationStepAssignment_8 ) ) )
            // InternalSpice.g:1095:1: ( ( rule__Simulation__DurationStepAssignment_8 ) )
            {
            // InternalSpice.g:1095:1: ( ( rule__Simulation__DurationStepAssignment_8 ) )
            // InternalSpice.g:1096:2: ( rule__Simulation__DurationStepAssignment_8 )
            {
             before(grammarAccess.getSimulationAccess().getDurationStepAssignment_8()); 
            // InternalSpice.g:1097:2: ( rule__Simulation__DurationStepAssignment_8 )
            // InternalSpice.g:1097:3: rule__Simulation__DurationStepAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Simulation__DurationStepAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getSimulationAccess().getDurationStepAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group__8__Impl"


    // $ANTLR start "rule__Simulation__Group__9"
    // InternalSpice.g:1105:1: rule__Simulation__Group__9 : rule__Simulation__Group__9__Impl rule__Simulation__Group__10 ;
    public final void rule__Simulation__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1109:1: ( rule__Simulation__Group__9__Impl rule__Simulation__Group__10 )
            // InternalSpice.g:1110:2: rule__Simulation__Group__9__Impl rule__Simulation__Group__10
            {
            pushFollow(FOLLOW_9);
            rule__Simulation__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simulation__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group__9"


    // $ANTLR start "rule__Simulation__Group__9__Impl"
    // InternalSpice.g:1117:1: rule__Simulation__Group__9__Impl : ( ')' ) ;
    public final void rule__Simulation__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1121:1: ( ( ')' ) )
            // InternalSpice.g:1122:1: ( ')' )
            {
            // InternalSpice.g:1122:1: ( ')' )
            // InternalSpice.g:1123:2: ')'
            {
             before(grammarAccess.getSimulationAccess().getRightParenthesisKeyword_9()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSimulationAccess().getRightParenthesisKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group__9__Impl"


    // $ANTLR start "rule__Simulation__Group__10"
    // InternalSpice.g:1132:1: rule__Simulation__Group__10 : rule__Simulation__Group__10__Impl rule__Simulation__Group__11 ;
    public final void rule__Simulation__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1136:1: ( rule__Simulation__Group__10__Impl rule__Simulation__Group__11 )
            // InternalSpice.g:1137:2: rule__Simulation__Group__10__Impl rule__Simulation__Group__11
            {
            pushFollow(FOLLOW_10);
            rule__Simulation__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simulation__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group__10"


    // $ANTLR start "rule__Simulation__Group__10__Impl"
    // InternalSpice.g:1144:1: rule__Simulation__Group__10__Impl : ( '{' ) ;
    public final void rule__Simulation__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1148:1: ( ( '{' ) )
            // InternalSpice.g:1149:1: ( '{' )
            {
            // InternalSpice.g:1149:1: ( '{' )
            // InternalSpice.g:1150:2: '{'
            {
             before(grammarAccess.getSimulationAccess().getLeftCurlyBracketKeyword_10()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSimulationAccess().getLeftCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group__10__Impl"


    // $ANTLR start "rule__Simulation__Group__11"
    // InternalSpice.g:1159:1: rule__Simulation__Group__11 : rule__Simulation__Group__11__Impl rule__Simulation__Group__12 ;
    public final void rule__Simulation__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1163:1: ( rule__Simulation__Group__11__Impl rule__Simulation__Group__12 )
            // InternalSpice.g:1164:2: rule__Simulation__Group__11__Impl rule__Simulation__Group__12
            {
            pushFollow(FOLLOW_10);
            rule__Simulation__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simulation__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group__11"


    // $ANTLR start "rule__Simulation__Group__11__Impl"
    // InternalSpice.g:1171:1: rule__Simulation__Group__11__Impl : ( ( rule__Simulation__Group_11__0 )? ) ;
    public final void rule__Simulation__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1175:1: ( ( ( rule__Simulation__Group_11__0 )? ) )
            // InternalSpice.g:1176:1: ( ( rule__Simulation__Group_11__0 )? )
            {
            // InternalSpice.g:1176:1: ( ( rule__Simulation__Group_11__0 )? )
            // InternalSpice.g:1177:2: ( rule__Simulation__Group_11__0 )?
            {
             before(grammarAccess.getSimulationAccess().getGroup_11()); 
            // InternalSpice.g:1178:2: ( rule__Simulation__Group_11__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==33) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalSpice.g:1178:3: rule__Simulation__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simulation__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimulationAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group__11__Impl"


    // $ANTLR start "rule__Simulation__Group__12"
    // InternalSpice.g:1186:1: rule__Simulation__Group__12 : rule__Simulation__Group__12__Impl rule__Simulation__Group__13 ;
    public final void rule__Simulation__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1190:1: ( rule__Simulation__Group__12__Impl rule__Simulation__Group__13 )
            // InternalSpice.g:1191:2: rule__Simulation__Group__12__Impl rule__Simulation__Group__13
            {
            pushFollow(FOLLOW_10);
            rule__Simulation__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simulation__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group__12"


    // $ANTLR start "rule__Simulation__Group__12__Impl"
    // InternalSpice.g:1198:1: rule__Simulation__Group__12__Impl : ( ( rule__Simulation__Group_12__0 )? ) ;
    public final void rule__Simulation__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1202:1: ( ( ( rule__Simulation__Group_12__0 )? ) )
            // InternalSpice.g:1203:1: ( ( rule__Simulation__Group_12__0 )? )
            {
            // InternalSpice.g:1203:1: ( ( rule__Simulation__Group_12__0 )? )
            // InternalSpice.g:1204:2: ( rule__Simulation__Group_12__0 )?
            {
             before(grammarAccess.getSimulationAccess().getGroup_12()); 
            // InternalSpice.g:1205:2: ( rule__Simulation__Group_12__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==34) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSpice.g:1205:3: rule__Simulation__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Simulation__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSimulationAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group__12__Impl"


    // $ANTLR start "rule__Simulation__Group__13"
    // InternalSpice.g:1213:1: rule__Simulation__Group__13 : rule__Simulation__Group__13__Impl ;
    public final void rule__Simulation__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1217:1: ( rule__Simulation__Group__13__Impl )
            // InternalSpice.g:1218:2: rule__Simulation__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Simulation__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group__13"


    // $ANTLR start "rule__Simulation__Group__13__Impl"
    // InternalSpice.g:1224:1: rule__Simulation__Group__13__Impl : ( '}' ) ;
    public final void rule__Simulation__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1228:1: ( ( '}' ) )
            // InternalSpice.g:1229:1: ( '}' )
            {
            // InternalSpice.g:1229:1: ( '}' )
            // InternalSpice.g:1230:2: '}'
            {
             before(grammarAccess.getSimulationAccess().getRightCurlyBracketKeyword_13()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getSimulationAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group__13__Impl"


    // $ANTLR start "rule__Simulation__Group_11__0"
    // InternalSpice.g:1240:1: rule__Simulation__Group_11__0 : rule__Simulation__Group_11__0__Impl rule__Simulation__Group_11__1 ;
    public final void rule__Simulation__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1244:1: ( rule__Simulation__Group_11__0__Impl rule__Simulation__Group_11__1 )
            // InternalSpice.g:1245:2: rule__Simulation__Group_11__0__Impl rule__Simulation__Group_11__1
            {
            pushFollow(FOLLOW_11);
            rule__Simulation__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simulation__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group_11__0"


    // $ANTLR start "rule__Simulation__Group_11__0__Impl"
    // InternalSpice.g:1252:1: rule__Simulation__Group_11__0__Impl : ( ( rule__Simulation__ComponentsAssignment_11_0 ) ) ;
    public final void rule__Simulation__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1256:1: ( ( ( rule__Simulation__ComponentsAssignment_11_0 ) ) )
            // InternalSpice.g:1257:1: ( ( rule__Simulation__ComponentsAssignment_11_0 ) )
            {
            // InternalSpice.g:1257:1: ( ( rule__Simulation__ComponentsAssignment_11_0 ) )
            // InternalSpice.g:1258:2: ( rule__Simulation__ComponentsAssignment_11_0 )
            {
             before(grammarAccess.getSimulationAccess().getComponentsAssignment_11_0()); 
            // InternalSpice.g:1259:2: ( rule__Simulation__ComponentsAssignment_11_0 )
            // InternalSpice.g:1259:3: rule__Simulation__ComponentsAssignment_11_0
            {
            pushFollow(FOLLOW_2);
            rule__Simulation__ComponentsAssignment_11_0();

            state._fsp--;


            }

             after(grammarAccess.getSimulationAccess().getComponentsAssignment_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group_11__0__Impl"


    // $ANTLR start "rule__Simulation__Group_11__1"
    // InternalSpice.g:1267:1: rule__Simulation__Group_11__1 : rule__Simulation__Group_11__1__Impl ;
    public final void rule__Simulation__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1271:1: ( rule__Simulation__Group_11__1__Impl )
            // InternalSpice.g:1272:2: rule__Simulation__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Simulation__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group_11__1"


    // $ANTLR start "rule__Simulation__Group_11__1__Impl"
    // InternalSpice.g:1278:1: rule__Simulation__Group_11__1__Impl : ( ( rule__Simulation__ComponentsAssignment_11_1 )* ) ;
    public final void rule__Simulation__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1282:1: ( ( ( rule__Simulation__ComponentsAssignment_11_1 )* ) )
            // InternalSpice.g:1283:1: ( ( rule__Simulation__ComponentsAssignment_11_1 )* )
            {
            // InternalSpice.g:1283:1: ( ( rule__Simulation__ComponentsAssignment_11_1 )* )
            // InternalSpice.g:1284:2: ( rule__Simulation__ComponentsAssignment_11_1 )*
            {
             before(grammarAccess.getSimulationAccess().getComponentsAssignment_11_1()); 
            // InternalSpice.g:1285:2: ( rule__Simulation__ComponentsAssignment_11_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==33) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSpice.g:1285:3: rule__Simulation__ComponentsAssignment_11_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Simulation__ComponentsAssignment_11_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getSimulationAccess().getComponentsAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group_11__1__Impl"


    // $ANTLR start "rule__Simulation__Group_12__0"
    // InternalSpice.g:1294:1: rule__Simulation__Group_12__0 : rule__Simulation__Group_12__0__Impl rule__Simulation__Group_12__1 ;
    public final void rule__Simulation__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1298:1: ( rule__Simulation__Group_12__0__Impl rule__Simulation__Group_12__1 )
            // InternalSpice.g:1299:2: rule__Simulation__Group_12__0__Impl rule__Simulation__Group_12__1
            {
            pushFollow(FOLLOW_13);
            rule__Simulation__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Simulation__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group_12__0"


    // $ANTLR start "rule__Simulation__Group_12__0__Impl"
    // InternalSpice.g:1306:1: rule__Simulation__Group_12__0__Impl : ( ( rule__Simulation__ViewsAssignment_12_0 ) ) ;
    public final void rule__Simulation__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1310:1: ( ( ( rule__Simulation__ViewsAssignment_12_0 ) ) )
            // InternalSpice.g:1311:1: ( ( rule__Simulation__ViewsAssignment_12_0 ) )
            {
            // InternalSpice.g:1311:1: ( ( rule__Simulation__ViewsAssignment_12_0 ) )
            // InternalSpice.g:1312:2: ( rule__Simulation__ViewsAssignment_12_0 )
            {
             before(grammarAccess.getSimulationAccess().getViewsAssignment_12_0()); 
            // InternalSpice.g:1313:2: ( rule__Simulation__ViewsAssignment_12_0 )
            // InternalSpice.g:1313:3: rule__Simulation__ViewsAssignment_12_0
            {
            pushFollow(FOLLOW_2);
            rule__Simulation__ViewsAssignment_12_0();

            state._fsp--;


            }

             after(grammarAccess.getSimulationAccess().getViewsAssignment_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group_12__0__Impl"


    // $ANTLR start "rule__Simulation__Group_12__1"
    // InternalSpice.g:1321:1: rule__Simulation__Group_12__1 : rule__Simulation__Group_12__1__Impl ;
    public final void rule__Simulation__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1325:1: ( rule__Simulation__Group_12__1__Impl )
            // InternalSpice.g:1326:2: rule__Simulation__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Simulation__Group_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group_12__1"


    // $ANTLR start "rule__Simulation__Group_12__1__Impl"
    // InternalSpice.g:1332:1: rule__Simulation__Group_12__1__Impl : ( ( rule__Simulation__ViewsAssignment_12_1 )* ) ;
    public final void rule__Simulation__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1336:1: ( ( ( rule__Simulation__ViewsAssignment_12_1 )* ) )
            // InternalSpice.g:1337:1: ( ( rule__Simulation__ViewsAssignment_12_1 )* )
            {
            // InternalSpice.g:1337:1: ( ( rule__Simulation__ViewsAssignment_12_1 )* )
            // InternalSpice.g:1338:2: ( rule__Simulation__ViewsAssignment_12_1 )*
            {
             before(grammarAccess.getSimulationAccess().getViewsAssignment_12_1()); 
            // InternalSpice.g:1339:2: ( rule__Simulation__ViewsAssignment_12_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==34) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSpice.g:1339:3: rule__Simulation__ViewsAssignment_12_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Simulation__ViewsAssignment_12_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getSimulationAccess().getViewsAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Group_12__1__Impl"


    // $ANTLR start "rule__Component__Group__0"
    // InternalSpice.g:1348:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1352:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalSpice.g:1353:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0"


    // $ANTLR start "rule__Component__Group__0__Impl"
    // InternalSpice.g:1360:1: rule__Component__Group__0__Impl : ( 'Component' ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1364:1: ( ( 'Component' ) )
            // InternalSpice.g:1365:1: ( 'Component' )
            {
            // InternalSpice.g:1365:1: ( 'Component' )
            // InternalSpice.g:1366:2: 'Component'
            {
             before(grammarAccess.getComponentAccess().getComponentKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getComponentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__0__Impl"


    // $ANTLR start "rule__Component__Group__1"
    // InternalSpice.g:1375:1: rule__Component__Group__1 : rule__Component__Group__1__Impl rule__Component__Group__2 ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1379:1: ( rule__Component__Group__1__Impl rule__Component__Group__2 )
            // InternalSpice.g:1380:2: rule__Component__Group__1__Impl rule__Component__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Component__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1"


    // $ANTLR start "rule__Component__Group__1__Impl"
    // InternalSpice.g:1387:1: rule__Component__Group__1__Impl : ( 'xmod_id:' ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1391:1: ( ( 'xmod_id:' ) )
            // InternalSpice.g:1392:1: ( 'xmod_id:' )
            {
            // InternalSpice.g:1392:1: ( 'xmod_id:' )
            // InternalSpice.g:1393:2: 'xmod_id:'
            {
             before(grammarAccess.getComponentAccess().getXmod_idKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getXmod_idKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__1__Impl"


    // $ANTLR start "rule__Component__Group__2"
    // InternalSpice.g:1402:1: rule__Component__Group__2 : rule__Component__Group__2__Impl rule__Component__Group__3 ;
    public final void rule__Component__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1406:1: ( rule__Component__Group__2__Impl rule__Component__Group__3 )
            // InternalSpice.g:1407:2: rule__Component__Group__2__Impl rule__Component__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Component__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2"


    // $ANTLR start "rule__Component__Group__2__Impl"
    // InternalSpice.g:1414:1: rule__Component__Group__2__Impl : ( ( rule__Component__Xmod_idAssignment_2 ) ) ;
    public final void rule__Component__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1418:1: ( ( ( rule__Component__Xmod_idAssignment_2 ) ) )
            // InternalSpice.g:1419:1: ( ( rule__Component__Xmod_idAssignment_2 ) )
            {
            // InternalSpice.g:1419:1: ( ( rule__Component__Xmod_idAssignment_2 ) )
            // InternalSpice.g:1420:2: ( rule__Component__Xmod_idAssignment_2 )
            {
             before(grammarAccess.getComponentAccess().getXmod_idAssignment_2()); 
            // InternalSpice.g:1421:2: ( rule__Component__Xmod_idAssignment_2 )
            // InternalSpice.g:1421:3: rule__Component__Xmod_idAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Component__Xmod_idAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getXmod_idAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__2__Impl"


    // $ANTLR start "rule__Component__Group__3"
    // InternalSpice.g:1429:1: rule__Component__Group__3 : rule__Component__Group__3__Impl rule__Component__Group__4 ;
    public final void rule__Component__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1433:1: ( rule__Component__Group__3__Impl rule__Component__Group__4 )
            // InternalSpice.g:1434:2: rule__Component__Group__3__Impl rule__Component__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Component__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3"


    // $ANTLR start "rule__Component__Group__3__Impl"
    // InternalSpice.g:1441:1: rule__Component__Group__3__Impl : ( '(' ) ;
    public final void rule__Component__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1445:1: ( ( '(' ) )
            // InternalSpice.g:1446:1: ( '(' )
            {
            // InternalSpice.g:1446:1: ( '(' )
            // InternalSpice.g:1447:2: '('
            {
             before(grammarAccess.getComponentAccess().getLeftParenthesisKeyword_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__3__Impl"


    // $ANTLR start "rule__Component__Group__4"
    // InternalSpice.g:1456:1: rule__Component__Group__4 : rule__Component__Group__4__Impl rule__Component__Group__5 ;
    public final void rule__Component__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1460:1: ( rule__Component__Group__4__Impl rule__Component__Group__5 )
            // InternalSpice.g:1461:2: rule__Component__Group__4__Impl rule__Component__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Component__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__4"


    // $ANTLR start "rule__Component__Group__4__Impl"
    // InternalSpice.g:1468:1: rule__Component__Group__4__Impl : ( ( rule__Component__PriorityAssignment_4 ) ) ;
    public final void rule__Component__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1472:1: ( ( ( rule__Component__PriorityAssignment_4 ) ) )
            // InternalSpice.g:1473:1: ( ( rule__Component__PriorityAssignment_4 ) )
            {
            // InternalSpice.g:1473:1: ( ( rule__Component__PriorityAssignment_4 ) )
            // InternalSpice.g:1474:2: ( rule__Component__PriorityAssignment_4 )
            {
             before(grammarAccess.getComponentAccess().getPriorityAssignment_4()); 
            // InternalSpice.g:1475:2: ( rule__Component__PriorityAssignment_4 )
            // InternalSpice.g:1475:3: rule__Component__PriorityAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Component__PriorityAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getPriorityAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__4__Impl"


    // $ANTLR start "rule__Component__Group__5"
    // InternalSpice.g:1483:1: rule__Component__Group__5 : rule__Component__Group__5__Impl rule__Component__Group__6 ;
    public final void rule__Component__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1487:1: ( rule__Component__Group__5__Impl rule__Component__Group__6 )
            // InternalSpice.g:1488:2: rule__Component__Group__5__Impl rule__Component__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Component__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__5"


    // $ANTLR start "rule__Component__Group__5__Impl"
    // InternalSpice.g:1495:1: rule__Component__Group__5__Impl : ( ',' ) ;
    public final void rule__Component__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1499:1: ( ( ',' ) )
            // InternalSpice.g:1500:1: ( ',' )
            {
            // InternalSpice.g:1500:1: ( ',' )
            // InternalSpice.g:1501:2: ','
            {
             before(grammarAccess.getComponentAccess().getCommaKeyword_5()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__5__Impl"


    // $ANTLR start "rule__Component__Group__6"
    // InternalSpice.g:1510:1: rule__Component__Group__6 : rule__Component__Group__6__Impl rule__Component__Group__7 ;
    public final void rule__Component__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1514:1: ( rule__Component__Group__6__Impl rule__Component__Group__7 )
            // InternalSpice.g:1515:2: rule__Component__Group__6__Impl rule__Component__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Component__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__6"


    // $ANTLR start "rule__Component__Group__6__Impl"
    // InternalSpice.g:1522:1: rule__Component__Group__6__Impl : ( ( rule__Component__PeriodAssignment_6 ) ) ;
    public final void rule__Component__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1526:1: ( ( ( rule__Component__PeriodAssignment_6 ) ) )
            // InternalSpice.g:1527:1: ( ( rule__Component__PeriodAssignment_6 ) )
            {
            // InternalSpice.g:1527:1: ( ( rule__Component__PeriodAssignment_6 ) )
            // InternalSpice.g:1528:2: ( rule__Component__PeriodAssignment_6 )
            {
             before(grammarAccess.getComponentAccess().getPeriodAssignment_6()); 
            // InternalSpice.g:1529:2: ( rule__Component__PeriodAssignment_6 )
            // InternalSpice.g:1529:3: rule__Component__PeriodAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Component__PeriodAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getPeriodAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__6__Impl"


    // $ANTLR start "rule__Component__Group__7"
    // InternalSpice.g:1537:1: rule__Component__Group__7 : rule__Component__Group__7__Impl rule__Component__Group__8 ;
    public final void rule__Component__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1541:1: ( rule__Component__Group__7__Impl rule__Component__Group__8 )
            // InternalSpice.g:1542:2: rule__Component__Group__7__Impl rule__Component__Group__8
            {
            pushFollow(FOLLOW_15);
            rule__Component__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__7"


    // $ANTLR start "rule__Component__Group__7__Impl"
    // InternalSpice.g:1549:1: rule__Component__Group__7__Impl : ( ')' ) ;
    public final void rule__Component__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1553:1: ( ( ')' ) )
            // InternalSpice.g:1554:1: ( ')' )
            {
            // InternalSpice.g:1554:1: ( ')' )
            // InternalSpice.g:1555:2: ')'
            {
             before(grammarAccess.getComponentAccess().getRightParenthesisKeyword_7()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__7__Impl"


    // $ANTLR start "rule__Component__Group__8"
    // InternalSpice.g:1564:1: rule__Component__Group__8 : rule__Component__Group__8__Impl rule__Component__Group__9 ;
    public final void rule__Component__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1568:1: ( rule__Component__Group__8__Impl rule__Component__Group__9 )
            // InternalSpice.g:1569:2: rule__Component__Group__8__Impl rule__Component__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__Component__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__8"


    // $ANTLR start "rule__Component__Group__8__Impl"
    // InternalSpice.g:1576:1: rule__Component__Group__8__Impl : ( ( rule__Component__IsDataFlowAssignment_8 )? ) ;
    public final void rule__Component__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1580:1: ( ( ( rule__Component__IsDataFlowAssignment_8 )? ) )
            // InternalSpice.g:1581:1: ( ( rule__Component__IsDataFlowAssignment_8 )? )
            {
            // InternalSpice.g:1581:1: ( ( rule__Component__IsDataFlowAssignment_8 )? )
            // InternalSpice.g:1582:2: ( rule__Component__IsDataFlowAssignment_8 )?
            {
             before(grammarAccess.getComponentAccess().getIsDataFlowAssignment_8()); 
            // InternalSpice.g:1583:2: ( rule__Component__IsDataFlowAssignment_8 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==51) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSpice.g:1583:3: rule__Component__IsDataFlowAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__IsDataFlowAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getIsDataFlowAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__8__Impl"


    // $ANTLR start "rule__Component__Group__9"
    // InternalSpice.g:1591:1: rule__Component__Group__9 : rule__Component__Group__9__Impl rule__Component__Group__10 ;
    public final void rule__Component__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1595:1: ( rule__Component__Group__9__Impl rule__Component__Group__10 )
            // InternalSpice.g:1596:2: rule__Component__Group__9__Impl rule__Component__Group__10
            {
            pushFollow(FOLLOW_16);
            rule__Component__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__9"


    // $ANTLR start "rule__Component__Group__9__Impl"
    // InternalSpice.g:1603:1: rule__Component__Group__9__Impl : ( '{' ) ;
    public final void rule__Component__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1607:1: ( ( '{' ) )
            // InternalSpice.g:1608:1: ( '{' )
            {
            // InternalSpice.g:1608:1: ( '{' )
            // InternalSpice.g:1609:2: '{'
            {
             before(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_9()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__9__Impl"


    // $ANTLR start "rule__Component__Group__10"
    // InternalSpice.g:1618:1: rule__Component__Group__10 : rule__Component__Group__10__Impl rule__Component__Group__11 ;
    public final void rule__Component__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1622:1: ( rule__Component__Group__10__Impl rule__Component__Group__11 )
            // InternalSpice.g:1623:2: rule__Component__Group__10__Impl rule__Component__Group__11
            {
            pushFollow(FOLLOW_16);
            rule__Component__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__10"


    // $ANTLR start "rule__Component__Group__10__Impl"
    // InternalSpice.g:1630:1: rule__Component__Group__10__Impl : ( ( rule__Component__Group_10__0 )? ) ;
    public final void rule__Component__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1634:1: ( ( ( rule__Component__Group_10__0 )? ) )
            // InternalSpice.g:1635:1: ( ( rule__Component__Group_10__0 )? )
            {
            // InternalSpice.g:1635:1: ( ( rule__Component__Group_10__0 )? )
            // InternalSpice.g:1636:2: ( rule__Component__Group_10__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_10()); 
            // InternalSpice.g:1637:2: ( rule__Component__Group_10__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_ID)||LA13_0==52) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSpice.g:1637:3: rule__Component__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__10__Impl"


    // $ANTLR start "rule__Component__Group__11"
    // InternalSpice.g:1645:1: rule__Component__Group__11 : rule__Component__Group__11__Impl rule__Component__Group__12 ;
    public final void rule__Component__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1649:1: ( rule__Component__Group__11__Impl rule__Component__Group__12 )
            // InternalSpice.g:1650:2: rule__Component__Group__11__Impl rule__Component__Group__12
            {
            pushFollow(FOLLOW_16);
            rule__Component__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__11"


    // $ANTLR start "rule__Component__Group__11__Impl"
    // InternalSpice.g:1657:1: rule__Component__Group__11__Impl : ( ( rule__Component__Group_11__0 )? ) ;
    public final void rule__Component__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1661:1: ( ( ( rule__Component__Group_11__0 )? ) )
            // InternalSpice.g:1662:1: ( ( rule__Component__Group_11__0 )? )
            {
            // InternalSpice.g:1662:1: ( ( rule__Component__Group_11__0 )? )
            // InternalSpice.g:1663:2: ( rule__Component__Group_11__0 )?
            {
             before(grammarAccess.getComponentAccess().getGroup_11()); 
            // InternalSpice.g:1664:2: ( rule__Component__Group_11__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==43) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSpice.g:1664:3: rule__Component__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Component__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__11__Impl"


    // $ANTLR start "rule__Component__Group__12"
    // InternalSpice.g:1672:1: rule__Component__Group__12 : rule__Component__Group__12__Impl ;
    public final void rule__Component__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1676:1: ( rule__Component__Group__12__Impl )
            // InternalSpice.g:1677:2: rule__Component__Group__12__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__12"


    // $ANTLR start "rule__Component__Group__12__Impl"
    // InternalSpice.g:1683:1: rule__Component__Group__12__Impl : ( '}' ) ;
    public final void rule__Component__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1687:1: ( ( '}' ) )
            // InternalSpice.g:1688:1: ( '}' )
            {
            // InternalSpice.g:1688:1: ( '}' )
            // InternalSpice.g:1689:2: '}'
            {
             before(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_12()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group__12__Impl"


    // $ANTLR start "rule__Component__Group_10__0"
    // InternalSpice.g:1699:1: rule__Component__Group_10__0 : rule__Component__Group_10__0__Impl rule__Component__Group_10__1 ;
    public final void rule__Component__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1703:1: ( rule__Component__Group_10__0__Impl rule__Component__Group_10__1 )
            // InternalSpice.g:1704:2: rule__Component__Group_10__0__Impl rule__Component__Group_10__1
            {
            pushFollow(FOLLOW_17);
            rule__Component__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_10__0"


    // $ANTLR start "rule__Component__Group_10__0__Impl"
    // InternalSpice.g:1711:1: rule__Component__Group_10__0__Impl : ( ( rule__Component__AttributesAssignment_10_0 ) ) ;
    public final void rule__Component__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1715:1: ( ( ( rule__Component__AttributesAssignment_10_0 ) ) )
            // InternalSpice.g:1716:1: ( ( rule__Component__AttributesAssignment_10_0 ) )
            {
            // InternalSpice.g:1716:1: ( ( rule__Component__AttributesAssignment_10_0 ) )
            // InternalSpice.g:1717:2: ( rule__Component__AttributesAssignment_10_0 )
            {
             before(grammarAccess.getComponentAccess().getAttributesAssignment_10_0()); 
            // InternalSpice.g:1718:2: ( rule__Component__AttributesAssignment_10_0 )
            // InternalSpice.g:1718:3: rule__Component__AttributesAssignment_10_0
            {
            pushFollow(FOLLOW_2);
            rule__Component__AttributesAssignment_10_0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getAttributesAssignment_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_10__0__Impl"


    // $ANTLR start "rule__Component__Group_10__1"
    // InternalSpice.g:1726:1: rule__Component__Group_10__1 : rule__Component__Group_10__1__Impl ;
    public final void rule__Component__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1730:1: ( rule__Component__Group_10__1__Impl )
            // InternalSpice.g:1731:2: rule__Component__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_10__1"


    // $ANTLR start "rule__Component__Group_10__1__Impl"
    // InternalSpice.g:1737:1: rule__Component__Group_10__1__Impl : ( ( rule__Component__AttributesAssignment_10_1 )* ) ;
    public final void rule__Component__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1741:1: ( ( ( rule__Component__AttributesAssignment_10_1 )* ) )
            // InternalSpice.g:1742:1: ( ( rule__Component__AttributesAssignment_10_1 )* )
            {
            // InternalSpice.g:1742:1: ( ( rule__Component__AttributesAssignment_10_1 )* )
            // InternalSpice.g:1743:2: ( rule__Component__AttributesAssignment_10_1 )*
            {
             before(grammarAccess.getComponentAccess().getAttributesAssignment_10_1()); 
            // InternalSpice.g:1744:2: ( rule__Component__AttributesAssignment_10_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_ID)||LA15_0==52) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSpice.g:1744:3: rule__Component__AttributesAssignment_10_1
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Component__AttributesAssignment_10_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getAttributesAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_10__1__Impl"


    // $ANTLR start "rule__Component__Group_11__0"
    // InternalSpice.g:1753:1: rule__Component__Group_11__0 : rule__Component__Group_11__0__Impl rule__Component__Group_11__1 ;
    public final void rule__Component__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1757:1: ( rule__Component__Group_11__0__Impl rule__Component__Group_11__1 )
            // InternalSpice.g:1758:2: rule__Component__Group_11__0__Impl rule__Component__Group_11__1
            {
            pushFollow(FOLLOW_19);
            rule__Component__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_11__0"


    // $ANTLR start "rule__Component__Group_11__0__Impl"
    // InternalSpice.g:1765:1: rule__Component__Group_11__0__Impl : ( ( rule__Component__ActionsAssignment_11_0 ) ) ;
    public final void rule__Component__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1769:1: ( ( ( rule__Component__ActionsAssignment_11_0 ) ) )
            // InternalSpice.g:1770:1: ( ( rule__Component__ActionsAssignment_11_0 ) )
            {
            // InternalSpice.g:1770:1: ( ( rule__Component__ActionsAssignment_11_0 ) )
            // InternalSpice.g:1771:2: ( rule__Component__ActionsAssignment_11_0 )
            {
             before(grammarAccess.getComponentAccess().getActionsAssignment_11_0()); 
            // InternalSpice.g:1772:2: ( rule__Component__ActionsAssignment_11_0 )
            // InternalSpice.g:1772:3: rule__Component__ActionsAssignment_11_0
            {
            pushFollow(FOLLOW_2);
            rule__Component__ActionsAssignment_11_0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getActionsAssignment_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_11__0__Impl"


    // $ANTLR start "rule__Component__Group_11__1"
    // InternalSpice.g:1780:1: rule__Component__Group_11__1 : rule__Component__Group_11__1__Impl ;
    public final void rule__Component__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1784:1: ( rule__Component__Group_11__1__Impl )
            // InternalSpice.g:1785:2: rule__Component__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_11__1"


    // $ANTLR start "rule__Component__Group_11__1__Impl"
    // InternalSpice.g:1791:1: rule__Component__Group_11__1__Impl : ( ( rule__Component__ActionsAssignment_11_1 )* ) ;
    public final void rule__Component__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1795:1: ( ( ( rule__Component__ActionsAssignment_11_1 )* ) )
            // InternalSpice.g:1796:1: ( ( rule__Component__ActionsAssignment_11_1 )* )
            {
            // InternalSpice.g:1796:1: ( ( rule__Component__ActionsAssignment_11_1 )* )
            // InternalSpice.g:1797:2: ( rule__Component__ActionsAssignment_11_1 )*
            {
             before(grammarAccess.getComponentAccess().getActionsAssignment_11_1()); 
            // InternalSpice.g:1798:2: ( rule__Component__ActionsAssignment_11_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==43) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSpice.g:1798:3: rule__Component__ActionsAssignment_11_1
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Component__ActionsAssignment_11_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getComponentAccess().getActionsAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Group_11__1__Impl"


    // $ANTLR start "rule__View__Group__0"
    // InternalSpice.g:1807:1: rule__View__Group__0 : rule__View__Group__0__Impl rule__View__Group__1 ;
    public final void rule__View__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1811:1: ( rule__View__Group__0__Impl rule__View__Group__1 )
            // InternalSpice.g:1812:2: rule__View__Group__0__Impl rule__View__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__View__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__View__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__0"


    // $ANTLR start "rule__View__Group__0__Impl"
    // InternalSpice.g:1819:1: rule__View__Group__0__Impl : ( 'View' ) ;
    public final void rule__View__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1823:1: ( ( 'View' ) )
            // InternalSpice.g:1824:1: ( 'View' )
            {
            // InternalSpice.g:1824:1: ( 'View' )
            // InternalSpice.g:1825:2: 'View'
            {
             before(grammarAccess.getViewAccess().getViewKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getViewAccess().getViewKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__0__Impl"


    // $ANTLR start "rule__View__Group__1"
    // InternalSpice.g:1834:1: rule__View__Group__1 : rule__View__Group__1__Impl rule__View__Group__2 ;
    public final void rule__View__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1838:1: ( rule__View__Group__1__Impl rule__View__Group__2 )
            // InternalSpice.g:1839:2: rule__View__Group__1__Impl rule__View__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__View__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__View__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__1"


    // $ANTLR start "rule__View__Group__1__Impl"
    // InternalSpice.g:1846:1: rule__View__Group__1__Impl : ( 'xmod_id:' ) ;
    public final void rule__View__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1850:1: ( ( 'xmod_id:' ) )
            // InternalSpice.g:1851:1: ( 'xmod_id:' )
            {
            // InternalSpice.g:1851:1: ( 'xmod_id:' )
            // InternalSpice.g:1852:2: 'xmod_id:'
            {
             before(grammarAccess.getViewAccess().getXmod_idKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getViewAccess().getXmod_idKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__1__Impl"


    // $ANTLR start "rule__View__Group__2"
    // InternalSpice.g:1861:1: rule__View__Group__2 : rule__View__Group__2__Impl rule__View__Group__3 ;
    public final void rule__View__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1865:1: ( rule__View__Group__2__Impl rule__View__Group__3 )
            // InternalSpice.g:1866:2: rule__View__Group__2__Impl rule__View__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__View__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__View__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__2"


    // $ANTLR start "rule__View__Group__2__Impl"
    // InternalSpice.g:1873:1: rule__View__Group__2__Impl : ( ( rule__View__Xmod_idAssignment_2 ) ) ;
    public final void rule__View__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1877:1: ( ( ( rule__View__Xmod_idAssignment_2 ) ) )
            // InternalSpice.g:1878:1: ( ( rule__View__Xmod_idAssignment_2 ) )
            {
            // InternalSpice.g:1878:1: ( ( rule__View__Xmod_idAssignment_2 ) )
            // InternalSpice.g:1879:2: ( rule__View__Xmod_idAssignment_2 )
            {
             before(grammarAccess.getViewAccess().getXmod_idAssignment_2()); 
            // InternalSpice.g:1880:2: ( rule__View__Xmod_idAssignment_2 )
            // InternalSpice.g:1880:3: rule__View__Xmod_idAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__View__Xmod_idAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getViewAccess().getXmod_idAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__2__Impl"


    // $ANTLR start "rule__View__Group__3"
    // InternalSpice.g:1888:1: rule__View__Group__3 : rule__View__Group__3__Impl rule__View__Group__4 ;
    public final void rule__View__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1892:1: ( rule__View__Group__3__Impl rule__View__Group__4 )
            // InternalSpice.g:1893:2: rule__View__Group__3__Impl rule__View__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__View__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__View__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__3"


    // $ANTLR start "rule__View__Group__3__Impl"
    // InternalSpice.g:1900:1: rule__View__Group__3__Impl : ( '{' ) ;
    public final void rule__View__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1904:1: ( ( '{' ) )
            // InternalSpice.g:1905:1: ( '{' )
            {
            // InternalSpice.g:1905:1: ( '{' )
            // InternalSpice.g:1906:2: '{'
            {
             before(grammarAccess.getViewAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getViewAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__3__Impl"


    // $ANTLR start "rule__View__Group__4"
    // InternalSpice.g:1915:1: rule__View__Group__4 : rule__View__Group__4__Impl rule__View__Group__5 ;
    public final void rule__View__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1919:1: ( rule__View__Group__4__Impl rule__View__Group__5 )
            // InternalSpice.g:1920:2: rule__View__Group__4__Impl rule__View__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__View__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__View__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__4"


    // $ANTLR start "rule__View__Group__4__Impl"
    // InternalSpice.g:1927:1: rule__View__Group__4__Impl : ( ( rule__View__Group_4__0 )? ) ;
    public final void rule__View__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1931:1: ( ( ( rule__View__Group_4__0 )? ) )
            // InternalSpice.g:1932:1: ( ( rule__View__Group_4__0 )? )
            {
            // InternalSpice.g:1932:1: ( ( rule__View__Group_4__0 )? )
            // InternalSpice.g:1933:2: ( rule__View__Group_4__0 )?
            {
             before(grammarAccess.getViewAccess().getGroup_4()); 
            // InternalSpice.g:1934:2: ( rule__View__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==35) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSpice.g:1934:3: rule__View__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__View__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViewAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__4__Impl"


    // $ANTLR start "rule__View__Group__5"
    // InternalSpice.g:1942:1: rule__View__Group__5 : rule__View__Group__5__Impl rule__View__Group__6 ;
    public final void rule__View__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1946:1: ( rule__View__Group__5__Impl rule__View__Group__6 )
            // InternalSpice.g:1947:2: rule__View__Group__5__Impl rule__View__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__View__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__View__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__5"


    // $ANTLR start "rule__View__Group__5__Impl"
    // InternalSpice.g:1954:1: rule__View__Group__5__Impl : ( ( rule__View__Group_5__0 )? ) ;
    public final void rule__View__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1958:1: ( ( ( rule__View__Group_5__0 )? ) )
            // InternalSpice.g:1959:1: ( ( rule__View__Group_5__0 )? )
            {
            // InternalSpice.g:1959:1: ( ( rule__View__Group_5__0 )? )
            // InternalSpice.g:1960:2: ( rule__View__Group_5__0 )?
            {
             before(grammarAccess.getViewAccess().getGroup_5()); 
            // InternalSpice.g:1961:2: ( rule__View__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSpice.g:1961:3: rule__View__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__View__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViewAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__5__Impl"


    // $ANTLR start "rule__View__Group__6"
    // InternalSpice.g:1969:1: rule__View__Group__6 : rule__View__Group__6__Impl rule__View__Group__7 ;
    public final void rule__View__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1973:1: ( rule__View__Group__6__Impl rule__View__Group__7 )
            // InternalSpice.g:1974:2: rule__View__Group__6__Impl rule__View__Group__7
            {
            pushFollow(FOLLOW_21);
            rule__View__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__View__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__6"


    // $ANTLR start "rule__View__Group__6__Impl"
    // InternalSpice.g:1981:1: rule__View__Group__6__Impl : ( ( rule__View__Group_6__0 )? ) ;
    public final void rule__View__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:1985:1: ( ( ( rule__View__Group_6__0 )? ) )
            // InternalSpice.g:1986:1: ( ( rule__View__Group_6__0 )? )
            {
            // InternalSpice.g:1986:1: ( ( rule__View__Group_6__0 )? )
            // InternalSpice.g:1987:2: ( rule__View__Group_6__0 )?
            {
             before(grammarAccess.getViewAccess().getGroup_6()); 
            // InternalSpice.g:1988:2: ( rule__View__Group_6__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSpice.g:1988:3: rule__View__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__View__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViewAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__6__Impl"


    // $ANTLR start "rule__View__Group__7"
    // InternalSpice.g:1996:1: rule__View__Group__7 : rule__View__Group__7__Impl rule__View__Group__8 ;
    public final void rule__View__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2000:1: ( rule__View__Group__7__Impl rule__View__Group__8 )
            // InternalSpice.g:2001:2: rule__View__Group__7__Impl rule__View__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__View__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__View__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__7"


    // $ANTLR start "rule__View__Group__7__Impl"
    // InternalSpice.g:2008:1: rule__View__Group__7__Impl : ( ( rule__View__Group_7__0 )? ) ;
    public final void rule__View__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2012:1: ( ( ( rule__View__Group_7__0 )? ) )
            // InternalSpice.g:2013:1: ( ( rule__View__Group_7__0 )? )
            {
            // InternalSpice.g:2013:1: ( ( rule__View__Group_7__0 )? )
            // InternalSpice.g:2014:2: ( rule__View__Group_7__0 )?
            {
             before(grammarAccess.getViewAccess().getGroup_7()); 
            // InternalSpice.g:2015:2: ( rule__View__Group_7__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSpice.g:2015:3: rule__View__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__View__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getViewAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__7__Impl"


    // $ANTLR start "rule__View__Group__8"
    // InternalSpice.g:2023:1: rule__View__Group__8 : rule__View__Group__8__Impl ;
    public final void rule__View__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2027:1: ( rule__View__Group__8__Impl )
            // InternalSpice.g:2028:2: rule__View__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__View__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__8"


    // $ANTLR start "rule__View__Group__8__Impl"
    // InternalSpice.g:2034:1: rule__View__Group__8__Impl : ( '}' ) ;
    public final void rule__View__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2038:1: ( ( '}' ) )
            // InternalSpice.g:2039:1: ( '}' )
            {
            // InternalSpice.g:2039:1: ( '}' )
            // InternalSpice.g:2040:2: '}'
            {
             before(grammarAccess.getViewAccess().getRightCurlyBracketKeyword_8()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getViewAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group__8__Impl"


    // $ANTLR start "rule__View__Group_4__0"
    // InternalSpice.g:2050:1: rule__View__Group_4__0 : rule__View__Group_4__0__Impl rule__View__Group_4__1 ;
    public final void rule__View__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2054:1: ( rule__View__Group_4__0__Impl rule__View__Group_4__1 )
            // InternalSpice.g:2055:2: rule__View__Group_4__0__Impl rule__View__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__View__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__View__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_4__0"


    // $ANTLR start "rule__View__Group_4__0__Impl"
    // InternalSpice.g:2062:1: rule__View__Group_4__0__Impl : ( 'host' ) ;
    public final void rule__View__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2066:1: ( ( 'host' ) )
            // InternalSpice.g:2067:1: ( 'host' )
            {
            // InternalSpice.g:2067:1: ( 'host' )
            // InternalSpice.g:2068:2: 'host'
            {
             before(grammarAccess.getViewAccess().getHostKeyword_4_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getViewAccess().getHostKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_4__0__Impl"


    // $ANTLR start "rule__View__Group_4__1"
    // InternalSpice.g:2077:1: rule__View__Group_4__1 : rule__View__Group_4__1__Impl ;
    public final void rule__View__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2081:1: ( rule__View__Group_4__1__Impl )
            // InternalSpice.g:2082:2: rule__View__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__View__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_4__1"


    // $ANTLR start "rule__View__Group_4__1__Impl"
    // InternalSpice.g:2088:1: rule__View__Group_4__1__Impl : ( ( rule__View__HostAssignment_4_1 ) ) ;
    public final void rule__View__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2092:1: ( ( ( rule__View__HostAssignment_4_1 ) ) )
            // InternalSpice.g:2093:1: ( ( rule__View__HostAssignment_4_1 ) )
            {
            // InternalSpice.g:2093:1: ( ( rule__View__HostAssignment_4_1 ) )
            // InternalSpice.g:2094:2: ( rule__View__HostAssignment_4_1 )
            {
             before(grammarAccess.getViewAccess().getHostAssignment_4_1()); 
            // InternalSpice.g:2095:2: ( rule__View__HostAssignment_4_1 )
            // InternalSpice.g:2095:3: rule__View__HostAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__View__HostAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getViewAccess().getHostAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_4__1__Impl"


    // $ANTLR start "rule__View__Group_5__0"
    // InternalSpice.g:2104:1: rule__View__Group_5__0 : rule__View__Group_5__0__Impl rule__View__Group_5__1 ;
    public final void rule__View__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2108:1: ( rule__View__Group_5__0__Impl rule__View__Group_5__1 )
            // InternalSpice.g:2109:2: rule__View__Group_5__0__Impl rule__View__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__View__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__View__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_5__0"


    // $ANTLR start "rule__View__Group_5__0__Impl"
    // InternalSpice.g:2116:1: rule__View__Group_5__0__Impl : ( 'port' ) ;
    public final void rule__View__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2120:1: ( ( 'port' ) )
            // InternalSpice.g:2121:1: ( 'port' )
            {
            // InternalSpice.g:2121:1: ( 'port' )
            // InternalSpice.g:2122:2: 'port'
            {
             before(grammarAccess.getViewAccess().getPortKeyword_5_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getViewAccess().getPortKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_5__0__Impl"


    // $ANTLR start "rule__View__Group_5__1"
    // InternalSpice.g:2131:1: rule__View__Group_5__1 : rule__View__Group_5__1__Impl ;
    public final void rule__View__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2135:1: ( rule__View__Group_5__1__Impl )
            // InternalSpice.g:2136:2: rule__View__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__View__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_5__1"


    // $ANTLR start "rule__View__Group_5__1__Impl"
    // InternalSpice.g:2142:1: rule__View__Group_5__1__Impl : ( ( rule__View__PortAssignment_5_1 ) ) ;
    public final void rule__View__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2146:1: ( ( ( rule__View__PortAssignment_5_1 ) ) )
            // InternalSpice.g:2147:1: ( ( rule__View__PortAssignment_5_1 ) )
            {
            // InternalSpice.g:2147:1: ( ( rule__View__PortAssignment_5_1 ) )
            // InternalSpice.g:2148:2: ( rule__View__PortAssignment_5_1 )
            {
             before(grammarAccess.getViewAccess().getPortAssignment_5_1()); 
            // InternalSpice.g:2149:2: ( rule__View__PortAssignment_5_1 )
            // InternalSpice.g:2149:3: rule__View__PortAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__View__PortAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getViewAccess().getPortAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_5__1__Impl"


    // $ANTLR start "rule__View__Group_6__0"
    // InternalSpice.g:2158:1: rule__View__Group_6__0 : rule__View__Group_6__0__Impl rule__View__Group_6__1 ;
    public final void rule__View__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2162:1: ( rule__View__Group_6__0__Impl rule__View__Group_6__1 )
            // InternalSpice.g:2163:2: rule__View__Group_6__0__Impl rule__View__Group_6__1
            {
            pushFollow(FOLLOW_6);
            rule__View__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__View__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_6__0"


    // $ANTLR start "rule__View__Group_6__0__Impl"
    // InternalSpice.g:2170:1: rule__View__Group_6__0__Impl : ( 'period' ) ;
    public final void rule__View__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2174:1: ( ( 'period' ) )
            // InternalSpice.g:2175:1: ( 'period' )
            {
            // InternalSpice.g:2175:1: ( 'period' )
            // InternalSpice.g:2176:2: 'period'
            {
             before(grammarAccess.getViewAccess().getPeriodKeyword_6_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getViewAccess().getPeriodKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_6__0__Impl"


    // $ANTLR start "rule__View__Group_6__1"
    // InternalSpice.g:2185:1: rule__View__Group_6__1 : rule__View__Group_6__1__Impl ;
    public final void rule__View__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2189:1: ( rule__View__Group_6__1__Impl )
            // InternalSpice.g:2190:2: rule__View__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__View__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_6__1"


    // $ANTLR start "rule__View__Group_6__1__Impl"
    // InternalSpice.g:2196:1: rule__View__Group_6__1__Impl : ( ( rule__View__PeriodAssignment_6_1 ) ) ;
    public final void rule__View__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2200:1: ( ( ( rule__View__PeriodAssignment_6_1 ) ) )
            // InternalSpice.g:2201:1: ( ( rule__View__PeriodAssignment_6_1 ) )
            {
            // InternalSpice.g:2201:1: ( ( rule__View__PeriodAssignment_6_1 ) )
            // InternalSpice.g:2202:2: ( rule__View__PeriodAssignment_6_1 )
            {
             before(grammarAccess.getViewAccess().getPeriodAssignment_6_1()); 
            // InternalSpice.g:2203:2: ( rule__View__PeriodAssignment_6_1 )
            // InternalSpice.g:2203:3: rule__View__PeriodAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__View__PeriodAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getViewAccess().getPeriodAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_6__1__Impl"


    // $ANTLR start "rule__View__Group_7__0"
    // InternalSpice.g:2212:1: rule__View__Group_7__0 : rule__View__Group_7__0__Impl rule__View__Group_7__1 ;
    public final void rule__View__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2216:1: ( rule__View__Group_7__0__Impl rule__View__Group_7__1 )
            // InternalSpice.g:2217:2: rule__View__Group_7__0__Impl rule__View__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__View__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__View__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_7__0"


    // $ANTLR start "rule__View__Group_7__0__Impl"
    // InternalSpice.g:2224:1: rule__View__Group_7__0__Impl : ( 'observe' ) ;
    public final void rule__View__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2228:1: ( ( 'observe' ) )
            // InternalSpice.g:2229:1: ( 'observe' )
            {
            // InternalSpice.g:2229:1: ( 'observe' )
            // InternalSpice.g:2230:2: 'observe'
            {
             before(grammarAccess.getViewAccess().getObserveKeyword_7_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getViewAccess().getObserveKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_7__0__Impl"


    // $ANTLR start "rule__View__Group_7__1"
    // InternalSpice.g:2239:1: rule__View__Group_7__1 : rule__View__Group_7__1__Impl rule__View__Group_7__2 ;
    public final void rule__View__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2243:1: ( rule__View__Group_7__1__Impl rule__View__Group_7__2 )
            // InternalSpice.g:2244:2: rule__View__Group_7__1__Impl rule__View__Group_7__2
            {
            pushFollow(FOLLOW_22);
            rule__View__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__View__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_7__1"


    // $ANTLR start "rule__View__Group_7__1__Impl"
    // InternalSpice.g:2251:1: rule__View__Group_7__1__Impl : ( ( rule__View__ObservedTagsAssignment_7_1 ) ) ;
    public final void rule__View__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2255:1: ( ( ( rule__View__ObservedTagsAssignment_7_1 ) ) )
            // InternalSpice.g:2256:1: ( ( rule__View__ObservedTagsAssignment_7_1 ) )
            {
            // InternalSpice.g:2256:1: ( ( rule__View__ObservedTagsAssignment_7_1 ) )
            // InternalSpice.g:2257:2: ( rule__View__ObservedTagsAssignment_7_1 )
            {
             before(grammarAccess.getViewAccess().getObservedTagsAssignment_7_1()); 
            // InternalSpice.g:2258:2: ( rule__View__ObservedTagsAssignment_7_1 )
            // InternalSpice.g:2258:3: rule__View__ObservedTagsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__View__ObservedTagsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getViewAccess().getObservedTagsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_7__1__Impl"


    // $ANTLR start "rule__View__Group_7__2"
    // InternalSpice.g:2266:1: rule__View__Group_7__2 : rule__View__Group_7__2__Impl rule__View__Group_7__3 ;
    public final void rule__View__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2270:1: ( rule__View__Group_7__2__Impl rule__View__Group_7__3 )
            // InternalSpice.g:2271:2: rule__View__Group_7__2__Impl rule__View__Group_7__3
            {
            pushFollow(FOLLOW_22);
            rule__View__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__View__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_7__2"


    // $ANTLR start "rule__View__Group_7__2__Impl"
    // InternalSpice.g:2278:1: rule__View__Group_7__2__Impl : ( ( rule__View__Group_7_2__0 )* ) ;
    public final void rule__View__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2282:1: ( ( ( rule__View__Group_7_2__0 )* ) )
            // InternalSpice.g:2283:1: ( ( rule__View__Group_7_2__0 )* )
            {
            // InternalSpice.g:2283:1: ( ( rule__View__Group_7_2__0 )* )
            // InternalSpice.g:2284:2: ( rule__View__Group_7_2__0 )*
            {
             before(grammarAccess.getViewAccess().getGroup_7_2()); 
            // InternalSpice.g:2285:2: ( rule__View__Group_7_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==29) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSpice.g:2285:3: rule__View__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__View__Group_7_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getViewAccess().getGroup_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_7__2__Impl"


    // $ANTLR start "rule__View__Group_7__3"
    // InternalSpice.g:2293:1: rule__View__Group_7__3 : rule__View__Group_7__3__Impl ;
    public final void rule__View__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2297:1: ( rule__View__Group_7__3__Impl )
            // InternalSpice.g:2298:2: rule__View__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__View__Group_7__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_7__3"


    // $ANTLR start "rule__View__Group_7__3__Impl"
    // InternalSpice.g:2304:1: rule__View__Group_7__3__Impl : ( ';' ) ;
    public final void rule__View__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2308:1: ( ( ';' ) )
            // InternalSpice.g:2309:1: ( ';' )
            {
            // InternalSpice.g:2309:1: ( ';' )
            // InternalSpice.g:2310:2: ';'
            {
             before(grammarAccess.getViewAccess().getSemicolonKeyword_7_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getViewAccess().getSemicolonKeyword_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_7__3__Impl"


    // $ANTLR start "rule__View__Group_7_2__0"
    // InternalSpice.g:2320:1: rule__View__Group_7_2__0 : rule__View__Group_7_2__0__Impl rule__View__Group_7_2__1 ;
    public final void rule__View__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2324:1: ( rule__View__Group_7_2__0__Impl rule__View__Group_7_2__1 )
            // InternalSpice.g:2325:2: rule__View__Group_7_2__0__Impl rule__View__Group_7_2__1
            {
            pushFollow(FOLLOW_4);
            rule__View__Group_7_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__View__Group_7_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_7_2__0"


    // $ANTLR start "rule__View__Group_7_2__0__Impl"
    // InternalSpice.g:2332:1: rule__View__Group_7_2__0__Impl : ( ',' ) ;
    public final void rule__View__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2336:1: ( ( ',' ) )
            // InternalSpice.g:2337:1: ( ',' )
            {
            // InternalSpice.g:2337:1: ( ',' )
            // InternalSpice.g:2338:2: ','
            {
             before(grammarAccess.getViewAccess().getCommaKeyword_7_2_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getViewAccess().getCommaKeyword_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_7_2__0__Impl"


    // $ANTLR start "rule__View__Group_7_2__1"
    // InternalSpice.g:2347:1: rule__View__Group_7_2__1 : rule__View__Group_7_2__1__Impl ;
    public final void rule__View__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2351:1: ( rule__View__Group_7_2__1__Impl )
            // InternalSpice.g:2352:2: rule__View__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__View__Group_7_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_7_2__1"


    // $ANTLR start "rule__View__Group_7_2__1__Impl"
    // InternalSpice.g:2358:1: rule__View__Group_7_2__1__Impl : ( ( rule__View__ObservedTagsAssignment_7_2_1 ) ) ;
    public final void rule__View__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2362:1: ( ( ( rule__View__ObservedTagsAssignment_7_2_1 ) ) )
            // InternalSpice.g:2363:1: ( ( rule__View__ObservedTagsAssignment_7_2_1 ) )
            {
            // InternalSpice.g:2363:1: ( ( rule__View__ObservedTagsAssignment_7_2_1 ) )
            // InternalSpice.g:2364:2: ( rule__View__ObservedTagsAssignment_7_2_1 )
            {
             before(grammarAccess.getViewAccess().getObservedTagsAssignment_7_2_1()); 
            // InternalSpice.g:2365:2: ( rule__View__ObservedTagsAssignment_7_2_1 )
            // InternalSpice.g:2365:3: rule__View__ObservedTagsAssignment_7_2_1
            {
            pushFollow(FOLLOW_2);
            rule__View__ObservedTagsAssignment_7_2_1();

            state._fsp--;


            }

             after(grammarAccess.getViewAccess().getObservedTagsAssignment_7_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Group_7_2__1__Impl"


    // $ANTLR start "rule__IntBasic__Group__0"
    // InternalSpice.g:2374:1: rule__IntBasic__Group__0 : rule__IntBasic__Group__0__Impl rule__IntBasic__Group__1 ;
    public final void rule__IntBasic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2378:1: ( rule__IntBasic__Group__0__Impl rule__IntBasic__Group__1 )
            // InternalSpice.g:2379:2: rule__IntBasic__Group__0__Impl rule__IntBasic__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__IntBasic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntBasic__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntBasic__Group__0"


    // $ANTLR start "rule__IntBasic__Group__0__Impl"
    // InternalSpice.g:2386:1: rule__IntBasic__Group__0__Impl : ( ( rule__IntBasic__IsObservableAssignment_0 )? ) ;
    public final void rule__IntBasic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2390:1: ( ( ( rule__IntBasic__IsObservableAssignment_0 )? ) )
            // InternalSpice.g:2391:1: ( ( rule__IntBasic__IsObservableAssignment_0 )? )
            {
            // InternalSpice.g:2391:1: ( ( rule__IntBasic__IsObservableAssignment_0 )? )
            // InternalSpice.g:2392:2: ( rule__IntBasic__IsObservableAssignment_0 )?
            {
             before(grammarAccess.getIntBasicAccess().getIsObservableAssignment_0()); 
            // InternalSpice.g:2393:2: ( rule__IntBasic__IsObservableAssignment_0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==52) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSpice.g:2393:3: rule__IntBasic__IsObservableAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IntBasic__IsObservableAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntBasicAccess().getIsObservableAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntBasic__Group__0__Impl"


    // $ANTLR start "rule__IntBasic__Group__1"
    // InternalSpice.g:2401:1: rule__IntBasic__Group__1 : rule__IntBasic__Group__1__Impl rule__IntBasic__Group__2 ;
    public final void rule__IntBasic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2405:1: ( rule__IntBasic__Group__1__Impl rule__IntBasic__Group__2 )
            // InternalSpice.g:2406:2: rule__IntBasic__Group__1__Impl rule__IntBasic__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__IntBasic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntBasic__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntBasic__Group__1"


    // $ANTLR start "rule__IntBasic__Group__1__Impl"
    // InternalSpice.g:2413:1: rule__IntBasic__Group__1__Impl : ( ( rule__IntBasic__TypeAssignment_1 ) ) ;
    public final void rule__IntBasic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2417:1: ( ( ( rule__IntBasic__TypeAssignment_1 ) ) )
            // InternalSpice.g:2418:1: ( ( rule__IntBasic__TypeAssignment_1 ) )
            {
            // InternalSpice.g:2418:1: ( ( rule__IntBasic__TypeAssignment_1 ) )
            // InternalSpice.g:2419:2: ( rule__IntBasic__TypeAssignment_1 )
            {
             before(grammarAccess.getIntBasicAccess().getTypeAssignment_1()); 
            // InternalSpice.g:2420:2: ( rule__IntBasic__TypeAssignment_1 )
            // InternalSpice.g:2420:3: rule__IntBasic__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IntBasic__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIntBasicAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntBasic__Group__1__Impl"


    // $ANTLR start "rule__IntBasic__Group__2"
    // InternalSpice.g:2428:1: rule__IntBasic__Group__2 : rule__IntBasic__Group__2__Impl rule__IntBasic__Group__3 ;
    public final void rule__IntBasic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2432:1: ( rule__IntBasic__Group__2__Impl rule__IntBasic__Group__3 )
            // InternalSpice.g:2433:2: rule__IntBasic__Group__2__Impl rule__IntBasic__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__IntBasic__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntBasic__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntBasic__Group__2"


    // $ANTLR start "rule__IntBasic__Group__2__Impl"
    // InternalSpice.g:2440:1: rule__IntBasic__Group__2__Impl : ( ( rule__IntBasic__NameAssignment_2 ) ) ;
    public final void rule__IntBasic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2444:1: ( ( ( rule__IntBasic__NameAssignment_2 ) ) )
            // InternalSpice.g:2445:1: ( ( rule__IntBasic__NameAssignment_2 ) )
            {
            // InternalSpice.g:2445:1: ( ( rule__IntBasic__NameAssignment_2 ) )
            // InternalSpice.g:2446:2: ( rule__IntBasic__NameAssignment_2 )
            {
             before(grammarAccess.getIntBasicAccess().getNameAssignment_2()); 
            // InternalSpice.g:2447:2: ( rule__IntBasic__NameAssignment_2 )
            // InternalSpice.g:2447:3: rule__IntBasic__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__IntBasic__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIntBasicAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntBasic__Group__2__Impl"


    // $ANTLR start "rule__IntBasic__Group__3"
    // InternalSpice.g:2455:1: rule__IntBasic__Group__3 : rule__IntBasic__Group__3__Impl rule__IntBasic__Group__4 ;
    public final void rule__IntBasic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2459:1: ( rule__IntBasic__Group__3__Impl rule__IntBasic__Group__4 )
            // InternalSpice.g:2460:2: rule__IntBasic__Group__3__Impl rule__IntBasic__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__IntBasic__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntBasic__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntBasic__Group__3"


    // $ANTLR start "rule__IntBasic__Group__3__Impl"
    // InternalSpice.g:2467:1: rule__IntBasic__Group__3__Impl : ( '=' ) ;
    public final void rule__IntBasic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2471:1: ( ( '=' ) )
            // InternalSpice.g:2472:1: ( '=' )
            {
            // InternalSpice.g:2472:1: ( '=' )
            // InternalSpice.g:2473:2: '='
            {
             before(grammarAccess.getIntBasicAccess().getEqualsSignKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getIntBasicAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntBasic__Group__3__Impl"


    // $ANTLR start "rule__IntBasic__Group__4"
    // InternalSpice.g:2482:1: rule__IntBasic__Group__4 : rule__IntBasic__Group__4__Impl rule__IntBasic__Group__5 ;
    public final void rule__IntBasic__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2486:1: ( rule__IntBasic__Group__4__Impl rule__IntBasic__Group__5 )
            // InternalSpice.g:2487:2: rule__IntBasic__Group__4__Impl rule__IntBasic__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__IntBasic__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntBasic__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntBasic__Group__4"


    // $ANTLR start "rule__IntBasic__Group__4__Impl"
    // InternalSpice.g:2494:1: rule__IntBasic__Group__4__Impl : ( ( rule__IntBasic__ValueAssignment_4 ) ) ;
    public final void rule__IntBasic__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2498:1: ( ( ( rule__IntBasic__ValueAssignment_4 ) ) )
            // InternalSpice.g:2499:1: ( ( rule__IntBasic__ValueAssignment_4 ) )
            {
            // InternalSpice.g:2499:1: ( ( rule__IntBasic__ValueAssignment_4 ) )
            // InternalSpice.g:2500:2: ( rule__IntBasic__ValueAssignment_4 )
            {
             before(grammarAccess.getIntBasicAccess().getValueAssignment_4()); 
            // InternalSpice.g:2501:2: ( rule__IntBasic__ValueAssignment_4 )
            // InternalSpice.g:2501:3: rule__IntBasic__ValueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__IntBasic__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIntBasicAccess().getValueAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntBasic__Group__4__Impl"


    // $ANTLR start "rule__IntBasic__Group__5"
    // InternalSpice.g:2509:1: rule__IntBasic__Group__5 : rule__IntBasic__Group__5__Impl ;
    public final void rule__IntBasic__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2513:1: ( rule__IntBasic__Group__5__Impl )
            // InternalSpice.g:2514:2: rule__IntBasic__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntBasic__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntBasic__Group__5"


    // $ANTLR start "rule__IntBasic__Group__5__Impl"
    // InternalSpice.g:2520:1: rule__IntBasic__Group__5__Impl : ( ';' ) ;
    public final void rule__IntBasic__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2524:1: ( ( ';' ) )
            // InternalSpice.g:2525:1: ( ';' )
            {
            // InternalSpice.g:2525:1: ( ';' )
            // InternalSpice.g:2526:2: ';'
            {
             before(grammarAccess.getIntBasicAccess().getSemicolonKeyword_5()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getIntBasicAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntBasic__Group__5__Impl"


    // $ANTLR start "rule__IntArray__Group__0"
    // InternalSpice.g:2536:1: rule__IntArray__Group__0 : rule__IntArray__Group__0__Impl rule__IntArray__Group__1 ;
    public final void rule__IntArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2540:1: ( rule__IntArray__Group__0__Impl rule__IntArray__Group__1 )
            // InternalSpice.g:2541:2: rule__IntArray__Group__0__Impl rule__IntArray__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__IntArray__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntArray__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntArray__Group__0"


    // $ANTLR start "rule__IntArray__Group__0__Impl"
    // InternalSpice.g:2548:1: rule__IntArray__Group__0__Impl : ( ( rule__IntArray__IsObservableAssignment_0 )? ) ;
    public final void rule__IntArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2552:1: ( ( ( rule__IntArray__IsObservableAssignment_0 )? ) )
            // InternalSpice.g:2553:1: ( ( rule__IntArray__IsObservableAssignment_0 )? )
            {
            // InternalSpice.g:2553:1: ( ( rule__IntArray__IsObservableAssignment_0 )? )
            // InternalSpice.g:2554:2: ( rule__IntArray__IsObservableAssignment_0 )?
            {
             before(grammarAccess.getIntArrayAccess().getIsObservableAssignment_0()); 
            // InternalSpice.g:2555:2: ( rule__IntArray__IsObservableAssignment_0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==52) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSpice.g:2555:3: rule__IntArray__IsObservableAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IntArray__IsObservableAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntArrayAccess().getIsObservableAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntArray__Group__0__Impl"


    // $ANTLR start "rule__IntArray__Group__1"
    // InternalSpice.g:2563:1: rule__IntArray__Group__1 : rule__IntArray__Group__1__Impl rule__IntArray__Group__2 ;
    public final void rule__IntArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2567:1: ( rule__IntArray__Group__1__Impl rule__IntArray__Group__2 )
            // InternalSpice.g:2568:2: rule__IntArray__Group__1__Impl rule__IntArray__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__IntArray__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntArray__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntArray__Group__1"


    // $ANTLR start "rule__IntArray__Group__1__Impl"
    // InternalSpice.g:2575:1: rule__IntArray__Group__1__Impl : ( ( rule__IntArray__TypeAssignment_1 ) ) ;
    public final void rule__IntArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2579:1: ( ( ( rule__IntArray__TypeAssignment_1 ) ) )
            // InternalSpice.g:2580:1: ( ( rule__IntArray__TypeAssignment_1 ) )
            {
            // InternalSpice.g:2580:1: ( ( rule__IntArray__TypeAssignment_1 ) )
            // InternalSpice.g:2581:2: ( rule__IntArray__TypeAssignment_1 )
            {
             before(grammarAccess.getIntArrayAccess().getTypeAssignment_1()); 
            // InternalSpice.g:2582:2: ( rule__IntArray__TypeAssignment_1 )
            // InternalSpice.g:2582:3: rule__IntArray__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__IntArray__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIntArrayAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntArray__Group__1__Impl"


    // $ANTLR start "rule__IntArray__Group__2"
    // InternalSpice.g:2590:1: rule__IntArray__Group__2 : rule__IntArray__Group__2__Impl rule__IntArray__Group__3 ;
    public final void rule__IntArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2594:1: ( rule__IntArray__Group__2__Impl rule__IntArray__Group__3 )
            // InternalSpice.g:2595:2: rule__IntArray__Group__2__Impl rule__IntArray__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__IntArray__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntArray__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntArray__Group__2"


    // $ANTLR start "rule__IntArray__Group__2__Impl"
    // InternalSpice.g:2602:1: rule__IntArray__Group__2__Impl : ( ( rule__IntArray__Group_2__0 )? ) ;
    public final void rule__IntArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2606:1: ( ( ( rule__IntArray__Group_2__0 )? ) )
            // InternalSpice.g:2607:1: ( ( rule__IntArray__Group_2__0 )? )
            {
            // InternalSpice.g:2607:1: ( ( rule__IntArray__Group_2__0 )? )
            // InternalSpice.g:2608:2: ( rule__IntArray__Group_2__0 )?
            {
             before(grammarAccess.getIntArrayAccess().getGroup_2()); 
            // InternalSpice.g:2609:2: ( rule__IntArray__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==41) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSpice.g:2609:3: rule__IntArray__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__IntArray__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIntArrayAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntArray__Group__2__Impl"


    // $ANTLR start "rule__IntArray__Group__3"
    // InternalSpice.g:2617:1: rule__IntArray__Group__3 : rule__IntArray__Group__3__Impl rule__IntArray__Group__4 ;
    public final void rule__IntArray__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2621:1: ( rule__IntArray__Group__3__Impl rule__IntArray__Group__4 )
            // InternalSpice.g:2622:2: rule__IntArray__Group__3__Impl rule__IntArray__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__IntArray__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntArray__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntArray__Group__3"


    // $ANTLR start "rule__IntArray__Group__3__Impl"
    // InternalSpice.g:2629:1: rule__IntArray__Group__3__Impl : ( ( rule__IntArray__NameAssignment_3 ) ) ;
    public final void rule__IntArray__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2633:1: ( ( ( rule__IntArray__NameAssignment_3 ) ) )
            // InternalSpice.g:2634:1: ( ( rule__IntArray__NameAssignment_3 ) )
            {
            // InternalSpice.g:2634:1: ( ( rule__IntArray__NameAssignment_3 ) )
            // InternalSpice.g:2635:2: ( rule__IntArray__NameAssignment_3 )
            {
             before(grammarAccess.getIntArrayAccess().getNameAssignment_3()); 
            // InternalSpice.g:2636:2: ( rule__IntArray__NameAssignment_3 )
            // InternalSpice.g:2636:3: rule__IntArray__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__IntArray__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIntArrayAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntArray__Group__3__Impl"


    // $ANTLR start "rule__IntArray__Group__4"
    // InternalSpice.g:2644:1: rule__IntArray__Group__4 : rule__IntArray__Group__4__Impl rule__IntArray__Group__5 ;
    public final void rule__IntArray__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2648:1: ( rule__IntArray__Group__4__Impl rule__IntArray__Group__5 )
            // InternalSpice.g:2649:2: rule__IntArray__Group__4__Impl rule__IntArray__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__IntArray__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntArray__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntArray__Group__4"


    // $ANTLR start "rule__IntArray__Group__4__Impl"
    // InternalSpice.g:2656:1: rule__IntArray__Group__4__Impl : ( '=' ) ;
    public final void rule__IntArray__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2660:1: ( ( '=' ) )
            // InternalSpice.g:2661:1: ( '=' )
            {
            // InternalSpice.g:2661:1: ( '=' )
            // InternalSpice.g:2662:2: '='
            {
             before(grammarAccess.getIntArrayAccess().getEqualsSignKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getIntArrayAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntArray__Group__4__Impl"


    // $ANTLR start "rule__IntArray__Group__5"
    // InternalSpice.g:2671:1: rule__IntArray__Group__5 : rule__IntArray__Group__5__Impl rule__IntArray__Group__6 ;
    public final void rule__IntArray__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2675:1: ( rule__IntArray__Group__5__Impl rule__IntArray__Group__6 )
            // InternalSpice.g:2676:2: rule__IntArray__Group__5__Impl rule__IntArray__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__IntArray__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntArray__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntArray__Group__5"


    // $ANTLR start "rule__IntArray__Group__5__Impl"
    // InternalSpice.g:2683:1: rule__IntArray__Group__5__Impl : ( ( rule__IntArray__Group_5__0 ) ) ;
    public final void rule__IntArray__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2687:1: ( ( ( rule__IntArray__Group_5__0 ) ) )
            // InternalSpice.g:2688:1: ( ( rule__IntArray__Group_5__0 ) )
            {
            // InternalSpice.g:2688:1: ( ( rule__IntArray__Group_5__0 ) )
            // InternalSpice.g:2689:2: ( rule__IntArray__Group_5__0 )
            {
             before(grammarAccess.getIntArrayAccess().getGroup_5()); 
            // InternalSpice.g:2690:2: ( rule__IntArray__Group_5__0 )
            // InternalSpice.g:2690:3: rule__IntArray__Group_5__0
            {
            pushFollow(FOLLOW_2);
            rule__IntArray__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getIntArrayAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntArray__Group__5__Impl"


    // $ANTLR start "rule__IntArray__Group__6"
    // InternalSpice.g:2698:1: rule__IntArray__Group__6 : rule__IntArray__Group__6__Impl ;
    public final void rule__IntArray__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2702:1: ( rule__IntArray__Group__6__Impl )
            // InternalSpice.g:2703:2: rule__IntArray__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntArray__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntArray__Group__6"


    // $ANTLR start "rule__IntArray__Group__6__Impl"
    // InternalSpice.g:2709:1: rule__IntArray__Group__6__Impl : ( ';' ) ;
    public final void rule__IntArray__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2713:1: ( ( ';' ) )
            // InternalSpice.g:2714:1: ( ';' )
            {
            // InternalSpice.g:2714:1: ( ';' )
            // InternalSpice.g:2715:2: ';'
            {
             before(grammarAccess.getIntArrayAccess().getSemicolonKeyword_6()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getIntArrayAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntArray__Group__6__Impl"


    // $ANTLR start "rule__IntArray__Group_2__0"
    // InternalSpice.g:2725:1: rule__IntArray__Group_2__0 : rule__IntArray__Group_2__0__Impl rule__IntArray__Group_2__1 ;
    public final void rule__IntArray__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2729:1: ( rule__IntArray__Group_2__0__Impl rule__IntArray__Group_2__1 )
            // InternalSpice.g:2730:2: rule__IntArray__Group_2__0__Impl rule__IntArray__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__IntArray__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntArray__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntArray__Group_2__0"


    // $ANTLR start "rule__IntArray__Group_2__0__Impl"
    // InternalSpice.g:2737:1: rule__IntArray__Group_2__0__Impl : ( '[' ) ;
    public final void rule__IntArray__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2741:1: ( ( '[' ) )
            // InternalSpice.g:2742:1: ( '[' )
            {
            // InternalSpice.g:2742:1: ( '[' )
            // InternalSpice.g:2743:2: '['
            {
             before(grammarAccess.getIntArrayAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getIntArrayAccess().getLeftSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntArray__Group_2__0__Impl"


    // $ANTLR start "rule__IntArray__Group_2__1"
    // InternalSpice.g:2752:1: rule__IntArray__Group_2__1 : rule__IntArray__Group_2__1__Impl rule__IntArray__Group_2__2 ;
    public final void rule__IntArray__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2756:1: ( rule__IntArray__Group_2__1__Impl rule__IntArray__Group_2__2 )
            // InternalSpice.g:2757:2: rule__IntArray__Group_2__1__Impl rule__IntArray__Group_2__2
            {
            pushFollow(FOLLOW_27);
            rule__IntArray__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntArray__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntArray__Group_2__1"


    // $ANTLR start "rule__IntArray__Group_2__1__Impl"
    // InternalSpice.g:2764:1: rule__IntArray__Group_2__1__Impl : ( ( rule__IntArray__MultiplicityAssignment_2_1 ) ) ;
    public final void rule__IntArray__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2768:1: ( ( ( rule__IntArray__MultiplicityAssignment_2_1 ) ) )
            // InternalSpice.g:2769:1: ( ( rule__IntArray__MultiplicityAssignment_2_1 ) )
            {
            // InternalSpice.g:2769:1: ( ( rule__IntArray__MultiplicityAssignment_2_1 ) )
            // InternalSpice.g:2770:2: ( rule__IntArray__MultiplicityAssignment_2_1 )
            {
             before(grammarAccess.getIntArrayAccess().getMultiplicityAssignment_2_1()); 
            // InternalSpice.g:2771:2: ( rule__IntArray__MultiplicityAssignment_2_1 )
            // InternalSpice.g:2771:3: rule__IntArray__MultiplicityAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__IntArray__MultiplicityAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getIntArrayAccess().getMultiplicityAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntArray__Group_2__1__Impl"


    // $ANTLR start "rule__IntArray__Group_2__2"
    // InternalSpice.g:2779:1: rule__IntArray__Group_2__2 : rule__IntArray__Group_2__2__Impl ;
    public final void rule__IntArray__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2783:1: ( rule__IntArray__Group_2__2__Impl )
            // InternalSpice.g:2784:2: rule__IntArray__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntArray__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntArray__Group_2__2"


    // $ANTLR start "rule__IntArray__Group_2__2__Impl"
    // InternalSpice.g:2790:1: rule__IntArray__Group_2__2__Impl : ( ']' ) ;
    public final void rule__IntArray__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2794:1: ( ( ']' ) )
            // InternalSpice.g:2795:1: ( ']' )
            {
            // InternalSpice.g:2795:1: ( ']' )
            // InternalSpice.g:2796:2: ']'
            {
             before(grammarAccess.getIntArrayAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getIntArrayAccess().getRightSquareBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntArray__Group_2__2__Impl"


    // $ANTLR start "rule__IntArray__Group_5__0"
    // InternalSpice.g:2806:1: rule__IntArray__Group_5__0 : rule__IntArray__Group_5__0__Impl rule__IntArray__Group_5__1 ;
    public final void rule__IntArray__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2810:1: ( rule__IntArray__Group_5__0__Impl rule__IntArray__Group_5__1 )
            // InternalSpice.g:2811:2: rule__IntArray__Group_5__0__Impl rule__IntArray__Group_5__1
            {
            pushFollow(FOLLOW_6);
            rule__IntArray__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntArray__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntArray__Group_5__0"


    // $ANTLR start "rule__IntArray__Group_5__0__Impl"
    // InternalSpice.g:2818:1: rule__IntArray__Group_5__0__Impl : ( '(' ) ;
    public final void rule__IntArray__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2822:1: ( ( '(' ) )
            // InternalSpice.g:2823:1: ( '(' )
            {
            // InternalSpice.g:2823:1: ( '(' )
            // InternalSpice.g:2824:2: '('
            {
             before(grammarAccess.getIntArrayAccess().getLeftParenthesisKeyword_5_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getIntArrayAccess().getLeftParenthesisKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntArray__Group_5__0__Impl"


    // $ANTLR start "rule__IntArray__Group_5__1"
    // InternalSpice.g:2833:1: rule__IntArray__Group_5__1 : rule__IntArray__Group_5__1__Impl rule__IntArray__Group_5__2 ;
    public final void rule__IntArray__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2837:1: ( rule__IntArray__Group_5__1__Impl rule__IntArray__Group_5__2 )
            // InternalSpice.g:2838:2: rule__IntArray__Group_5__1__Impl rule__IntArray__Group_5__2
            {
            pushFollow(FOLLOW_7);
            rule__IntArray__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntArray__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntArray__Group_5__1"


    // $ANTLR start "rule__IntArray__Group_5__1__Impl"
    // InternalSpice.g:2845:1: rule__IntArray__Group_5__1__Impl : ( ( rule__IntArray__ValueAssignment_5_1 ) ) ;
    public final void rule__IntArray__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2849:1: ( ( ( rule__IntArray__ValueAssignment_5_1 ) ) )
            // InternalSpice.g:2850:1: ( ( rule__IntArray__ValueAssignment_5_1 ) )
            {
            // InternalSpice.g:2850:1: ( ( rule__IntArray__ValueAssignment_5_1 ) )
            // InternalSpice.g:2851:2: ( rule__IntArray__ValueAssignment_5_1 )
            {
             before(grammarAccess.getIntArrayAccess().getValueAssignment_5_1()); 
            // InternalSpice.g:2852:2: ( rule__IntArray__ValueAssignment_5_1 )
            // InternalSpice.g:2852:3: rule__IntArray__ValueAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__IntArray__ValueAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getIntArrayAccess().getValueAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntArray__Group_5__1__Impl"


    // $ANTLR start "rule__IntArray__Group_5__2"
    // InternalSpice.g:2860:1: rule__IntArray__Group_5__2 : rule__IntArray__Group_5__2__Impl rule__IntArray__Group_5__3 ;
    public final void rule__IntArray__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2864:1: ( rule__IntArray__Group_5__2__Impl rule__IntArray__Group_5__3 )
            // InternalSpice.g:2865:2: rule__IntArray__Group_5__2__Impl rule__IntArray__Group_5__3
            {
            pushFollow(FOLLOW_6);
            rule__IntArray__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntArray__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntArray__Group_5__2"


    // $ANTLR start "rule__IntArray__Group_5__2__Impl"
    // InternalSpice.g:2872:1: rule__IntArray__Group_5__2__Impl : ( ',' ) ;
    public final void rule__IntArray__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2876:1: ( ( ',' ) )
            // InternalSpice.g:2877:1: ( ',' )
            {
            // InternalSpice.g:2877:1: ( ',' )
            // InternalSpice.g:2878:2: ','
            {
             before(grammarAccess.getIntArrayAccess().getCommaKeyword_5_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getIntArrayAccess().getCommaKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntArray__Group_5__2__Impl"


    // $ANTLR start "rule__IntArray__Group_5__3"
    // InternalSpice.g:2887:1: rule__IntArray__Group_5__3 : rule__IntArray__Group_5__3__Impl rule__IntArray__Group_5__4 ;
    public final void rule__IntArray__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2891:1: ( rule__IntArray__Group_5__3__Impl rule__IntArray__Group_5__4 )
            // InternalSpice.g:2892:2: rule__IntArray__Group_5__3__Impl rule__IntArray__Group_5__4
            {
            pushFollow(FOLLOW_28);
            rule__IntArray__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntArray__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntArray__Group_5__3"


    // $ANTLR start "rule__IntArray__Group_5__3__Impl"
    // InternalSpice.g:2899:1: rule__IntArray__Group_5__3__Impl : ( ( rule__IntArray__ValueAssignment_5_3 ) ) ;
    public final void rule__IntArray__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2903:1: ( ( ( rule__IntArray__ValueAssignment_5_3 ) ) )
            // InternalSpice.g:2904:1: ( ( rule__IntArray__ValueAssignment_5_3 ) )
            {
            // InternalSpice.g:2904:1: ( ( rule__IntArray__ValueAssignment_5_3 ) )
            // InternalSpice.g:2905:2: ( rule__IntArray__ValueAssignment_5_3 )
            {
             before(grammarAccess.getIntArrayAccess().getValueAssignment_5_3()); 
            // InternalSpice.g:2906:2: ( rule__IntArray__ValueAssignment_5_3 )
            // InternalSpice.g:2906:3: rule__IntArray__ValueAssignment_5_3
            {
            pushFollow(FOLLOW_2);
            rule__IntArray__ValueAssignment_5_3();

            state._fsp--;


            }

             after(grammarAccess.getIntArrayAccess().getValueAssignment_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntArray__Group_5__3__Impl"


    // $ANTLR start "rule__IntArray__Group_5__4"
    // InternalSpice.g:2914:1: rule__IntArray__Group_5__4 : rule__IntArray__Group_5__4__Impl rule__IntArray__Group_5__5 ;
    public final void rule__IntArray__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2918:1: ( rule__IntArray__Group_5__4__Impl rule__IntArray__Group_5__5 )
            // InternalSpice.g:2919:2: rule__IntArray__Group_5__4__Impl rule__IntArray__Group_5__5
            {
            pushFollow(FOLLOW_28);
            rule__IntArray__Group_5__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntArray__Group_5__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntArray__Group_5__4"


    // $ANTLR start "rule__IntArray__Group_5__4__Impl"
    // InternalSpice.g:2926:1: rule__IntArray__Group_5__4__Impl : ( ( rule__IntArray__Group_5_4__0 )* ) ;
    public final void rule__IntArray__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2930:1: ( ( ( rule__IntArray__Group_5_4__0 )* ) )
            // InternalSpice.g:2931:1: ( ( rule__IntArray__Group_5_4__0 )* )
            {
            // InternalSpice.g:2931:1: ( ( rule__IntArray__Group_5_4__0 )* )
            // InternalSpice.g:2932:2: ( rule__IntArray__Group_5_4__0 )*
            {
             before(grammarAccess.getIntArrayAccess().getGroup_5_4()); 
            // InternalSpice.g:2933:2: ( rule__IntArray__Group_5_4__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==29) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalSpice.g:2933:3: rule__IntArray__Group_5_4__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__IntArray__Group_5_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getIntArrayAccess().getGroup_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntArray__Group_5__4__Impl"


    // $ANTLR start "rule__IntArray__Group_5__5"
    // InternalSpice.g:2941:1: rule__IntArray__Group_5__5 : rule__IntArray__Group_5__5__Impl ;
    public final void rule__IntArray__Group_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2945:1: ( rule__IntArray__Group_5__5__Impl )
            // InternalSpice.g:2946:2: rule__IntArray__Group_5__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntArray__Group_5__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntArray__Group_5__5"


    // $ANTLR start "rule__IntArray__Group_5__5__Impl"
    // InternalSpice.g:2952:1: rule__IntArray__Group_5__5__Impl : ( ')' ) ;
    public final void rule__IntArray__Group_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2956:1: ( ( ')' ) )
            // InternalSpice.g:2957:1: ( ')' )
            {
            // InternalSpice.g:2957:1: ( ')' )
            // InternalSpice.g:2958:2: ')'
            {
             before(grammarAccess.getIntArrayAccess().getRightParenthesisKeyword_5_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getIntArrayAccess().getRightParenthesisKeyword_5_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntArray__Group_5__5__Impl"


    // $ANTLR start "rule__IntArray__Group_5_4__0"
    // InternalSpice.g:2968:1: rule__IntArray__Group_5_4__0 : rule__IntArray__Group_5_4__0__Impl rule__IntArray__Group_5_4__1 ;
    public final void rule__IntArray__Group_5_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2972:1: ( rule__IntArray__Group_5_4__0__Impl rule__IntArray__Group_5_4__1 )
            // InternalSpice.g:2973:2: rule__IntArray__Group_5_4__0__Impl rule__IntArray__Group_5_4__1
            {
            pushFollow(FOLLOW_6);
            rule__IntArray__Group_5_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__IntArray__Group_5_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntArray__Group_5_4__0"


    // $ANTLR start "rule__IntArray__Group_5_4__0__Impl"
    // InternalSpice.g:2980:1: rule__IntArray__Group_5_4__0__Impl : ( ',' ) ;
    public final void rule__IntArray__Group_5_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2984:1: ( ( ',' ) )
            // InternalSpice.g:2985:1: ( ',' )
            {
            // InternalSpice.g:2985:1: ( ',' )
            // InternalSpice.g:2986:2: ','
            {
             before(grammarAccess.getIntArrayAccess().getCommaKeyword_5_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getIntArrayAccess().getCommaKeyword_5_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntArray__Group_5_4__0__Impl"


    // $ANTLR start "rule__IntArray__Group_5_4__1"
    // InternalSpice.g:2995:1: rule__IntArray__Group_5_4__1 : rule__IntArray__Group_5_4__1__Impl ;
    public final void rule__IntArray__Group_5_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:2999:1: ( rule__IntArray__Group_5_4__1__Impl )
            // InternalSpice.g:3000:2: rule__IntArray__Group_5_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__IntArray__Group_5_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntArray__Group_5_4__1"


    // $ANTLR start "rule__IntArray__Group_5_4__1__Impl"
    // InternalSpice.g:3006:1: rule__IntArray__Group_5_4__1__Impl : ( ( rule__IntArray__ValueAssignment_5_4_1 ) ) ;
    public final void rule__IntArray__Group_5_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3010:1: ( ( ( rule__IntArray__ValueAssignment_5_4_1 ) ) )
            // InternalSpice.g:3011:1: ( ( rule__IntArray__ValueAssignment_5_4_1 ) )
            {
            // InternalSpice.g:3011:1: ( ( rule__IntArray__ValueAssignment_5_4_1 ) )
            // InternalSpice.g:3012:2: ( rule__IntArray__ValueAssignment_5_4_1 )
            {
             before(grammarAccess.getIntArrayAccess().getValueAssignment_5_4_1()); 
            // InternalSpice.g:3013:2: ( rule__IntArray__ValueAssignment_5_4_1 )
            // InternalSpice.g:3013:3: rule__IntArray__ValueAssignment_5_4_1
            {
            pushFollow(FOLLOW_2);
            rule__IntArray__ValueAssignment_5_4_1();

            state._fsp--;


            }

             after(grammarAccess.getIntArrayAccess().getValueAssignment_5_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntArray__Group_5_4__1__Impl"


    // $ANTLR start "rule__DoubleBasic__Group__0"
    // InternalSpice.g:3022:1: rule__DoubleBasic__Group__0 : rule__DoubleBasic__Group__0__Impl rule__DoubleBasic__Group__1 ;
    public final void rule__DoubleBasic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3026:1: ( rule__DoubleBasic__Group__0__Impl rule__DoubleBasic__Group__1 )
            // InternalSpice.g:3027:2: rule__DoubleBasic__Group__0__Impl rule__DoubleBasic__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__DoubleBasic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleBasic__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleBasic__Group__0"


    // $ANTLR start "rule__DoubleBasic__Group__0__Impl"
    // InternalSpice.g:3034:1: rule__DoubleBasic__Group__0__Impl : ( ( rule__DoubleBasic__IsObservableAssignment_0 )? ) ;
    public final void rule__DoubleBasic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3038:1: ( ( ( rule__DoubleBasic__IsObservableAssignment_0 )? ) )
            // InternalSpice.g:3039:1: ( ( rule__DoubleBasic__IsObservableAssignment_0 )? )
            {
            // InternalSpice.g:3039:1: ( ( rule__DoubleBasic__IsObservableAssignment_0 )? )
            // InternalSpice.g:3040:2: ( rule__DoubleBasic__IsObservableAssignment_0 )?
            {
             before(grammarAccess.getDoubleBasicAccess().getIsObservableAssignment_0()); 
            // InternalSpice.g:3041:2: ( rule__DoubleBasic__IsObservableAssignment_0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==52) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSpice.g:3041:3: rule__DoubleBasic__IsObservableAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DoubleBasic__IsObservableAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDoubleBasicAccess().getIsObservableAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleBasic__Group__0__Impl"


    // $ANTLR start "rule__DoubleBasic__Group__1"
    // InternalSpice.g:3049:1: rule__DoubleBasic__Group__1 : rule__DoubleBasic__Group__1__Impl rule__DoubleBasic__Group__2 ;
    public final void rule__DoubleBasic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3053:1: ( rule__DoubleBasic__Group__1__Impl rule__DoubleBasic__Group__2 )
            // InternalSpice.g:3054:2: rule__DoubleBasic__Group__1__Impl rule__DoubleBasic__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__DoubleBasic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleBasic__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleBasic__Group__1"


    // $ANTLR start "rule__DoubleBasic__Group__1__Impl"
    // InternalSpice.g:3061:1: rule__DoubleBasic__Group__1__Impl : ( ( rule__DoubleBasic__TypeAssignment_1 ) ) ;
    public final void rule__DoubleBasic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3065:1: ( ( ( rule__DoubleBasic__TypeAssignment_1 ) ) )
            // InternalSpice.g:3066:1: ( ( rule__DoubleBasic__TypeAssignment_1 ) )
            {
            // InternalSpice.g:3066:1: ( ( rule__DoubleBasic__TypeAssignment_1 ) )
            // InternalSpice.g:3067:2: ( rule__DoubleBasic__TypeAssignment_1 )
            {
             before(grammarAccess.getDoubleBasicAccess().getTypeAssignment_1()); 
            // InternalSpice.g:3068:2: ( rule__DoubleBasic__TypeAssignment_1 )
            // InternalSpice.g:3068:3: rule__DoubleBasic__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DoubleBasic__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDoubleBasicAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleBasic__Group__1__Impl"


    // $ANTLR start "rule__DoubleBasic__Group__2"
    // InternalSpice.g:3076:1: rule__DoubleBasic__Group__2 : rule__DoubleBasic__Group__2__Impl rule__DoubleBasic__Group__3 ;
    public final void rule__DoubleBasic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3080:1: ( rule__DoubleBasic__Group__2__Impl rule__DoubleBasic__Group__3 )
            // InternalSpice.g:3081:2: rule__DoubleBasic__Group__2__Impl rule__DoubleBasic__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__DoubleBasic__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleBasic__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleBasic__Group__2"


    // $ANTLR start "rule__DoubleBasic__Group__2__Impl"
    // InternalSpice.g:3088:1: rule__DoubleBasic__Group__2__Impl : ( ( rule__DoubleBasic__NameAssignment_2 ) ) ;
    public final void rule__DoubleBasic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3092:1: ( ( ( rule__DoubleBasic__NameAssignment_2 ) ) )
            // InternalSpice.g:3093:1: ( ( rule__DoubleBasic__NameAssignment_2 ) )
            {
            // InternalSpice.g:3093:1: ( ( rule__DoubleBasic__NameAssignment_2 ) )
            // InternalSpice.g:3094:2: ( rule__DoubleBasic__NameAssignment_2 )
            {
             before(grammarAccess.getDoubleBasicAccess().getNameAssignment_2()); 
            // InternalSpice.g:3095:2: ( rule__DoubleBasic__NameAssignment_2 )
            // InternalSpice.g:3095:3: rule__DoubleBasic__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DoubleBasic__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDoubleBasicAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleBasic__Group__2__Impl"


    // $ANTLR start "rule__DoubleBasic__Group__3"
    // InternalSpice.g:3103:1: rule__DoubleBasic__Group__3 : rule__DoubleBasic__Group__3__Impl rule__DoubleBasic__Group__4 ;
    public final void rule__DoubleBasic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3107:1: ( rule__DoubleBasic__Group__3__Impl rule__DoubleBasic__Group__4 )
            // InternalSpice.g:3108:2: rule__DoubleBasic__Group__3__Impl rule__DoubleBasic__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__DoubleBasic__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleBasic__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleBasic__Group__3"


    // $ANTLR start "rule__DoubleBasic__Group__3__Impl"
    // InternalSpice.g:3115:1: rule__DoubleBasic__Group__3__Impl : ( '=' ) ;
    public final void rule__DoubleBasic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3119:1: ( ( '=' ) )
            // InternalSpice.g:3120:1: ( '=' )
            {
            // InternalSpice.g:3120:1: ( '=' )
            // InternalSpice.g:3121:2: '='
            {
             before(grammarAccess.getDoubleBasicAccess().getEqualsSignKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getDoubleBasicAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleBasic__Group__3__Impl"


    // $ANTLR start "rule__DoubleBasic__Group__4"
    // InternalSpice.g:3130:1: rule__DoubleBasic__Group__4 : rule__DoubleBasic__Group__4__Impl rule__DoubleBasic__Group__5 ;
    public final void rule__DoubleBasic__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3134:1: ( rule__DoubleBasic__Group__4__Impl rule__DoubleBasic__Group__5 )
            // InternalSpice.g:3135:2: rule__DoubleBasic__Group__4__Impl rule__DoubleBasic__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__DoubleBasic__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleBasic__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleBasic__Group__4"


    // $ANTLR start "rule__DoubleBasic__Group__4__Impl"
    // InternalSpice.g:3142:1: rule__DoubleBasic__Group__4__Impl : ( ( rule__DoubleBasic__ValueAssignment_4 ) ) ;
    public final void rule__DoubleBasic__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3146:1: ( ( ( rule__DoubleBasic__ValueAssignment_4 ) ) )
            // InternalSpice.g:3147:1: ( ( rule__DoubleBasic__ValueAssignment_4 ) )
            {
            // InternalSpice.g:3147:1: ( ( rule__DoubleBasic__ValueAssignment_4 ) )
            // InternalSpice.g:3148:2: ( rule__DoubleBasic__ValueAssignment_4 )
            {
             before(grammarAccess.getDoubleBasicAccess().getValueAssignment_4()); 
            // InternalSpice.g:3149:2: ( rule__DoubleBasic__ValueAssignment_4 )
            // InternalSpice.g:3149:3: rule__DoubleBasic__ValueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__DoubleBasic__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDoubleBasicAccess().getValueAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleBasic__Group__4__Impl"


    // $ANTLR start "rule__DoubleBasic__Group__5"
    // InternalSpice.g:3157:1: rule__DoubleBasic__Group__5 : rule__DoubleBasic__Group__5__Impl ;
    public final void rule__DoubleBasic__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3161:1: ( rule__DoubleBasic__Group__5__Impl )
            // InternalSpice.g:3162:2: rule__DoubleBasic__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoubleBasic__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleBasic__Group__5"


    // $ANTLR start "rule__DoubleBasic__Group__5__Impl"
    // InternalSpice.g:3168:1: rule__DoubleBasic__Group__5__Impl : ( ';' ) ;
    public final void rule__DoubleBasic__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3172:1: ( ( ';' ) )
            // InternalSpice.g:3173:1: ( ';' )
            {
            // InternalSpice.g:3173:1: ( ';' )
            // InternalSpice.g:3174:2: ';'
            {
             before(grammarAccess.getDoubleBasicAccess().getSemicolonKeyword_5()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDoubleBasicAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleBasic__Group__5__Impl"


    // $ANTLR start "rule__DoubleArray__Group__0"
    // InternalSpice.g:3184:1: rule__DoubleArray__Group__0 : rule__DoubleArray__Group__0__Impl rule__DoubleArray__Group__1 ;
    public final void rule__DoubleArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3188:1: ( rule__DoubleArray__Group__0__Impl rule__DoubleArray__Group__1 )
            // InternalSpice.g:3189:2: rule__DoubleArray__Group__0__Impl rule__DoubleArray__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__DoubleArray__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleArray__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleArray__Group__0"


    // $ANTLR start "rule__DoubleArray__Group__0__Impl"
    // InternalSpice.g:3196:1: rule__DoubleArray__Group__0__Impl : ( ( rule__DoubleArray__IsObservableAssignment_0 )? ) ;
    public final void rule__DoubleArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3200:1: ( ( ( rule__DoubleArray__IsObservableAssignment_0 )? ) )
            // InternalSpice.g:3201:1: ( ( rule__DoubleArray__IsObservableAssignment_0 )? )
            {
            // InternalSpice.g:3201:1: ( ( rule__DoubleArray__IsObservableAssignment_0 )? )
            // InternalSpice.g:3202:2: ( rule__DoubleArray__IsObservableAssignment_0 )?
            {
             before(grammarAccess.getDoubleArrayAccess().getIsObservableAssignment_0()); 
            // InternalSpice.g:3203:2: ( rule__DoubleArray__IsObservableAssignment_0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==52) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSpice.g:3203:3: rule__DoubleArray__IsObservableAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DoubleArray__IsObservableAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDoubleArrayAccess().getIsObservableAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleArray__Group__0__Impl"


    // $ANTLR start "rule__DoubleArray__Group__1"
    // InternalSpice.g:3211:1: rule__DoubleArray__Group__1 : rule__DoubleArray__Group__1__Impl rule__DoubleArray__Group__2 ;
    public final void rule__DoubleArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3215:1: ( rule__DoubleArray__Group__1__Impl rule__DoubleArray__Group__2 )
            // InternalSpice.g:3216:2: rule__DoubleArray__Group__1__Impl rule__DoubleArray__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__DoubleArray__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleArray__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleArray__Group__1"


    // $ANTLR start "rule__DoubleArray__Group__1__Impl"
    // InternalSpice.g:3223:1: rule__DoubleArray__Group__1__Impl : ( ( rule__DoubleArray__TypeAssignment_1 ) ) ;
    public final void rule__DoubleArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3227:1: ( ( ( rule__DoubleArray__TypeAssignment_1 ) ) )
            // InternalSpice.g:3228:1: ( ( rule__DoubleArray__TypeAssignment_1 ) )
            {
            // InternalSpice.g:3228:1: ( ( rule__DoubleArray__TypeAssignment_1 ) )
            // InternalSpice.g:3229:2: ( rule__DoubleArray__TypeAssignment_1 )
            {
             before(grammarAccess.getDoubleArrayAccess().getTypeAssignment_1()); 
            // InternalSpice.g:3230:2: ( rule__DoubleArray__TypeAssignment_1 )
            // InternalSpice.g:3230:3: rule__DoubleArray__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DoubleArray__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDoubleArrayAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleArray__Group__1__Impl"


    // $ANTLR start "rule__DoubleArray__Group__2"
    // InternalSpice.g:3238:1: rule__DoubleArray__Group__2 : rule__DoubleArray__Group__2__Impl rule__DoubleArray__Group__3 ;
    public final void rule__DoubleArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3242:1: ( rule__DoubleArray__Group__2__Impl rule__DoubleArray__Group__3 )
            // InternalSpice.g:3243:2: rule__DoubleArray__Group__2__Impl rule__DoubleArray__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__DoubleArray__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleArray__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleArray__Group__2"


    // $ANTLR start "rule__DoubleArray__Group__2__Impl"
    // InternalSpice.g:3250:1: rule__DoubleArray__Group__2__Impl : ( ( rule__DoubleArray__Group_2__0 )? ) ;
    public final void rule__DoubleArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3254:1: ( ( ( rule__DoubleArray__Group_2__0 )? ) )
            // InternalSpice.g:3255:1: ( ( rule__DoubleArray__Group_2__0 )? )
            {
            // InternalSpice.g:3255:1: ( ( rule__DoubleArray__Group_2__0 )? )
            // InternalSpice.g:3256:2: ( rule__DoubleArray__Group_2__0 )?
            {
             before(grammarAccess.getDoubleArrayAccess().getGroup_2()); 
            // InternalSpice.g:3257:2: ( rule__DoubleArray__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==41) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSpice.g:3257:3: rule__DoubleArray__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DoubleArray__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDoubleArrayAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleArray__Group__2__Impl"


    // $ANTLR start "rule__DoubleArray__Group__3"
    // InternalSpice.g:3265:1: rule__DoubleArray__Group__3 : rule__DoubleArray__Group__3__Impl rule__DoubleArray__Group__4 ;
    public final void rule__DoubleArray__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3269:1: ( rule__DoubleArray__Group__3__Impl rule__DoubleArray__Group__4 )
            // InternalSpice.g:3270:2: rule__DoubleArray__Group__3__Impl rule__DoubleArray__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__DoubleArray__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleArray__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleArray__Group__3"


    // $ANTLR start "rule__DoubleArray__Group__3__Impl"
    // InternalSpice.g:3277:1: rule__DoubleArray__Group__3__Impl : ( ( rule__DoubleArray__NameAssignment_3 ) ) ;
    public final void rule__DoubleArray__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3281:1: ( ( ( rule__DoubleArray__NameAssignment_3 ) ) )
            // InternalSpice.g:3282:1: ( ( rule__DoubleArray__NameAssignment_3 ) )
            {
            // InternalSpice.g:3282:1: ( ( rule__DoubleArray__NameAssignment_3 ) )
            // InternalSpice.g:3283:2: ( rule__DoubleArray__NameAssignment_3 )
            {
             before(grammarAccess.getDoubleArrayAccess().getNameAssignment_3()); 
            // InternalSpice.g:3284:2: ( rule__DoubleArray__NameAssignment_3 )
            // InternalSpice.g:3284:3: rule__DoubleArray__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DoubleArray__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDoubleArrayAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleArray__Group__3__Impl"


    // $ANTLR start "rule__DoubleArray__Group__4"
    // InternalSpice.g:3292:1: rule__DoubleArray__Group__4 : rule__DoubleArray__Group__4__Impl rule__DoubleArray__Group__5 ;
    public final void rule__DoubleArray__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3296:1: ( rule__DoubleArray__Group__4__Impl rule__DoubleArray__Group__5 )
            // InternalSpice.g:3297:2: rule__DoubleArray__Group__4__Impl rule__DoubleArray__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__DoubleArray__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleArray__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleArray__Group__4"


    // $ANTLR start "rule__DoubleArray__Group__4__Impl"
    // InternalSpice.g:3304:1: rule__DoubleArray__Group__4__Impl : ( '=' ) ;
    public final void rule__DoubleArray__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3308:1: ( ( '=' ) )
            // InternalSpice.g:3309:1: ( '=' )
            {
            // InternalSpice.g:3309:1: ( '=' )
            // InternalSpice.g:3310:2: '='
            {
             before(grammarAccess.getDoubleArrayAccess().getEqualsSignKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getDoubleArrayAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleArray__Group__4__Impl"


    // $ANTLR start "rule__DoubleArray__Group__5"
    // InternalSpice.g:3319:1: rule__DoubleArray__Group__5 : rule__DoubleArray__Group__5__Impl rule__DoubleArray__Group__6 ;
    public final void rule__DoubleArray__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3323:1: ( rule__DoubleArray__Group__5__Impl rule__DoubleArray__Group__6 )
            // InternalSpice.g:3324:2: rule__DoubleArray__Group__5__Impl rule__DoubleArray__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__DoubleArray__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleArray__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleArray__Group__5"


    // $ANTLR start "rule__DoubleArray__Group__5__Impl"
    // InternalSpice.g:3331:1: rule__DoubleArray__Group__5__Impl : ( ( rule__DoubleArray__Group_5__0 ) ) ;
    public final void rule__DoubleArray__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3335:1: ( ( ( rule__DoubleArray__Group_5__0 ) ) )
            // InternalSpice.g:3336:1: ( ( rule__DoubleArray__Group_5__0 ) )
            {
            // InternalSpice.g:3336:1: ( ( rule__DoubleArray__Group_5__0 ) )
            // InternalSpice.g:3337:2: ( rule__DoubleArray__Group_5__0 )
            {
             before(grammarAccess.getDoubleArrayAccess().getGroup_5()); 
            // InternalSpice.g:3338:2: ( rule__DoubleArray__Group_5__0 )
            // InternalSpice.g:3338:3: rule__DoubleArray__Group_5__0
            {
            pushFollow(FOLLOW_2);
            rule__DoubleArray__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getDoubleArrayAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleArray__Group__5__Impl"


    // $ANTLR start "rule__DoubleArray__Group__6"
    // InternalSpice.g:3346:1: rule__DoubleArray__Group__6 : rule__DoubleArray__Group__6__Impl ;
    public final void rule__DoubleArray__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3350:1: ( rule__DoubleArray__Group__6__Impl )
            // InternalSpice.g:3351:2: rule__DoubleArray__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoubleArray__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleArray__Group__6"


    // $ANTLR start "rule__DoubleArray__Group__6__Impl"
    // InternalSpice.g:3357:1: rule__DoubleArray__Group__6__Impl : ( ';' ) ;
    public final void rule__DoubleArray__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3361:1: ( ( ';' ) )
            // InternalSpice.g:3362:1: ( ';' )
            {
            // InternalSpice.g:3362:1: ( ';' )
            // InternalSpice.g:3363:2: ';'
            {
             before(grammarAccess.getDoubleArrayAccess().getSemicolonKeyword_6()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getDoubleArrayAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleArray__Group__6__Impl"


    // $ANTLR start "rule__DoubleArray__Group_2__0"
    // InternalSpice.g:3373:1: rule__DoubleArray__Group_2__0 : rule__DoubleArray__Group_2__0__Impl rule__DoubleArray__Group_2__1 ;
    public final void rule__DoubleArray__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3377:1: ( rule__DoubleArray__Group_2__0__Impl rule__DoubleArray__Group_2__1 )
            // InternalSpice.g:3378:2: rule__DoubleArray__Group_2__0__Impl rule__DoubleArray__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__DoubleArray__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleArray__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleArray__Group_2__0"


    // $ANTLR start "rule__DoubleArray__Group_2__0__Impl"
    // InternalSpice.g:3385:1: rule__DoubleArray__Group_2__0__Impl : ( '[' ) ;
    public final void rule__DoubleArray__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3389:1: ( ( '[' ) )
            // InternalSpice.g:3390:1: ( '[' )
            {
            // InternalSpice.g:3390:1: ( '[' )
            // InternalSpice.g:3391:2: '['
            {
             before(grammarAccess.getDoubleArrayAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getDoubleArrayAccess().getLeftSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleArray__Group_2__0__Impl"


    // $ANTLR start "rule__DoubleArray__Group_2__1"
    // InternalSpice.g:3400:1: rule__DoubleArray__Group_2__1 : rule__DoubleArray__Group_2__1__Impl rule__DoubleArray__Group_2__2 ;
    public final void rule__DoubleArray__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3404:1: ( rule__DoubleArray__Group_2__1__Impl rule__DoubleArray__Group_2__2 )
            // InternalSpice.g:3405:2: rule__DoubleArray__Group_2__1__Impl rule__DoubleArray__Group_2__2
            {
            pushFollow(FOLLOW_27);
            rule__DoubleArray__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleArray__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleArray__Group_2__1"


    // $ANTLR start "rule__DoubleArray__Group_2__1__Impl"
    // InternalSpice.g:3412:1: rule__DoubleArray__Group_2__1__Impl : ( ( rule__DoubleArray__MultiplicityAssignment_2_1 ) ) ;
    public final void rule__DoubleArray__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3416:1: ( ( ( rule__DoubleArray__MultiplicityAssignment_2_1 ) ) )
            // InternalSpice.g:3417:1: ( ( rule__DoubleArray__MultiplicityAssignment_2_1 ) )
            {
            // InternalSpice.g:3417:1: ( ( rule__DoubleArray__MultiplicityAssignment_2_1 ) )
            // InternalSpice.g:3418:2: ( rule__DoubleArray__MultiplicityAssignment_2_1 )
            {
             before(grammarAccess.getDoubleArrayAccess().getMultiplicityAssignment_2_1()); 
            // InternalSpice.g:3419:2: ( rule__DoubleArray__MultiplicityAssignment_2_1 )
            // InternalSpice.g:3419:3: rule__DoubleArray__MultiplicityAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DoubleArray__MultiplicityAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDoubleArrayAccess().getMultiplicityAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleArray__Group_2__1__Impl"


    // $ANTLR start "rule__DoubleArray__Group_2__2"
    // InternalSpice.g:3427:1: rule__DoubleArray__Group_2__2 : rule__DoubleArray__Group_2__2__Impl ;
    public final void rule__DoubleArray__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3431:1: ( rule__DoubleArray__Group_2__2__Impl )
            // InternalSpice.g:3432:2: rule__DoubleArray__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoubleArray__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleArray__Group_2__2"


    // $ANTLR start "rule__DoubleArray__Group_2__2__Impl"
    // InternalSpice.g:3438:1: rule__DoubleArray__Group_2__2__Impl : ( ']' ) ;
    public final void rule__DoubleArray__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3442:1: ( ( ']' ) )
            // InternalSpice.g:3443:1: ( ']' )
            {
            // InternalSpice.g:3443:1: ( ']' )
            // InternalSpice.g:3444:2: ']'
            {
             before(grammarAccess.getDoubleArrayAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getDoubleArrayAccess().getRightSquareBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleArray__Group_2__2__Impl"


    // $ANTLR start "rule__DoubleArray__Group_5__0"
    // InternalSpice.g:3454:1: rule__DoubleArray__Group_5__0 : rule__DoubleArray__Group_5__0__Impl rule__DoubleArray__Group_5__1 ;
    public final void rule__DoubleArray__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3458:1: ( rule__DoubleArray__Group_5__0__Impl rule__DoubleArray__Group_5__1 )
            // InternalSpice.g:3459:2: rule__DoubleArray__Group_5__0__Impl rule__DoubleArray__Group_5__1
            {
            pushFollow(FOLLOW_29);
            rule__DoubleArray__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleArray__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleArray__Group_5__0"


    // $ANTLR start "rule__DoubleArray__Group_5__0__Impl"
    // InternalSpice.g:3466:1: rule__DoubleArray__Group_5__0__Impl : ( '(' ) ;
    public final void rule__DoubleArray__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3470:1: ( ( '(' ) )
            // InternalSpice.g:3471:1: ( '(' )
            {
            // InternalSpice.g:3471:1: ( '(' )
            // InternalSpice.g:3472:2: '('
            {
             before(grammarAccess.getDoubleArrayAccess().getLeftParenthesisKeyword_5_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getDoubleArrayAccess().getLeftParenthesisKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleArray__Group_5__0__Impl"


    // $ANTLR start "rule__DoubleArray__Group_5__1"
    // InternalSpice.g:3481:1: rule__DoubleArray__Group_5__1 : rule__DoubleArray__Group_5__1__Impl rule__DoubleArray__Group_5__2 ;
    public final void rule__DoubleArray__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3485:1: ( rule__DoubleArray__Group_5__1__Impl rule__DoubleArray__Group_5__2 )
            // InternalSpice.g:3486:2: rule__DoubleArray__Group_5__1__Impl rule__DoubleArray__Group_5__2
            {
            pushFollow(FOLLOW_7);
            rule__DoubleArray__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleArray__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleArray__Group_5__1"


    // $ANTLR start "rule__DoubleArray__Group_5__1__Impl"
    // InternalSpice.g:3493:1: rule__DoubleArray__Group_5__1__Impl : ( ( rule__DoubleArray__ValueAssignment_5_1 ) ) ;
    public final void rule__DoubleArray__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3497:1: ( ( ( rule__DoubleArray__ValueAssignment_5_1 ) ) )
            // InternalSpice.g:3498:1: ( ( rule__DoubleArray__ValueAssignment_5_1 ) )
            {
            // InternalSpice.g:3498:1: ( ( rule__DoubleArray__ValueAssignment_5_1 ) )
            // InternalSpice.g:3499:2: ( rule__DoubleArray__ValueAssignment_5_1 )
            {
             before(grammarAccess.getDoubleArrayAccess().getValueAssignment_5_1()); 
            // InternalSpice.g:3500:2: ( rule__DoubleArray__ValueAssignment_5_1 )
            // InternalSpice.g:3500:3: rule__DoubleArray__ValueAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__DoubleArray__ValueAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getDoubleArrayAccess().getValueAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleArray__Group_5__1__Impl"


    // $ANTLR start "rule__DoubleArray__Group_5__2"
    // InternalSpice.g:3508:1: rule__DoubleArray__Group_5__2 : rule__DoubleArray__Group_5__2__Impl rule__DoubleArray__Group_5__3 ;
    public final void rule__DoubleArray__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3512:1: ( rule__DoubleArray__Group_5__2__Impl rule__DoubleArray__Group_5__3 )
            // InternalSpice.g:3513:2: rule__DoubleArray__Group_5__2__Impl rule__DoubleArray__Group_5__3
            {
            pushFollow(FOLLOW_29);
            rule__DoubleArray__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleArray__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleArray__Group_5__2"


    // $ANTLR start "rule__DoubleArray__Group_5__2__Impl"
    // InternalSpice.g:3520:1: rule__DoubleArray__Group_5__2__Impl : ( ',' ) ;
    public final void rule__DoubleArray__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3524:1: ( ( ',' ) )
            // InternalSpice.g:3525:1: ( ',' )
            {
            // InternalSpice.g:3525:1: ( ',' )
            // InternalSpice.g:3526:2: ','
            {
             before(grammarAccess.getDoubleArrayAccess().getCommaKeyword_5_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDoubleArrayAccess().getCommaKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleArray__Group_5__2__Impl"


    // $ANTLR start "rule__DoubleArray__Group_5__3"
    // InternalSpice.g:3535:1: rule__DoubleArray__Group_5__3 : rule__DoubleArray__Group_5__3__Impl rule__DoubleArray__Group_5__4 ;
    public final void rule__DoubleArray__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3539:1: ( rule__DoubleArray__Group_5__3__Impl rule__DoubleArray__Group_5__4 )
            // InternalSpice.g:3540:2: rule__DoubleArray__Group_5__3__Impl rule__DoubleArray__Group_5__4
            {
            pushFollow(FOLLOW_28);
            rule__DoubleArray__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleArray__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleArray__Group_5__3"


    // $ANTLR start "rule__DoubleArray__Group_5__3__Impl"
    // InternalSpice.g:3547:1: rule__DoubleArray__Group_5__3__Impl : ( ( rule__DoubleArray__ValueAssignment_5_3 ) ) ;
    public final void rule__DoubleArray__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3551:1: ( ( ( rule__DoubleArray__ValueAssignment_5_3 ) ) )
            // InternalSpice.g:3552:1: ( ( rule__DoubleArray__ValueAssignment_5_3 ) )
            {
            // InternalSpice.g:3552:1: ( ( rule__DoubleArray__ValueAssignment_5_3 ) )
            // InternalSpice.g:3553:2: ( rule__DoubleArray__ValueAssignment_5_3 )
            {
             before(grammarAccess.getDoubleArrayAccess().getValueAssignment_5_3()); 
            // InternalSpice.g:3554:2: ( rule__DoubleArray__ValueAssignment_5_3 )
            // InternalSpice.g:3554:3: rule__DoubleArray__ValueAssignment_5_3
            {
            pushFollow(FOLLOW_2);
            rule__DoubleArray__ValueAssignment_5_3();

            state._fsp--;


            }

             after(grammarAccess.getDoubleArrayAccess().getValueAssignment_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleArray__Group_5__3__Impl"


    // $ANTLR start "rule__DoubleArray__Group_5__4"
    // InternalSpice.g:3562:1: rule__DoubleArray__Group_5__4 : rule__DoubleArray__Group_5__4__Impl rule__DoubleArray__Group_5__5 ;
    public final void rule__DoubleArray__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3566:1: ( rule__DoubleArray__Group_5__4__Impl rule__DoubleArray__Group_5__5 )
            // InternalSpice.g:3567:2: rule__DoubleArray__Group_5__4__Impl rule__DoubleArray__Group_5__5
            {
            pushFollow(FOLLOW_28);
            rule__DoubleArray__Group_5__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleArray__Group_5__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleArray__Group_5__4"


    // $ANTLR start "rule__DoubleArray__Group_5__4__Impl"
    // InternalSpice.g:3574:1: rule__DoubleArray__Group_5__4__Impl : ( ( rule__DoubleArray__Group_5_4__0 )* ) ;
    public final void rule__DoubleArray__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3578:1: ( ( ( rule__DoubleArray__Group_5_4__0 )* ) )
            // InternalSpice.g:3579:1: ( ( rule__DoubleArray__Group_5_4__0 )* )
            {
            // InternalSpice.g:3579:1: ( ( rule__DoubleArray__Group_5_4__0 )* )
            // InternalSpice.g:3580:2: ( rule__DoubleArray__Group_5_4__0 )*
            {
             before(grammarAccess.getDoubleArrayAccess().getGroup_5_4()); 
            // InternalSpice.g:3581:2: ( rule__DoubleArray__Group_5_4__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==29) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalSpice.g:3581:3: rule__DoubleArray__Group_5_4__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__DoubleArray__Group_5_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getDoubleArrayAccess().getGroup_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleArray__Group_5__4__Impl"


    // $ANTLR start "rule__DoubleArray__Group_5__5"
    // InternalSpice.g:3589:1: rule__DoubleArray__Group_5__5 : rule__DoubleArray__Group_5__5__Impl ;
    public final void rule__DoubleArray__Group_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3593:1: ( rule__DoubleArray__Group_5__5__Impl )
            // InternalSpice.g:3594:2: rule__DoubleArray__Group_5__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoubleArray__Group_5__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleArray__Group_5__5"


    // $ANTLR start "rule__DoubleArray__Group_5__5__Impl"
    // InternalSpice.g:3600:1: rule__DoubleArray__Group_5__5__Impl : ( ')' ) ;
    public final void rule__DoubleArray__Group_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3604:1: ( ( ')' ) )
            // InternalSpice.g:3605:1: ( ')' )
            {
            // InternalSpice.g:3605:1: ( ')' )
            // InternalSpice.g:3606:2: ')'
            {
             before(grammarAccess.getDoubleArrayAccess().getRightParenthesisKeyword_5_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDoubleArrayAccess().getRightParenthesisKeyword_5_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleArray__Group_5__5__Impl"


    // $ANTLR start "rule__DoubleArray__Group_5_4__0"
    // InternalSpice.g:3616:1: rule__DoubleArray__Group_5_4__0 : rule__DoubleArray__Group_5_4__0__Impl rule__DoubleArray__Group_5_4__1 ;
    public final void rule__DoubleArray__Group_5_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3620:1: ( rule__DoubleArray__Group_5_4__0__Impl rule__DoubleArray__Group_5_4__1 )
            // InternalSpice.g:3621:2: rule__DoubleArray__Group_5_4__0__Impl rule__DoubleArray__Group_5_4__1
            {
            pushFollow(FOLLOW_29);
            rule__DoubleArray__Group_5_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DoubleArray__Group_5_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleArray__Group_5_4__0"


    // $ANTLR start "rule__DoubleArray__Group_5_4__0__Impl"
    // InternalSpice.g:3628:1: rule__DoubleArray__Group_5_4__0__Impl : ( ',' ) ;
    public final void rule__DoubleArray__Group_5_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3632:1: ( ( ',' ) )
            // InternalSpice.g:3633:1: ( ',' )
            {
            // InternalSpice.g:3633:1: ( ',' )
            // InternalSpice.g:3634:2: ','
            {
             before(grammarAccess.getDoubleArrayAccess().getCommaKeyword_5_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDoubleArrayAccess().getCommaKeyword_5_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleArray__Group_5_4__0__Impl"


    // $ANTLR start "rule__DoubleArray__Group_5_4__1"
    // InternalSpice.g:3643:1: rule__DoubleArray__Group_5_4__1 : rule__DoubleArray__Group_5_4__1__Impl ;
    public final void rule__DoubleArray__Group_5_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3647:1: ( rule__DoubleArray__Group_5_4__1__Impl )
            // InternalSpice.g:3648:2: rule__DoubleArray__Group_5_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DoubleArray__Group_5_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleArray__Group_5_4__1"


    // $ANTLR start "rule__DoubleArray__Group_5_4__1__Impl"
    // InternalSpice.g:3654:1: rule__DoubleArray__Group_5_4__1__Impl : ( ( rule__DoubleArray__ValueAssignment_5_4_1 ) ) ;
    public final void rule__DoubleArray__Group_5_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3658:1: ( ( ( rule__DoubleArray__ValueAssignment_5_4_1 ) ) )
            // InternalSpice.g:3659:1: ( ( rule__DoubleArray__ValueAssignment_5_4_1 ) )
            {
            // InternalSpice.g:3659:1: ( ( rule__DoubleArray__ValueAssignment_5_4_1 ) )
            // InternalSpice.g:3660:2: ( rule__DoubleArray__ValueAssignment_5_4_1 )
            {
             before(grammarAccess.getDoubleArrayAccess().getValueAssignment_5_4_1()); 
            // InternalSpice.g:3661:2: ( rule__DoubleArray__ValueAssignment_5_4_1 )
            // InternalSpice.g:3661:3: rule__DoubleArray__ValueAssignment_5_4_1
            {
            pushFollow(FOLLOW_2);
            rule__DoubleArray__ValueAssignment_5_4_1();

            state._fsp--;


            }

             after(grammarAccess.getDoubleArrayAccess().getValueAssignment_5_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleArray__Group_5_4__1__Impl"


    // $ANTLR start "rule__StringBasic__Group__0"
    // InternalSpice.g:3670:1: rule__StringBasic__Group__0 : rule__StringBasic__Group__0__Impl rule__StringBasic__Group__1 ;
    public final void rule__StringBasic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3674:1: ( rule__StringBasic__Group__0__Impl rule__StringBasic__Group__1 )
            // InternalSpice.g:3675:2: rule__StringBasic__Group__0__Impl rule__StringBasic__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__StringBasic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringBasic__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringBasic__Group__0"


    // $ANTLR start "rule__StringBasic__Group__0__Impl"
    // InternalSpice.g:3682:1: rule__StringBasic__Group__0__Impl : ( ( rule__StringBasic__IsObservableAssignment_0 )? ) ;
    public final void rule__StringBasic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3686:1: ( ( ( rule__StringBasic__IsObservableAssignment_0 )? ) )
            // InternalSpice.g:3687:1: ( ( rule__StringBasic__IsObservableAssignment_0 )? )
            {
            // InternalSpice.g:3687:1: ( ( rule__StringBasic__IsObservableAssignment_0 )? )
            // InternalSpice.g:3688:2: ( rule__StringBasic__IsObservableAssignment_0 )?
            {
             before(grammarAccess.getStringBasicAccess().getIsObservableAssignment_0()); 
            // InternalSpice.g:3689:2: ( rule__StringBasic__IsObservableAssignment_0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==52) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSpice.g:3689:3: rule__StringBasic__IsObservableAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringBasic__IsObservableAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringBasicAccess().getIsObservableAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringBasic__Group__0__Impl"


    // $ANTLR start "rule__StringBasic__Group__1"
    // InternalSpice.g:3697:1: rule__StringBasic__Group__1 : rule__StringBasic__Group__1__Impl rule__StringBasic__Group__2 ;
    public final void rule__StringBasic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3701:1: ( rule__StringBasic__Group__1__Impl rule__StringBasic__Group__2 )
            // InternalSpice.g:3702:2: rule__StringBasic__Group__1__Impl rule__StringBasic__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__StringBasic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringBasic__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringBasic__Group__1"


    // $ANTLR start "rule__StringBasic__Group__1__Impl"
    // InternalSpice.g:3709:1: rule__StringBasic__Group__1__Impl : ( ( rule__StringBasic__TypeAssignment_1 ) ) ;
    public final void rule__StringBasic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3713:1: ( ( ( rule__StringBasic__TypeAssignment_1 ) ) )
            // InternalSpice.g:3714:1: ( ( rule__StringBasic__TypeAssignment_1 ) )
            {
            // InternalSpice.g:3714:1: ( ( rule__StringBasic__TypeAssignment_1 ) )
            // InternalSpice.g:3715:2: ( rule__StringBasic__TypeAssignment_1 )
            {
             before(grammarAccess.getStringBasicAccess().getTypeAssignment_1()); 
            // InternalSpice.g:3716:2: ( rule__StringBasic__TypeAssignment_1 )
            // InternalSpice.g:3716:3: rule__StringBasic__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StringBasic__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStringBasicAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringBasic__Group__1__Impl"


    // $ANTLR start "rule__StringBasic__Group__2"
    // InternalSpice.g:3724:1: rule__StringBasic__Group__2 : rule__StringBasic__Group__2__Impl rule__StringBasic__Group__3 ;
    public final void rule__StringBasic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3728:1: ( rule__StringBasic__Group__2__Impl rule__StringBasic__Group__3 )
            // InternalSpice.g:3729:2: rule__StringBasic__Group__2__Impl rule__StringBasic__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__StringBasic__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringBasic__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringBasic__Group__2"


    // $ANTLR start "rule__StringBasic__Group__2__Impl"
    // InternalSpice.g:3736:1: rule__StringBasic__Group__2__Impl : ( ( rule__StringBasic__NameAssignment_2 ) ) ;
    public final void rule__StringBasic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3740:1: ( ( ( rule__StringBasic__NameAssignment_2 ) ) )
            // InternalSpice.g:3741:1: ( ( rule__StringBasic__NameAssignment_2 ) )
            {
            // InternalSpice.g:3741:1: ( ( rule__StringBasic__NameAssignment_2 ) )
            // InternalSpice.g:3742:2: ( rule__StringBasic__NameAssignment_2 )
            {
             before(grammarAccess.getStringBasicAccess().getNameAssignment_2()); 
            // InternalSpice.g:3743:2: ( rule__StringBasic__NameAssignment_2 )
            // InternalSpice.g:3743:3: rule__StringBasic__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StringBasic__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStringBasicAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringBasic__Group__2__Impl"


    // $ANTLR start "rule__StringBasic__Group__3"
    // InternalSpice.g:3751:1: rule__StringBasic__Group__3 : rule__StringBasic__Group__3__Impl rule__StringBasic__Group__4 ;
    public final void rule__StringBasic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3755:1: ( rule__StringBasic__Group__3__Impl rule__StringBasic__Group__4 )
            // InternalSpice.g:3756:2: rule__StringBasic__Group__3__Impl rule__StringBasic__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__StringBasic__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringBasic__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringBasic__Group__3"


    // $ANTLR start "rule__StringBasic__Group__3__Impl"
    // InternalSpice.g:3763:1: rule__StringBasic__Group__3__Impl : ( '=' ) ;
    public final void rule__StringBasic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3767:1: ( ( '=' ) )
            // InternalSpice.g:3768:1: ( '=' )
            {
            // InternalSpice.g:3768:1: ( '=' )
            // InternalSpice.g:3769:2: '='
            {
             before(grammarAccess.getStringBasicAccess().getEqualsSignKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getStringBasicAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringBasic__Group__3__Impl"


    // $ANTLR start "rule__StringBasic__Group__4"
    // InternalSpice.g:3778:1: rule__StringBasic__Group__4 : rule__StringBasic__Group__4__Impl rule__StringBasic__Group__5 ;
    public final void rule__StringBasic__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3782:1: ( rule__StringBasic__Group__4__Impl rule__StringBasic__Group__5 )
            // InternalSpice.g:3783:2: rule__StringBasic__Group__4__Impl rule__StringBasic__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__StringBasic__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringBasic__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringBasic__Group__4"


    // $ANTLR start "rule__StringBasic__Group__4__Impl"
    // InternalSpice.g:3790:1: rule__StringBasic__Group__4__Impl : ( ( rule__StringBasic__ValueAssignment_4 ) ) ;
    public final void rule__StringBasic__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3794:1: ( ( ( rule__StringBasic__ValueAssignment_4 ) ) )
            // InternalSpice.g:3795:1: ( ( rule__StringBasic__ValueAssignment_4 ) )
            {
            // InternalSpice.g:3795:1: ( ( rule__StringBasic__ValueAssignment_4 ) )
            // InternalSpice.g:3796:2: ( rule__StringBasic__ValueAssignment_4 )
            {
             before(grammarAccess.getStringBasicAccess().getValueAssignment_4()); 
            // InternalSpice.g:3797:2: ( rule__StringBasic__ValueAssignment_4 )
            // InternalSpice.g:3797:3: rule__StringBasic__ValueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__StringBasic__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStringBasicAccess().getValueAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringBasic__Group__4__Impl"


    // $ANTLR start "rule__StringBasic__Group__5"
    // InternalSpice.g:3805:1: rule__StringBasic__Group__5 : rule__StringBasic__Group__5__Impl ;
    public final void rule__StringBasic__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3809:1: ( rule__StringBasic__Group__5__Impl )
            // InternalSpice.g:3810:2: rule__StringBasic__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringBasic__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringBasic__Group__5"


    // $ANTLR start "rule__StringBasic__Group__5__Impl"
    // InternalSpice.g:3816:1: rule__StringBasic__Group__5__Impl : ( ';' ) ;
    public final void rule__StringBasic__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3820:1: ( ( ';' ) )
            // InternalSpice.g:3821:1: ( ';' )
            {
            // InternalSpice.g:3821:1: ( ';' )
            // InternalSpice.g:3822:2: ';'
            {
             before(grammarAccess.getStringBasicAccess().getSemicolonKeyword_5()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getStringBasicAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringBasic__Group__5__Impl"


    // $ANTLR start "rule__StringArray__Group__0"
    // InternalSpice.g:3832:1: rule__StringArray__Group__0 : rule__StringArray__Group__0__Impl rule__StringArray__Group__1 ;
    public final void rule__StringArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3836:1: ( rule__StringArray__Group__0__Impl rule__StringArray__Group__1 )
            // InternalSpice.g:3837:2: rule__StringArray__Group__0__Impl rule__StringArray__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__StringArray__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringArray__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group__0"


    // $ANTLR start "rule__StringArray__Group__0__Impl"
    // InternalSpice.g:3844:1: rule__StringArray__Group__0__Impl : ( ( rule__StringArray__IsObservableAssignment_0 )? ) ;
    public final void rule__StringArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3848:1: ( ( ( rule__StringArray__IsObservableAssignment_0 )? ) )
            // InternalSpice.g:3849:1: ( ( rule__StringArray__IsObservableAssignment_0 )? )
            {
            // InternalSpice.g:3849:1: ( ( rule__StringArray__IsObservableAssignment_0 )? )
            // InternalSpice.g:3850:2: ( rule__StringArray__IsObservableAssignment_0 )?
            {
             before(grammarAccess.getStringArrayAccess().getIsObservableAssignment_0()); 
            // InternalSpice.g:3851:2: ( rule__StringArray__IsObservableAssignment_0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==52) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSpice.g:3851:3: rule__StringArray__IsObservableAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringArray__IsObservableAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringArrayAccess().getIsObservableAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group__0__Impl"


    // $ANTLR start "rule__StringArray__Group__1"
    // InternalSpice.g:3859:1: rule__StringArray__Group__1 : rule__StringArray__Group__1__Impl rule__StringArray__Group__2 ;
    public final void rule__StringArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3863:1: ( rule__StringArray__Group__1__Impl rule__StringArray__Group__2 )
            // InternalSpice.g:3864:2: rule__StringArray__Group__1__Impl rule__StringArray__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__StringArray__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringArray__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group__1"


    // $ANTLR start "rule__StringArray__Group__1__Impl"
    // InternalSpice.g:3871:1: rule__StringArray__Group__1__Impl : ( ( rule__StringArray__TypeAssignment_1 ) ) ;
    public final void rule__StringArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3875:1: ( ( ( rule__StringArray__TypeAssignment_1 ) ) )
            // InternalSpice.g:3876:1: ( ( rule__StringArray__TypeAssignment_1 ) )
            {
            // InternalSpice.g:3876:1: ( ( rule__StringArray__TypeAssignment_1 ) )
            // InternalSpice.g:3877:2: ( rule__StringArray__TypeAssignment_1 )
            {
             before(grammarAccess.getStringArrayAccess().getTypeAssignment_1()); 
            // InternalSpice.g:3878:2: ( rule__StringArray__TypeAssignment_1 )
            // InternalSpice.g:3878:3: rule__StringArray__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StringArray__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStringArrayAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group__1__Impl"


    // $ANTLR start "rule__StringArray__Group__2"
    // InternalSpice.g:3886:1: rule__StringArray__Group__2 : rule__StringArray__Group__2__Impl rule__StringArray__Group__3 ;
    public final void rule__StringArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3890:1: ( rule__StringArray__Group__2__Impl rule__StringArray__Group__3 )
            // InternalSpice.g:3891:2: rule__StringArray__Group__2__Impl rule__StringArray__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__StringArray__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringArray__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group__2"


    // $ANTLR start "rule__StringArray__Group__2__Impl"
    // InternalSpice.g:3898:1: rule__StringArray__Group__2__Impl : ( ( rule__StringArray__Group_2__0 )? ) ;
    public final void rule__StringArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3902:1: ( ( ( rule__StringArray__Group_2__0 )? ) )
            // InternalSpice.g:3903:1: ( ( rule__StringArray__Group_2__0 )? )
            {
            // InternalSpice.g:3903:1: ( ( rule__StringArray__Group_2__0 )? )
            // InternalSpice.g:3904:2: ( rule__StringArray__Group_2__0 )?
            {
             before(grammarAccess.getStringArrayAccess().getGroup_2()); 
            // InternalSpice.g:3905:2: ( rule__StringArray__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==41) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSpice.g:3905:3: rule__StringArray__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StringArray__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStringArrayAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group__2__Impl"


    // $ANTLR start "rule__StringArray__Group__3"
    // InternalSpice.g:3913:1: rule__StringArray__Group__3 : rule__StringArray__Group__3__Impl rule__StringArray__Group__4 ;
    public final void rule__StringArray__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3917:1: ( rule__StringArray__Group__3__Impl rule__StringArray__Group__4 )
            // InternalSpice.g:3918:2: rule__StringArray__Group__3__Impl rule__StringArray__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__StringArray__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringArray__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group__3"


    // $ANTLR start "rule__StringArray__Group__3__Impl"
    // InternalSpice.g:3925:1: rule__StringArray__Group__3__Impl : ( ( rule__StringArray__NameAssignment_3 ) ) ;
    public final void rule__StringArray__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3929:1: ( ( ( rule__StringArray__NameAssignment_3 ) ) )
            // InternalSpice.g:3930:1: ( ( rule__StringArray__NameAssignment_3 ) )
            {
            // InternalSpice.g:3930:1: ( ( rule__StringArray__NameAssignment_3 ) )
            // InternalSpice.g:3931:2: ( rule__StringArray__NameAssignment_3 )
            {
             before(grammarAccess.getStringArrayAccess().getNameAssignment_3()); 
            // InternalSpice.g:3932:2: ( rule__StringArray__NameAssignment_3 )
            // InternalSpice.g:3932:3: rule__StringArray__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__StringArray__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStringArrayAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group__3__Impl"


    // $ANTLR start "rule__StringArray__Group__4"
    // InternalSpice.g:3940:1: rule__StringArray__Group__4 : rule__StringArray__Group__4__Impl rule__StringArray__Group__5 ;
    public final void rule__StringArray__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3944:1: ( rule__StringArray__Group__4__Impl rule__StringArray__Group__5 )
            // InternalSpice.g:3945:2: rule__StringArray__Group__4__Impl rule__StringArray__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__StringArray__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringArray__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group__4"


    // $ANTLR start "rule__StringArray__Group__4__Impl"
    // InternalSpice.g:3952:1: rule__StringArray__Group__4__Impl : ( '=' ) ;
    public final void rule__StringArray__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3956:1: ( ( '=' ) )
            // InternalSpice.g:3957:1: ( '=' )
            {
            // InternalSpice.g:3957:1: ( '=' )
            // InternalSpice.g:3958:2: '='
            {
             before(grammarAccess.getStringArrayAccess().getEqualsSignKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getStringArrayAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group__4__Impl"


    // $ANTLR start "rule__StringArray__Group__5"
    // InternalSpice.g:3967:1: rule__StringArray__Group__5 : rule__StringArray__Group__5__Impl rule__StringArray__Group__6 ;
    public final void rule__StringArray__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3971:1: ( rule__StringArray__Group__5__Impl rule__StringArray__Group__6 )
            // InternalSpice.g:3972:2: rule__StringArray__Group__5__Impl rule__StringArray__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__StringArray__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringArray__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group__5"


    // $ANTLR start "rule__StringArray__Group__5__Impl"
    // InternalSpice.g:3979:1: rule__StringArray__Group__5__Impl : ( ( rule__StringArray__Group_5__0 ) ) ;
    public final void rule__StringArray__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3983:1: ( ( ( rule__StringArray__Group_5__0 ) ) )
            // InternalSpice.g:3984:1: ( ( rule__StringArray__Group_5__0 ) )
            {
            // InternalSpice.g:3984:1: ( ( rule__StringArray__Group_5__0 ) )
            // InternalSpice.g:3985:2: ( rule__StringArray__Group_5__0 )
            {
             before(grammarAccess.getStringArrayAccess().getGroup_5()); 
            // InternalSpice.g:3986:2: ( rule__StringArray__Group_5__0 )
            // InternalSpice.g:3986:3: rule__StringArray__Group_5__0
            {
            pushFollow(FOLLOW_2);
            rule__StringArray__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getStringArrayAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group__5__Impl"


    // $ANTLR start "rule__StringArray__Group__6"
    // InternalSpice.g:3994:1: rule__StringArray__Group__6 : rule__StringArray__Group__6__Impl ;
    public final void rule__StringArray__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:3998:1: ( rule__StringArray__Group__6__Impl )
            // InternalSpice.g:3999:2: rule__StringArray__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringArray__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group__6"


    // $ANTLR start "rule__StringArray__Group__6__Impl"
    // InternalSpice.g:4005:1: rule__StringArray__Group__6__Impl : ( ';' ) ;
    public final void rule__StringArray__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4009:1: ( ( ';' ) )
            // InternalSpice.g:4010:1: ( ';' )
            {
            // InternalSpice.g:4010:1: ( ';' )
            // InternalSpice.g:4011:2: ';'
            {
             before(grammarAccess.getStringArrayAccess().getSemicolonKeyword_6()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getStringArrayAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group__6__Impl"


    // $ANTLR start "rule__StringArray__Group_2__0"
    // InternalSpice.g:4021:1: rule__StringArray__Group_2__0 : rule__StringArray__Group_2__0__Impl rule__StringArray__Group_2__1 ;
    public final void rule__StringArray__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4025:1: ( rule__StringArray__Group_2__0__Impl rule__StringArray__Group_2__1 )
            // InternalSpice.g:4026:2: rule__StringArray__Group_2__0__Impl rule__StringArray__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__StringArray__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringArray__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group_2__0"


    // $ANTLR start "rule__StringArray__Group_2__0__Impl"
    // InternalSpice.g:4033:1: rule__StringArray__Group_2__0__Impl : ( '[' ) ;
    public final void rule__StringArray__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4037:1: ( ( '[' ) )
            // InternalSpice.g:4038:1: ( '[' )
            {
            // InternalSpice.g:4038:1: ( '[' )
            // InternalSpice.g:4039:2: '['
            {
             before(grammarAccess.getStringArrayAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getStringArrayAccess().getLeftSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group_2__0__Impl"


    // $ANTLR start "rule__StringArray__Group_2__1"
    // InternalSpice.g:4048:1: rule__StringArray__Group_2__1 : rule__StringArray__Group_2__1__Impl rule__StringArray__Group_2__2 ;
    public final void rule__StringArray__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4052:1: ( rule__StringArray__Group_2__1__Impl rule__StringArray__Group_2__2 )
            // InternalSpice.g:4053:2: rule__StringArray__Group_2__1__Impl rule__StringArray__Group_2__2
            {
            pushFollow(FOLLOW_27);
            rule__StringArray__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringArray__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group_2__1"


    // $ANTLR start "rule__StringArray__Group_2__1__Impl"
    // InternalSpice.g:4060:1: rule__StringArray__Group_2__1__Impl : ( ( rule__StringArray__MultiplicityAssignment_2_1 ) ) ;
    public final void rule__StringArray__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4064:1: ( ( ( rule__StringArray__MultiplicityAssignment_2_1 ) ) )
            // InternalSpice.g:4065:1: ( ( rule__StringArray__MultiplicityAssignment_2_1 ) )
            {
            // InternalSpice.g:4065:1: ( ( rule__StringArray__MultiplicityAssignment_2_1 ) )
            // InternalSpice.g:4066:2: ( rule__StringArray__MultiplicityAssignment_2_1 )
            {
             before(grammarAccess.getStringArrayAccess().getMultiplicityAssignment_2_1()); 
            // InternalSpice.g:4067:2: ( rule__StringArray__MultiplicityAssignment_2_1 )
            // InternalSpice.g:4067:3: rule__StringArray__MultiplicityAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__StringArray__MultiplicityAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStringArrayAccess().getMultiplicityAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group_2__1__Impl"


    // $ANTLR start "rule__StringArray__Group_2__2"
    // InternalSpice.g:4075:1: rule__StringArray__Group_2__2 : rule__StringArray__Group_2__2__Impl ;
    public final void rule__StringArray__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4079:1: ( rule__StringArray__Group_2__2__Impl )
            // InternalSpice.g:4080:2: rule__StringArray__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringArray__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group_2__2"


    // $ANTLR start "rule__StringArray__Group_2__2__Impl"
    // InternalSpice.g:4086:1: rule__StringArray__Group_2__2__Impl : ( ']' ) ;
    public final void rule__StringArray__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4090:1: ( ( ']' ) )
            // InternalSpice.g:4091:1: ( ']' )
            {
            // InternalSpice.g:4091:1: ( ']' )
            // InternalSpice.g:4092:2: ']'
            {
             before(grammarAccess.getStringArrayAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getStringArrayAccess().getRightSquareBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group_2__2__Impl"


    // $ANTLR start "rule__StringArray__Group_5__0"
    // InternalSpice.g:4102:1: rule__StringArray__Group_5__0 : rule__StringArray__Group_5__0__Impl rule__StringArray__Group_5__1 ;
    public final void rule__StringArray__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4106:1: ( rule__StringArray__Group_5__0__Impl rule__StringArray__Group_5__1 )
            // InternalSpice.g:4107:2: rule__StringArray__Group_5__0__Impl rule__StringArray__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__StringArray__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringArray__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group_5__0"


    // $ANTLR start "rule__StringArray__Group_5__0__Impl"
    // InternalSpice.g:4114:1: rule__StringArray__Group_5__0__Impl : ( '(' ) ;
    public final void rule__StringArray__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4118:1: ( ( '(' ) )
            // InternalSpice.g:4119:1: ( '(' )
            {
            // InternalSpice.g:4119:1: ( '(' )
            // InternalSpice.g:4120:2: '('
            {
             before(grammarAccess.getStringArrayAccess().getLeftParenthesisKeyword_5_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getStringArrayAccess().getLeftParenthesisKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group_5__0__Impl"


    // $ANTLR start "rule__StringArray__Group_5__1"
    // InternalSpice.g:4129:1: rule__StringArray__Group_5__1 : rule__StringArray__Group_5__1__Impl rule__StringArray__Group_5__2 ;
    public final void rule__StringArray__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4133:1: ( rule__StringArray__Group_5__1__Impl rule__StringArray__Group_5__2 )
            // InternalSpice.g:4134:2: rule__StringArray__Group_5__1__Impl rule__StringArray__Group_5__2
            {
            pushFollow(FOLLOW_7);
            rule__StringArray__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringArray__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group_5__1"


    // $ANTLR start "rule__StringArray__Group_5__1__Impl"
    // InternalSpice.g:4141:1: rule__StringArray__Group_5__1__Impl : ( ( rule__StringArray__ValueAssignment_5_1 ) ) ;
    public final void rule__StringArray__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4145:1: ( ( ( rule__StringArray__ValueAssignment_5_1 ) ) )
            // InternalSpice.g:4146:1: ( ( rule__StringArray__ValueAssignment_5_1 ) )
            {
            // InternalSpice.g:4146:1: ( ( rule__StringArray__ValueAssignment_5_1 ) )
            // InternalSpice.g:4147:2: ( rule__StringArray__ValueAssignment_5_1 )
            {
             before(grammarAccess.getStringArrayAccess().getValueAssignment_5_1()); 
            // InternalSpice.g:4148:2: ( rule__StringArray__ValueAssignment_5_1 )
            // InternalSpice.g:4148:3: rule__StringArray__ValueAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__StringArray__ValueAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getStringArrayAccess().getValueAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group_5__1__Impl"


    // $ANTLR start "rule__StringArray__Group_5__2"
    // InternalSpice.g:4156:1: rule__StringArray__Group_5__2 : rule__StringArray__Group_5__2__Impl rule__StringArray__Group_5__3 ;
    public final void rule__StringArray__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4160:1: ( rule__StringArray__Group_5__2__Impl rule__StringArray__Group_5__3 )
            // InternalSpice.g:4161:2: rule__StringArray__Group_5__2__Impl rule__StringArray__Group_5__3
            {
            pushFollow(FOLLOW_4);
            rule__StringArray__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringArray__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group_5__2"


    // $ANTLR start "rule__StringArray__Group_5__2__Impl"
    // InternalSpice.g:4168:1: rule__StringArray__Group_5__2__Impl : ( ',' ) ;
    public final void rule__StringArray__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4172:1: ( ( ',' ) )
            // InternalSpice.g:4173:1: ( ',' )
            {
            // InternalSpice.g:4173:1: ( ',' )
            // InternalSpice.g:4174:2: ','
            {
             before(grammarAccess.getStringArrayAccess().getCommaKeyword_5_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStringArrayAccess().getCommaKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group_5__2__Impl"


    // $ANTLR start "rule__StringArray__Group_5__3"
    // InternalSpice.g:4183:1: rule__StringArray__Group_5__3 : rule__StringArray__Group_5__3__Impl rule__StringArray__Group_5__4 ;
    public final void rule__StringArray__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4187:1: ( rule__StringArray__Group_5__3__Impl rule__StringArray__Group_5__4 )
            // InternalSpice.g:4188:2: rule__StringArray__Group_5__3__Impl rule__StringArray__Group_5__4
            {
            pushFollow(FOLLOW_28);
            rule__StringArray__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringArray__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group_5__3"


    // $ANTLR start "rule__StringArray__Group_5__3__Impl"
    // InternalSpice.g:4195:1: rule__StringArray__Group_5__3__Impl : ( ( rule__StringArray__ValueAssignment_5_3 ) ) ;
    public final void rule__StringArray__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4199:1: ( ( ( rule__StringArray__ValueAssignment_5_3 ) ) )
            // InternalSpice.g:4200:1: ( ( rule__StringArray__ValueAssignment_5_3 ) )
            {
            // InternalSpice.g:4200:1: ( ( rule__StringArray__ValueAssignment_5_3 ) )
            // InternalSpice.g:4201:2: ( rule__StringArray__ValueAssignment_5_3 )
            {
             before(grammarAccess.getStringArrayAccess().getValueAssignment_5_3()); 
            // InternalSpice.g:4202:2: ( rule__StringArray__ValueAssignment_5_3 )
            // InternalSpice.g:4202:3: rule__StringArray__ValueAssignment_5_3
            {
            pushFollow(FOLLOW_2);
            rule__StringArray__ValueAssignment_5_3();

            state._fsp--;


            }

             after(grammarAccess.getStringArrayAccess().getValueAssignment_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group_5__3__Impl"


    // $ANTLR start "rule__StringArray__Group_5__4"
    // InternalSpice.g:4210:1: rule__StringArray__Group_5__4 : rule__StringArray__Group_5__4__Impl rule__StringArray__Group_5__5 ;
    public final void rule__StringArray__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4214:1: ( rule__StringArray__Group_5__4__Impl rule__StringArray__Group_5__5 )
            // InternalSpice.g:4215:2: rule__StringArray__Group_5__4__Impl rule__StringArray__Group_5__5
            {
            pushFollow(FOLLOW_28);
            rule__StringArray__Group_5__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringArray__Group_5__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group_5__4"


    // $ANTLR start "rule__StringArray__Group_5__4__Impl"
    // InternalSpice.g:4222:1: rule__StringArray__Group_5__4__Impl : ( ( rule__StringArray__Group_5_4__0 )* ) ;
    public final void rule__StringArray__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4226:1: ( ( ( rule__StringArray__Group_5_4__0 )* ) )
            // InternalSpice.g:4227:1: ( ( rule__StringArray__Group_5_4__0 )* )
            {
            // InternalSpice.g:4227:1: ( ( rule__StringArray__Group_5_4__0 )* )
            // InternalSpice.g:4228:2: ( rule__StringArray__Group_5_4__0 )*
            {
             before(grammarAccess.getStringArrayAccess().getGroup_5_4()); 
            // InternalSpice.g:4229:2: ( rule__StringArray__Group_5_4__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==29) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalSpice.g:4229:3: rule__StringArray__Group_5_4__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__StringArray__Group_5_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getStringArrayAccess().getGroup_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group_5__4__Impl"


    // $ANTLR start "rule__StringArray__Group_5__5"
    // InternalSpice.g:4237:1: rule__StringArray__Group_5__5 : rule__StringArray__Group_5__5__Impl ;
    public final void rule__StringArray__Group_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4241:1: ( rule__StringArray__Group_5__5__Impl )
            // InternalSpice.g:4242:2: rule__StringArray__Group_5__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringArray__Group_5__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group_5__5"


    // $ANTLR start "rule__StringArray__Group_5__5__Impl"
    // InternalSpice.g:4248:1: rule__StringArray__Group_5__5__Impl : ( ')' ) ;
    public final void rule__StringArray__Group_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4252:1: ( ( ')' ) )
            // InternalSpice.g:4253:1: ( ')' )
            {
            // InternalSpice.g:4253:1: ( ')' )
            // InternalSpice.g:4254:2: ')'
            {
             before(grammarAccess.getStringArrayAccess().getRightParenthesisKeyword_5_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getStringArrayAccess().getRightParenthesisKeyword_5_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group_5__5__Impl"


    // $ANTLR start "rule__StringArray__Group_5_4__0"
    // InternalSpice.g:4264:1: rule__StringArray__Group_5_4__0 : rule__StringArray__Group_5_4__0__Impl rule__StringArray__Group_5_4__1 ;
    public final void rule__StringArray__Group_5_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4268:1: ( rule__StringArray__Group_5_4__0__Impl rule__StringArray__Group_5_4__1 )
            // InternalSpice.g:4269:2: rule__StringArray__Group_5_4__0__Impl rule__StringArray__Group_5_4__1
            {
            pushFollow(FOLLOW_4);
            rule__StringArray__Group_5_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringArray__Group_5_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group_5_4__0"


    // $ANTLR start "rule__StringArray__Group_5_4__0__Impl"
    // InternalSpice.g:4276:1: rule__StringArray__Group_5_4__0__Impl : ( ',' ) ;
    public final void rule__StringArray__Group_5_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4280:1: ( ( ',' ) )
            // InternalSpice.g:4281:1: ( ',' )
            {
            // InternalSpice.g:4281:1: ( ',' )
            // InternalSpice.g:4282:2: ','
            {
             before(grammarAccess.getStringArrayAccess().getCommaKeyword_5_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStringArrayAccess().getCommaKeyword_5_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group_5_4__0__Impl"


    // $ANTLR start "rule__StringArray__Group_5_4__1"
    // InternalSpice.g:4291:1: rule__StringArray__Group_5_4__1 : rule__StringArray__Group_5_4__1__Impl ;
    public final void rule__StringArray__Group_5_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4295:1: ( rule__StringArray__Group_5_4__1__Impl )
            // InternalSpice.g:4296:2: rule__StringArray__Group_5_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringArray__Group_5_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group_5_4__1"


    // $ANTLR start "rule__StringArray__Group_5_4__1__Impl"
    // InternalSpice.g:4302:1: rule__StringArray__Group_5_4__1__Impl : ( ( rule__StringArray__ValueAssignment_5_4_1 ) ) ;
    public final void rule__StringArray__Group_5_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4306:1: ( ( ( rule__StringArray__ValueAssignment_5_4_1 ) ) )
            // InternalSpice.g:4307:1: ( ( rule__StringArray__ValueAssignment_5_4_1 ) )
            {
            // InternalSpice.g:4307:1: ( ( rule__StringArray__ValueAssignment_5_4_1 ) )
            // InternalSpice.g:4308:2: ( rule__StringArray__ValueAssignment_5_4_1 )
            {
             before(grammarAccess.getStringArrayAccess().getValueAssignment_5_4_1()); 
            // InternalSpice.g:4309:2: ( rule__StringArray__ValueAssignment_5_4_1 )
            // InternalSpice.g:4309:3: rule__StringArray__ValueAssignment_5_4_1
            {
            pushFollow(FOLLOW_2);
            rule__StringArray__ValueAssignment_5_4_1();

            state._fsp--;


            }

             after(grammarAccess.getStringArrayAccess().getValueAssignment_5_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__Group_5_4__1__Impl"


    // $ANTLR start "rule__BooleanBasic__Group__0"
    // InternalSpice.g:4318:1: rule__BooleanBasic__Group__0 : rule__BooleanBasic__Group__0__Impl rule__BooleanBasic__Group__1 ;
    public final void rule__BooleanBasic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4322:1: ( rule__BooleanBasic__Group__0__Impl rule__BooleanBasic__Group__1 )
            // InternalSpice.g:4323:2: rule__BooleanBasic__Group__0__Impl rule__BooleanBasic__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__BooleanBasic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanBasic__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanBasic__Group__0"


    // $ANTLR start "rule__BooleanBasic__Group__0__Impl"
    // InternalSpice.g:4330:1: rule__BooleanBasic__Group__0__Impl : ( ( rule__BooleanBasic__IsObservableAssignment_0 )? ) ;
    public final void rule__BooleanBasic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4334:1: ( ( ( rule__BooleanBasic__IsObservableAssignment_0 )? ) )
            // InternalSpice.g:4335:1: ( ( rule__BooleanBasic__IsObservableAssignment_0 )? )
            {
            // InternalSpice.g:4335:1: ( ( rule__BooleanBasic__IsObservableAssignment_0 )? )
            // InternalSpice.g:4336:2: ( rule__BooleanBasic__IsObservableAssignment_0 )?
            {
             before(grammarAccess.getBooleanBasicAccess().getIsObservableAssignment_0()); 
            // InternalSpice.g:4337:2: ( rule__BooleanBasic__IsObservableAssignment_0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==52) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSpice.g:4337:3: rule__BooleanBasic__IsObservableAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanBasic__IsObservableAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBooleanBasicAccess().getIsObservableAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanBasic__Group__0__Impl"


    // $ANTLR start "rule__BooleanBasic__Group__1"
    // InternalSpice.g:4345:1: rule__BooleanBasic__Group__1 : rule__BooleanBasic__Group__1__Impl rule__BooleanBasic__Group__2 ;
    public final void rule__BooleanBasic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4349:1: ( rule__BooleanBasic__Group__1__Impl rule__BooleanBasic__Group__2 )
            // InternalSpice.g:4350:2: rule__BooleanBasic__Group__1__Impl rule__BooleanBasic__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__BooleanBasic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanBasic__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanBasic__Group__1"


    // $ANTLR start "rule__BooleanBasic__Group__1__Impl"
    // InternalSpice.g:4357:1: rule__BooleanBasic__Group__1__Impl : ( ( rule__BooleanBasic__TypeAssignment_1 ) ) ;
    public final void rule__BooleanBasic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4361:1: ( ( ( rule__BooleanBasic__TypeAssignment_1 ) ) )
            // InternalSpice.g:4362:1: ( ( rule__BooleanBasic__TypeAssignment_1 ) )
            {
            // InternalSpice.g:4362:1: ( ( rule__BooleanBasic__TypeAssignment_1 ) )
            // InternalSpice.g:4363:2: ( rule__BooleanBasic__TypeAssignment_1 )
            {
             before(grammarAccess.getBooleanBasicAccess().getTypeAssignment_1()); 
            // InternalSpice.g:4364:2: ( rule__BooleanBasic__TypeAssignment_1 )
            // InternalSpice.g:4364:3: rule__BooleanBasic__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BooleanBasic__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanBasicAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanBasic__Group__1__Impl"


    // $ANTLR start "rule__BooleanBasic__Group__2"
    // InternalSpice.g:4372:1: rule__BooleanBasic__Group__2 : rule__BooleanBasic__Group__2__Impl rule__BooleanBasic__Group__3 ;
    public final void rule__BooleanBasic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4376:1: ( rule__BooleanBasic__Group__2__Impl rule__BooleanBasic__Group__3 )
            // InternalSpice.g:4377:2: rule__BooleanBasic__Group__2__Impl rule__BooleanBasic__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__BooleanBasic__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanBasic__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanBasic__Group__2"


    // $ANTLR start "rule__BooleanBasic__Group__2__Impl"
    // InternalSpice.g:4384:1: rule__BooleanBasic__Group__2__Impl : ( ( rule__BooleanBasic__NameAssignment_2 ) ) ;
    public final void rule__BooleanBasic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4388:1: ( ( ( rule__BooleanBasic__NameAssignment_2 ) ) )
            // InternalSpice.g:4389:1: ( ( rule__BooleanBasic__NameAssignment_2 ) )
            {
            // InternalSpice.g:4389:1: ( ( rule__BooleanBasic__NameAssignment_2 ) )
            // InternalSpice.g:4390:2: ( rule__BooleanBasic__NameAssignment_2 )
            {
             before(grammarAccess.getBooleanBasicAccess().getNameAssignment_2()); 
            // InternalSpice.g:4391:2: ( rule__BooleanBasic__NameAssignment_2 )
            // InternalSpice.g:4391:3: rule__BooleanBasic__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BooleanBasic__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBooleanBasicAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanBasic__Group__2__Impl"


    // $ANTLR start "rule__BooleanBasic__Group__3"
    // InternalSpice.g:4399:1: rule__BooleanBasic__Group__3 : rule__BooleanBasic__Group__3__Impl rule__BooleanBasic__Group__4 ;
    public final void rule__BooleanBasic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4403:1: ( rule__BooleanBasic__Group__3__Impl rule__BooleanBasic__Group__4 )
            // InternalSpice.g:4404:2: rule__BooleanBasic__Group__3__Impl rule__BooleanBasic__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__BooleanBasic__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanBasic__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanBasic__Group__3"


    // $ANTLR start "rule__BooleanBasic__Group__3__Impl"
    // InternalSpice.g:4411:1: rule__BooleanBasic__Group__3__Impl : ( '=' ) ;
    public final void rule__BooleanBasic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4415:1: ( ( '=' ) )
            // InternalSpice.g:4416:1: ( '=' )
            {
            // InternalSpice.g:4416:1: ( '=' )
            // InternalSpice.g:4417:2: '='
            {
             before(grammarAccess.getBooleanBasicAccess().getEqualsSignKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getBooleanBasicAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanBasic__Group__3__Impl"


    // $ANTLR start "rule__BooleanBasic__Group__4"
    // InternalSpice.g:4426:1: rule__BooleanBasic__Group__4 : rule__BooleanBasic__Group__4__Impl rule__BooleanBasic__Group__5 ;
    public final void rule__BooleanBasic__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4430:1: ( rule__BooleanBasic__Group__4__Impl rule__BooleanBasic__Group__5 )
            // InternalSpice.g:4431:2: rule__BooleanBasic__Group__4__Impl rule__BooleanBasic__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__BooleanBasic__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanBasic__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanBasic__Group__4"


    // $ANTLR start "rule__BooleanBasic__Group__4__Impl"
    // InternalSpice.g:4438:1: rule__BooleanBasic__Group__4__Impl : ( ( rule__BooleanBasic__ValueAssignment_4 ) ) ;
    public final void rule__BooleanBasic__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4442:1: ( ( ( rule__BooleanBasic__ValueAssignment_4 ) ) )
            // InternalSpice.g:4443:1: ( ( rule__BooleanBasic__ValueAssignment_4 ) )
            {
            // InternalSpice.g:4443:1: ( ( rule__BooleanBasic__ValueAssignment_4 ) )
            // InternalSpice.g:4444:2: ( rule__BooleanBasic__ValueAssignment_4 )
            {
             before(grammarAccess.getBooleanBasicAccess().getValueAssignment_4()); 
            // InternalSpice.g:4445:2: ( rule__BooleanBasic__ValueAssignment_4 )
            // InternalSpice.g:4445:3: rule__BooleanBasic__ValueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__BooleanBasic__ValueAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBooleanBasicAccess().getValueAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanBasic__Group__4__Impl"


    // $ANTLR start "rule__BooleanBasic__Group__5"
    // InternalSpice.g:4453:1: rule__BooleanBasic__Group__5 : rule__BooleanBasic__Group__5__Impl ;
    public final void rule__BooleanBasic__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4457:1: ( rule__BooleanBasic__Group__5__Impl )
            // InternalSpice.g:4458:2: rule__BooleanBasic__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanBasic__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanBasic__Group__5"


    // $ANTLR start "rule__BooleanBasic__Group__5__Impl"
    // InternalSpice.g:4464:1: rule__BooleanBasic__Group__5__Impl : ( ';' ) ;
    public final void rule__BooleanBasic__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4468:1: ( ( ';' ) )
            // InternalSpice.g:4469:1: ( ';' )
            {
            // InternalSpice.g:4469:1: ( ';' )
            // InternalSpice.g:4470:2: ';'
            {
             before(grammarAccess.getBooleanBasicAccess().getSemicolonKeyword_5()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getBooleanBasicAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanBasic__Group__5__Impl"


    // $ANTLR start "rule__BooleanArray__Group__0"
    // InternalSpice.g:4480:1: rule__BooleanArray__Group__0 : rule__BooleanArray__Group__0__Impl rule__BooleanArray__Group__1 ;
    public final void rule__BooleanArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4484:1: ( rule__BooleanArray__Group__0__Impl rule__BooleanArray__Group__1 )
            // InternalSpice.g:4485:2: rule__BooleanArray__Group__0__Impl rule__BooleanArray__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__BooleanArray__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanArray__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanArray__Group__0"


    // $ANTLR start "rule__BooleanArray__Group__0__Impl"
    // InternalSpice.g:4492:1: rule__BooleanArray__Group__0__Impl : ( ( rule__BooleanArray__IsObservableAssignment_0 )? ) ;
    public final void rule__BooleanArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4496:1: ( ( ( rule__BooleanArray__IsObservableAssignment_0 )? ) )
            // InternalSpice.g:4497:1: ( ( rule__BooleanArray__IsObservableAssignment_0 )? )
            {
            // InternalSpice.g:4497:1: ( ( rule__BooleanArray__IsObservableAssignment_0 )? )
            // InternalSpice.g:4498:2: ( rule__BooleanArray__IsObservableAssignment_0 )?
            {
             before(grammarAccess.getBooleanArrayAccess().getIsObservableAssignment_0()); 
            // InternalSpice.g:4499:2: ( rule__BooleanArray__IsObservableAssignment_0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==52) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSpice.g:4499:3: rule__BooleanArray__IsObservableAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanArray__IsObservableAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBooleanArrayAccess().getIsObservableAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanArray__Group__0__Impl"


    // $ANTLR start "rule__BooleanArray__Group__1"
    // InternalSpice.g:4507:1: rule__BooleanArray__Group__1 : rule__BooleanArray__Group__1__Impl rule__BooleanArray__Group__2 ;
    public final void rule__BooleanArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4511:1: ( rule__BooleanArray__Group__1__Impl rule__BooleanArray__Group__2 )
            // InternalSpice.g:4512:2: rule__BooleanArray__Group__1__Impl rule__BooleanArray__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__BooleanArray__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanArray__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanArray__Group__1"


    // $ANTLR start "rule__BooleanArray__Group__1__Impl"
    // InternalSpice.g:4519:1: rule__BooleanArray__Group__1__Impl : ( ( rule__BooleanArray__TypeAssignment_1 ) ) ;
    public final void rule__BooleanArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4523:1: ( ( ( rule__BooleanArray__TypeAssignment_1 ) ) )
            // InternalSpice.g:4524:1: ( ( rule__BooleanArray__TypeAssignment_1 ) )
            {
            // InternalSpice.g:4524:1: ( ( rule__BooleanArray__TypeAssignment_1 ) )
            // InternalSpice.g:4525:2: ( rule__BooleanArray__TypeAssignment_1 )
            {
             before(grammarAccess.getBooleanArrayAccess().getTypeAssignment_1()); 
            // InternalSpice.g:4526:2: ( rule__BooleanArray__TypeAssignment_1 )
            // InternalSpice.g:4526:3: rule__BooleanArray__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BooleanArray__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanArrayAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanArray__Group__1__Impl"


    // $ANTLR start "rule__BooleanArray__Group__2"
    // InternalSpice.g:4534:1: rule__BooleanArray__Group__2 : rule__BooleanArray__Group__2__Impl rule__BooleanArray__Group__3 ;
    public final void rule__BooleanArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4538:1: ( rule__BooleanArray__Group__2__Impl rule__BooleanArray__Group__3 )
            // InternalSpice.g:4539:2: rule__BooleanArray__Group__2__Impl rule__BooleanArray__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__BooleanArray__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanArray__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanArray__Group__2"


    // $ANTLR start "rule__BooleanArray__Group__2__Impl"
    // InternalSpice.g:4546:1: rule__BooleanArray__Group__2__Impl : ( ( rule__BooleanArray__Group_2__0 )? ) ;
    public final void rule__BooleanArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4550:1: ( ( ( rule__BooleanArray__Group_2__0 )? ) )
            // InternalSpice.g:4551:1: ( ( rule__BooleanArray__Group_2__0 )? )
            {
            // InternalSpice.g:4551:1: ( ( rule__BooleanArray__Group_2__0 )? )
            // InternalSpice.g:4552:2: ( rule__BooleanArray__Group_2__0 )?
            {
             before(grammarAccess.getBooleanArrayAccess().getGroup_2()); 
            // InternalSpice.g:4553:2: ( rule__BooleanArray__Group_2__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==41) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalSpice.g:4553:3: rule__BooleanArray__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BooleanArray__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBooleanArrayAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanArray__Group__2__Impl"


    // $ANTLR start "rule__BooleanArray__Group__3"
    // InternalSpice.g:4561:1: rule__BooleanArray__Group__3 : rule__BooleanArray__Group__3__Impl rule__BooleanArray__Group__4 ;
    public final void rule__BooleanArray__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4565:1: ( rule__BooleanArray__Group__3__Impl rule__BooleanArray__Group__4 )
            // InternalSpice.g:4566:2: rule__BooleanArray__Group__3__Impl rule__BooleanArray__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__BooleanArray__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanArray__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanArray__Group__3"


    // $ANTLR start "rule__BooleanArray__Group__3__Impl"
    // InternalSpice.g:4573:1: rule__BooleanArray__Group__3__Impl : ( ( rule__BooleanArray__NameAssignment_3 ) ) ;
    public final void rule__BooleanArray__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4577:1: ( ( ( rule__BooleanArray__NameAssignment_3 ) ) )
            // InternalSpice.g:4578:1: ( ( rule__BooleanArray__NameAssignment_3 ) )
            {
            // InternalSpice.g:4578:1: ( ( rule__BooleanArray__NameAssignment_3 ) )
            // InternalSpice.g:4579:2: ( rule__BooleanArray__NameAssignment_3 )
            {
             before(grammarAccess.getBooleanArrayAccess().getNameAssignment_3()); 
            // InternalSpice.g:4580:2: ( rule__BooleanArray__NameAssignment_3 )
            // InternalSpice.g:4580:3: rule__BooleanArray__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__BooleanArray__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBooleanArrayAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanArray__Group__3__Impl"


    // $ANTLR start "rule__BooleanArray__Group__4"
    // InternalSpice.g:4588:1: rule__BooleanArray__Group__4 : rule__BooleanArray__Group__4__Impl rule__BooleanArray__Group__5 ;
    public final void rule__BooleanArray__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4592:1: ( rule__BooleanArray__Group__4__Impl rule__BooleanArray__Group__5 )
            // InternalSpice.g:4593:2: rule__BooleanArray__Group__4__Impl rule__BooleanArray__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__BooleanArray__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanArray__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanArray__Group__4"


    // $ANTLR start "rule__BooleanArray__Group__4__Impl"
    // InternalSpice.g:4600:1: rule__BooleanArray__Group__4__Impl : ( '=' ) ;
    public final void rule__BooleanArray__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4604:1: ( ( '=' ) )
            // InternalSpice.g:4605:1: ( '=' )
            {
            // InternalSpice.g:4605:1: ( '=' )
            // InternalSpice.g:4606:2: '='
            {
             before(grammarAccess.getBooleanArrayAccess().getEqualsSignKeyword_4()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getBooleanArrayAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanArray__Group__4__Impl"


    // $ANTLR start "rule__BooleanArray__Group__5"
    // InternalSpice.g:4615:1: rule__BooleanArray__Group__5 : rule__BooleanArray__Group__5__Impl rule__BooleanArray__Group__6 ;
    public final void rule__BooleanArray__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4619:1: ( rule__BooleanArray__Group__5__Impl rule__BooleanArray__Group__6 )
            // InternalSpice.g:4620:2: rule__BooleanArray__Group__5__Impl rule__BooleanArray__Group__6
            {
            pushFollow(FOLLOW_25);
            rule__BooleanArray__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanArray__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanArray__Group__5"


    // $ANTLR start "rule__BooleanArray__Group__5__Impl"
    // InternalSpice.g:4627:1: rule__BooleanArray__Group__5__Impl : ( ( rule__BooleanArray__Group_5__0 ) ) ;
    public final void rule__BooleanArray__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4631:1: ( ( ( rule__BooleanArray__Group_5__0 ) ) )
            // InternalSpice.g:4632:1: ( ( rule__BooleanArray__Group_5__0 ) )
            {
            // InternalSpice.g:4632:1: ( ( rule__BooleanArray__Group_5__0 ) )
            // InternalSpice.g:4633:2: ( rule__BooleanArray__Group_5__0 )
            {
             before(grammarAccess.getBooleanArrayAccess().getGroup_5()); 
            // InternalSpice.g:4634:2: ( rule__BooleanArray__Group_5__0 )
            // InternalSpice.g:4634:3: rule__BooleanArray__Group_5__0
            {
            pushFollow(FOLLOW_2);
            rule__BooleanArray__Group_5__0();

            state._fsp--;


            }

             after(grammarAccess.getBooleanArrayAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanArray__Group__5__Impl"


    // $ANTLR start "rule__BooleanArray__Group__6"
    // InternalSpice.g:4642:1: rule__BooleanArray__Group__6 : rule__BooleanArray__Group__6__Impl ;
    public final void rule__BooleanArray__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4646:1: ( rule__BooleanArray__Group__6__Impl )
            // InternalSpice.g:4647:2: rule__BooleanArray__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanArray__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanArray__Group__6"


    // $ANTLR start "rule__BooleanArray__Group__6__Impl"
    // InternalSpice.g:4653:1: rule__BooleanArray__Group__6__Impl : ( ';' ) ;
    public final void rule__BooleanArray__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4657:1: ( ( ';' ) )
            // InternalSpice.g:4658:1: ( ';' )
            {
            // InternalSpice.g:4658:1: ( ';' )
            // InternalSpice.g:4659:2: ';'
            {
             before(grammarAccess.getBooleanArrayAccess().getSemicolonKeyword_6()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getBooleanArrayAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanArray__Group__6__Impl"


    // $ANTLR start "rule__BooleanArray__Group_2__0"
    // InternalSpice.g:4669:1: rule__BooleanArray__Group_2__0 : rule__BooleanArray__Group_2__0__Impl rule__BooleanArray__Group_2__1 ;
    public final void rule__BooleanArray__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4673:1: ( rule__BooleanArray__Group_2__0__Impl rule__BooleanArray__Group_2__1 )
            // InternalSpice.g:4674:2: rule__BooleanArray__Group_2__0__Impl rule__BooleanArray__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__BooleanArray__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanArray__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanArray__Group_2__0"


    // $ANTLR start "rule__BooleanArray__Group_2__0__Impl"
    // InternalSpice.g:4681:1: rule__BooleanArray__Group_2__0__Impl : ( '[' ) ;
    public final void rule__BooleanArray__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4685:1: ( ( '[' ) )
            // InternalSpice.g:4686:1: ( '[' )
            {
            // InternalSpice.g:4686:1: ( '[' )
            // InternalSpice.g:4687:2: '['
            {
             before(grammarAccess.getBooleanArrayAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getBooleanArrayAccess().getLeftSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanArray__Group_2__0__Impl"


    // $ANTLR start "rule__BooleanArray__Group_2__1"
    // InternalSpice.g:4696:1: rule__BooleanArray__Group_2__1 : rule__BooleanArray__Group_2__1__Impl rule__BooleanArray__Group_2__2 ;
    public final void rule__BooleanArray__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4700:1: ( rule__BooleanArray__Group_2__1__Impl rule__BooleanArray__Group_2__2 )
            // InternalSpice.g:4701:2: rule__BooleanArray__Group_2__1__Impl rule__BooleanArray__Group_2__2
            {
            pushFollow(FOLLOW_27);
            rule__BooleanArray__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanArray__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanArray__Group_2__1"


    // $ANTLR start "rule__BooleanArray__Group_2__1__Impl"
    // InternalSpice.g:4708:1: rule__BooleanArray__Group_2__1__Impl : ( ( rule__BooleanArray__MultiplicityAssignment_2_1 ) ) ;
    public final void rule__BooleanArray__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4712:1: ( ( ( rule__BooleanArray__MultiplicityAssignment_2_1 ) ) )
            // InternalSpice.g:4713:1: ( ( rule__BooleanArray__MultiplicityAssignment_2_1 ) )
            {
            // InternalSpice.g:4713:1: ( ( rule__BooleanArray__MultiplicityAssignment_2_1 ) )
            // InternalSpice.g:4714:2: ( rule__BooleanArray__MultiplicityAssignment_2_1 )
            {
             before(grammarAccess.getBooleanArrayAccess().getMultiplicityAssignment_2_1()); 
            // InternalSpice.g:4715:2: ( rule__BooleanArray__MultiplicityAssignment_2_1 )
            // InternalSpice.g:4715:3: rule__BooleanArray__MultiplicityAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__BooleanArray__MultiplicityAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanArrayAccess().getMultiplicityAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanArray__Group_2__1__Impl"


    // $ANTLR start "rule__BooleanArray__Group_2__2"
    // InternalSpice.g:4723:1: rule__BooleanArray__Group_2__2 : rule__BooleanArray__Group_2__2__Impl ;
    public final void rule__BooleanArray__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4727:1: ( rule__BooleanArray__Group_2__2__Impl )
            // InternalSpice.g:4728:2: rule__BooleanArray__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanArray__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanArray__Group_2__2"


    // $ANTLR start "rule__BooleanArray__Group_2__2__Impl"
    // InternalSpice.g:4734:1: rule__BooleanArray__Group_2__2__Impl : ( ']' ) ;
    public final void rule__BooleanArray__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4738:1: ( ( ']' ) )
            // InternalSpice.g:4739:1: ( ']' )
            {
            // InternalSpice.g:4739:1: ( ']' )
            // InternalSpice.g:4740:2: ']'
            {
             before(grammarAccess.getBooleanArrayAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getBooleanArrayAccess().getRightSquareBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanArray__Group_2__2__Impl"


    // $ANTLR start "rule__BooleanArray__Group_5__0"
    // InternalSpice.g:4750:1: rule__BooleanArray__Group_5__0 : rule__BooleanArray__Group_5__0__Impl rule__BooleanArray__Group_5__1 ;
    public final void rule__BooleanArray__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4754:1: ( rule__BooleanArray__Group_5__0__Impl rule__BooleanArray__Group_5__1 )
            // InternalSpice.g:4755:2: rule__BooleanArray__Group_5__0__Impl rule__BooleanArray__Group_5__1
            {
            pushFollow(FOLLOW_30);
            rule__BooleanArray__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanArray__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanArray__Group_5__0"


    // $ANTLR start "rule__BooleanArray__Group_5__0__Impl"
    // InternalSpice.g:4762:1: rule__BooleanArray__Group_5__0__Impl : ( '(' ) ;
    public final void rule__BooleanArray__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4766:1: ( ( '(' ) )
            // InternalSpice.g:4767:1: ( '(' )
            {
            // InternalSpice.g:4767:1: ( '(' )
            // InternalSpice.g:4768:2: '('
            {
             before(grammarAccess.getBooleanArrayAccess().getLeftParenthesisKeyword_5_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getBooleanArrayAccess().getLeftParenthesisKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanArray__Group_5__0__Impl"


    // $ANTLR start "rule__BooleanArray__Group_5__1"
    // InternalSpice.g:4777:1: rule__BooleanArray__Group_5__1 : rule__BooleanArray__Group_5__1__Impl rule__BooleanArray__Group_5__2 ;
    public final void rule__BooleanArray__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4781:1: ( rule__BooleanArray__Group_5__1__Impl rule__BooleanArray__Group_5__2 )
            // InternalSpice.g:4782:2: rule__BooleanArray__Group_5__1__Impl rule__BooleanArray__Group_5__2
            {
            pushFollow(FOLLOW_7);
            rule__BooleanArray__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanArray__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanArray__Group_5__1"


    // $ANTLR start "rule__BooleanArray__Group_5__1__Impl"
    // InternalSpice.g:4789:1: rule__BooleanArray__Group_5__1__Impl : ( ( rule__BooleanArray__ValueAssignment_5_1 ) ) ;
    public final void rule__BooleanArray__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4793:1: ( ( ( rule__BooleanArray__ValueAssignment_5_1 ) ) )
            // InternalSpice.g:4794:1: ( ( rule__BooleanArray__ValueAssignment_5_1 ) )
            {
            // InternalSpice.g:4794:1: ( ( rule__BooleanArray__ValueAssignment_5_1 ) )
            // InternalSpice.g:4795:2: ( rule__BooleanArray__ValueAssignment_5_1 )
            {
             before(grammarAccess.getBooleanArrayAccess().getValueAssignment_5_1()); 
            // InternalSpice.g:4796:2: ( rule__BooleanArray__ValueAssignment_5_1 )
            // InternalSpice.g:4796:3: rule__BooleanArray__ValueAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__BooleanArray__ValueAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanArrayAccess().getValueAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanArray__Group_5__1__Impl"


    // $ANTLR start "rule__BooleanArray__Group_5__2"
    // InternalSpice.g:4804:1: rule__BooleanArray__Group_5__2 : rule__BooleanArray__Group_5__2__Impl rule__BooleanArray__Group_5__3 ;
    public final void rule__BooleanArray__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4808:1: ( rule__BooleanArray__Group_5__2__Impl rule__BooleanArray__Group_5__3 )
            // InternalSpice.g:4809:2: rule__BooleanArray__Group_5__2__Impl rule__BooleanArray__Group_5__3
            {
            pushFollow(FOLLOW_30);
            rule__BooleanArray__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanArray__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanArray__Group_5__2"


    // $ANTLR start "rule__BooleanArray__Group_5__2__Impl"
    // InternalSpice.g:4816:1: rule__BooleanArray__Group_5__2__Impl : ( ',' ) ;
    public final void rule__BooleanArray__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4820:1: ( ( ',' ) )
            // InternalSpice.g:4821:1: ( ',' )
            {
            // InternalSpice.g:4821:1: ( ',' )
            // InternalSpice.g:4822:2: ','
            {
             before(grammarAccess.getBooleanArrayAccess().getCommaKeyword_5_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getBooleanArrayAccess().getCommaKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanArray__Group_5__2__Impl"


    // $ANTLR start "rule__BooleanArray__Group_5__3"
    // InternalSpice.g:4831:1: rule__BooleanArray__Group_5__3 : rule__BooleanArray__Group_5__3__Impl rule__BooleanArray__Group_5__4 ;
    public final void rule__BooleanArray__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4835:1: ( rule__BooleanArray__Group_5__3__Impl rule__BooleanArray__Group_5__4 )
            // InternalSpice.g:4836:2: rule__BooleanArray__Group_5__3__Impl rule__BooleanArray__Group_5__4
            {
            pushFollow(FOLLOW_28);
            rule__BooleanArray__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanArray__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanArray__Group_5__3"


    // $ANTLR start "rule__BooleanArray__Group_5__3__Impl"
    // InternalSpice.g:4843:1: rule__BooleanArray__Group_5__3__Impl : ( ( rule__BooleanArray__ValueAssignment_5_3 ) ) ;
    public final void rule__BooleanArray__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4847:1: ( ( ( rule__BooleanArray__ValueAssignment_5_3 ) ) )
            // InternalSpice.g:4848:1: ( ( rule__BooleanArray__ValueAssignment_5_3 ) )
            {
            // InternalSpice.g:4848:1: ( ( rule__BooleanArray__ValueAssignment_5_3 ) )
            // InternalSpice.g:4849:2: ( rule__BooleanArray__ValueAssignment_5_3 )
            {
             before(grammarAccess.getBooleanArrayAccess().getValueAssignment_5_3()); 
            // InternalSpice.g:4850:2: ( rule__BooleanArray__ValueAssignment_5_3 )
            // InternalSpice.g:4850:3: rule__BooleanArray__ValueAssignment_5_3
            {
            pushFollow(FOLLOW_2);
            rule__BooleanArray__ValueAssignment_5_3();

            state._fsp--;


            }

             after(grammarAccess.getBooleanArrayAccess().getValueAssignment_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanArray__Group_5__3__Impl"


    // $ANTLR start "rule__BooleanArray__Group_5__4"
    // InternalSpice.g:4858:1: rule__BooleanArray__Group_5__4 : rule__BooleanArray__Group_5__4__Impl rule__BooleanArray__Group_5__5 ;
    public final void rule__BooleanArray__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4862:1: ( rule__BooleanArray__Group_5__4__Impl rule__BooleanArray__Group_5__5 )
            // InternalSpice.g:4863:2: rule__BooleanArray__Group_5__4__Impl rule__BooleanArray__Group_5__5
            {
            pushFollow(FOLLOW_28);
            rule__BooleanArray__Group_5__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanArray__Group_5__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanArray__Group_5__4"


    // $ANTLR start "rule__BooleanArray__Group_5__4__Impl"
    // InternalSpice.g:4870:1: rule__BooleanArray__Group_5__4__Impl : ( ( rule__BooleanArray__Group_5_4__0 )* ) ;
    public final void rule__BooleanArray__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4874:1: ( ( ( rule__BooleanArray__Group_5_4__0 )* ) )
            // InternalSpice.g:4875:1: ( ( rule__BooleanArray__Group_5_4__0 )* )
            {
            // InternalSpice.g:4875:1: ( ( rule__BooleanArray__Group_5_4__0 )* )
            // InternalSpice.g:4876:2: ( rule__BooleanArray__Group_5_4__0 )*
            {
             before(grammarAccess.getBooleanArrayAccess().getGroup_5_4()); 
            // InternalSpice.g:4877:2: ( rule__BooleanArray__Group_5_4__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==29) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalSpice.g:4877:3: rule__BooleanArray__Group_5_4__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__BooleanArray__Group_5_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getBooleanArrayAccess().getGroup_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanArray__Group_5__4__Impl"


    // $ANTLR start "rule__BooleanArray__Group_5__5"
    // InternalSpice.g:4885:1: rule__BooleanArray__Group_5__5 : rule__BooleanArray__Group_5__5__Impl ;
    public final void rule__BooleanArray__Group_5__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4889:1: ( rule__BooleanArray__Group_5__5__Impl )
            // InternalSpice.g:4890:2: rule__BooleanArray__Group_5__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanArray__Group_5__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanArray__Group_5__5"


    // $ANTLR start "rule__BooleanArray__Group_5__5__Impl"
    // InternalSpice.g:4896:1: rule__BooleanArray__Group_5__5__Impl : ( ')' ) ;
    public final void rule__BooleanArray__Group_5__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4900:1: ( ( ')' ) )
            // InternalSpice.g:4901:1: ( ')' )
            {
            // InternalSpice.g:4901:1: ( ')' )
            // InternalSpice.g:4902:2: ')'
            {
             before(grammarAccess.getBooleanArrayAccess().getRightParenthesisKeyword_5_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getBooleanArrayAccess().getRightParenthesisKeyword_5_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanArray__Group_5__5__Impl"


    // $ANTLR start "rule__BooleanArray__Group_5_4__0"
    // InternalSpice.g:4912:1: rule__BooleanArray__Group_5_4__0 : rule__BooleanArray__Group_5_4__0__Impl rule__BooleanArray__Group_5_4__1 ;
    public final void rule__BooleanArray__Group_5_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4916:1: ( rule__BooleanArray__Group_5_4__0__Impl rule__BooleanArray__Group_5_4__1 )
            // InternalSpice.g:4917:2: rule__BooleanArray__Group_5_4__0__Impl rule__BooleanArray__Group_5_4__1
            {
            pushFollow(FOLLOW_30);
            rule__BooleanArray__Group_5_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BooleanArray__Group_5_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanArray__Group_5_4__0"


    // $ANTLR start "rule__BooleanArray__Group_5_4__0__Impl"
    // InternalSpice.g:4924:1: rule__BooleanArray__Group_5_4__0__Impl : ( ',' ) ;
    public final void rule__BooleanArray__Group_5_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4928:1: ( ( ',' ) )
            // InternalSpice.g:4929:1: ( ',' )
            {
            // InternalSpice.g:4929:1: ( ',' )
            // InternalSpice.g:4930:2: ','
            {
             before(grammarAccess.getBooleanArrayAccess().getCommaKeyword_5_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getBooleanArrayAccess().getCommaKeyword_5_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanArray__Group_5_4__0__Impl"


    // $ANTLR start "rule__BooleanArray__Group_5_4__1"
    // InternalSpice.g:4939:1: rule__BooleanArray__Group_5_4__1 : rule__BooleanArray__Group_5_4__1__Impl ;
    public final void rule__BooleanArray__Group_5_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4943:1: ( rule__BooleanArray__Group_5_4__1__Impl )
            // InternalSpice.g:4944:2: rule__BooleanArray__Group_5_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BooleanArray__Group_5_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanArray__Group_5_4__1"


    // $ANTLR start "rule__BooleanArray__Group_5_4__1__Impl"
    // InternalSpice.g:4950:1: rule__BooleanArray__Group_5_4__1__Impl : ( ( rule__BooleanArray__ValueAssignment_5_4_1 ) ) ;
    public final void rule__BooleanArray__Group_5_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4954:1: ( ( ( rule__BooleanArray__ValueAssignment_5_4_1 ) ) )
            // InternalSpice.g:4955:1: ( ( rule__BooleanArray__ValueAssignment_5_4_1 ) )
            {
            // InternalSpice.g:4955:1: ( ( rule__BooleanArray__ValueAssignment_5_4_1 ) )
            // InternalSpice.g:4956:2: ( rule__BooleanArray__ValueAssignment_5_4_1 )
            {
             before(grammarAccess.getBooleanArrayAccess().getValueAssignment_5_4_1()); 
            // InternalSpice.g:4957:2: ( rule__BooleanArray__ValueAssignment_5_4_1 )
            // InternalSpice.g:4957:3: rule__BooleanArray__ValueAssignment_5_4_1
            {
            pushFollow(FOLLOW_2);
            rule__BooleanArray__ValueAssignment_5_4_1();

            state._fsp--;


            }

             after(grammarAccess.getBooleanArrayAccess().getValueAssignment_5_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanArray__Group_5_4__1__Impl"


    // $ANTLR start "rule__Xmod_Action__Group__0"
    // InternalSpice.g:4966:1: rule__Xmod_Action__Group__0 : rule__Xmod_Action__Group__0__Impl rule__Xmod_Action__Group__1 ;
    public final void rule__Xmod_Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4970:1: ( rule__Xmod_Action__Group__0__Impl rule__Xmod_Action__Group__1 )
            // InternalSpice.g:4971:2: rule__Xmod_Action__Group__0__Impl rule__Xmod_Action__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Xmod_Action__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Xmod_Action__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_Action__Group__0"


    // $ANTLR start "rule__Xmod_Action__Group__0__Impl"
    // InternalSpice.g:4978:1: rule__Xmod_Action__Group__0__Impl : ( 'Action' ) ;
    public final void rule__Xmod_Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4982:1: ( ( 'Action' ) )
            // InternalSpice.g:4983:1: ( 'Action' )
            {
            // InternalSpice.g:4983:1: ( 'Action' )
            // InternalSpice.g:4984:2: 'Action'
            {
             before(grammarAccess.getXmod_ActionAccess().getActionKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getXmod_ActionAccess().getActionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_Action__Group__0__Impl"


    // $ANTLR start "rule__Xmod_Action__Group__1"
    // InternalSpice.g:4993:1: rule__Xmod_Action__Group__1 : rule__Xmod_Action__Group__1__Impl rule__Xmod_Action__Group__2 ;
    public final void rule__Xmod_Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:4997:1: ( rule__Xmod_Action__Group__1__Impl rule__Xmod_Action__Group__2 )
            // InternalSpice.g:4998:2: rule__Xmod_Action__Group__1__Impl rule__Xmod_Action__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Xmod_Action__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Xmod_Action__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_Action__Group__1"


    // $ANTLR start "rule__Xmod_Action__Group__1__Impl"
    // InternalSpice.g:5005:1: rule__Xmod_Action__Group__1__Impl : ( ( rule__Xmod_Action__NameAssignment_1 ) ) ;
    public final void rule__Xmod_Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5009:1: ( ( ( rule__Xmod_Action__NameAssignment_1 ) ) )
            // InternalSpice.g:5010:1: ( ( rule__Xmod_Action__NameAssignment_1 ) )
            {
            // InternalSpice.g:5010:1: ( ( rule__Xmod_Action__NameAssignment_1 ) )
            // InternalSpice.g:5011:2: ( rule__Xmod_Action__NameAssignment_1 )
            {
             before(grammarAccess.getXmod_ActionAccess().getNameAssignment_1()); 
            // InternalSpice.g:5012:2: ( rule__Xmod_Action__NameAssignment_1 )
            // InternalSpice.g:5012:3: rule__Xmod_Action__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Xmod_Action__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getXmod_ActionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_Action__Group__1__Impl"


    // $ANTLR start "rule__Xmod_Action__Group__2"
    // InternalSpice.g:5020:1: rule__Xmod_Action__Group__2 : rule__Xmod_Action__Group__2__Impl rule__Xmod_Action__Group__3 ;
    public final void rule__Xmod_Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5024:1: ( rule__Xmod_Action__Group__2__Impl rule__Xmod_Action__Group__3 )
            // InternalSpice.g:5025:2: rule__Xmod_Action__Group__2__Impl rule__Xmod_Action__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__Xmod_Action__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Xmod_Action__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_Action__Group__2"


    // $ANTLR start "rule__Xmod_Action__Group__2__Impl"
    // InternalSpice.g:5032:1: rule__Xmod_Action__Group__2__Impl : ( '{' ) ;
    public final void rule__Xmod_Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5036:1: ( ( '{' ) )
            // InternalSpice.g:5037:1: ( '{' )
            {
            // InternalSpice.g:5037:1: ( '{' )
            // InternalSpice.g:5038:2: '{'
            {
             before(grammarAccess.getXmod_ActionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getXmod_ActionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_Action__Group__2__Impl"


    // $ANTLR start "rule__Xmod_Action__Group__3"
    // InternalSpice.g:5047:1: rule__Xmod_Action__Group__3 : rule__Xmod_Action__Group__3__Impl rule__Xmod_Action__Group__4 ;
    public final void rule__Xmod_Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5051:1: ( rule__Xmod_Action__Group__3__Impl rule__Xmod_Action__Group__4 )
            // InternalSpice.g:5052:2: rule__Xmod_Action__Group__3__Impl rule__Xmod_Action__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__Xmod_Action__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Xmod_Action__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_Action__Group__3"


    // $ANTLR start "rule__Xmod_Action__Group__3__Impl"
    // InternalSpice.g:5059:1: rule__Xmod_Action__Group__3__Impl : ( ( rule__Xmod_Action__OperationsAssignment_3 ) ) ;
    public final void rule__Xmod_Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5063:1: ( ( ( rule__Xmod_Action__OperationsAssignment_3 ) ) )
            // InternalSpice.g:5064:1: ( ( rule__Xmod_Action__OperationsAssignment_3 ) )
            {
            // InternalSpice.g:5064:1: ( ( rule__Xmod_Action__OperationsAssignment_3 ) )
            // InternalSpice.g:5065:2: ( rule__Xmod_Action__OperationsAssignment_3 )
            {
             before(grammarAccess.getXmod_ActionAccess().getOperationsAssignment_3()); 
            // InternalSpice.g:5066:2: ( rule__Xmod_Action__OperationsAssignment_3 )
            // InternalSpice.g:5066:3: rule__Xmod_Action__OperationsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Xmod_Action__OperationsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getXmod_ActionAccess().getOperationsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_Action__Group__3__Impl"


    // $ANTLR start "rule__Xmod_Action__Group__4"
    // InternalSpice.g:5074:1: rule__Xmod_Action__Group__4 : rule__Xmod_Action__Group__4__Impl rule__Xmod_Action__Group__5 ;
    public final void rule__Xmod_Action__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5078:1: ( rule__Xmod_Action__Group__4__Impl rule__Xmod_Action__Group__5 )
            // InternalSpice.g:5079:2: rule__Xmod_Action__Group__4__Impl rule__Xmod_Action__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__Xmod_Action__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Xmod_Action__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_Action__Group__4"


    // $ANTLR start "rule__Xmod_Action__Group__4__Impl"
    // InternalSpice.g:5086:1: rule__Xmod_Action__Group__4__Impl : ( ( rule__Xmod_Action__OperationsAssignment_4 )* ) ;
    public final void rule__Xmod_Action__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5090:1: ( ( ( rule__Xmod_Action__OperationsAssignment_4 )* ) )
            // InternalSpice.g:5091:1: ( ( rule__Xmod_Action__OperationsAssignment_4 )* )
            {
            // InternalSpice.g:5091:1: ( ( rule__Xmod_Action__OperationsAssignment_4 )* )
            // InternalSpice.g:5092:2: ( rule__Xmod_Action__OperationsAssignment_4 )*
            {
             before(grammarAccess.getXmod_ActionAccess().getOperationsAssignment_4()); 
            // InternalSpice.g:5093:2: ( rule__Xmod_Action__OperationsAssignment_4 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==46) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalSpice.g:5093:3: rule__Xmod_Action__OperationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__Xmod_Action__OperationsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getXmod_ActionAccess().getOperationsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_Action__Group__4__Impl"


    // $ANTLR start "rule__Xmod_Action__Group__5"
    // InternalSpice.g:5101:1: rule__Xmod_Action__Group__5 : rule__Xmod_Action__Group__5__Impl ;
    public final void rule__Xmod_Action__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5105:1: ( rule__Xmod_Action__Group__5__Impl )
            // InternalSpice.g:5106:2: rule__Xmod_Action__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Xmod_Action__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_Action__Group__5"


    // $ANTLR start "rule__Xmod_Action__Group__5__Impl"
    // InternalSpice.g:5112:1: rule__Xmod_Action__Group__5__Impl : ( '}' ) ;
    public final void rule__Xmod_Action__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5116:1: ( ( '}' ) )
            // InternalSpice.g:5117:1: ( '}' )
            {
            // InternalSpice.g:5117:1: ( '}' )
            // InternalSpice.g:5118:2: '}'
            {
             before(grammarAccess.getXmod_ActionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getXmod_ActionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_Action__Group__5__Impl"


    // $ANTLR start "rule__Xmod_OperationDef__Group__0"
    // InternalSpice.g:5128:1: rule__Xmod_OperationDef__Group__0 : rule__Xmod_OperationDef__Group__0__Impl rule__Xmod_OperationDef__Group__1 ;
    public final void rule__Xmod_OperationDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5132:1: ( rule__Xmod_OperationDef__Group__0__Impl rule__Xmod_OperationDef__Group__1 )
            // InternalSpice.g:5133:2: rule__Xmod_OperationDef__Group__0__Impl rule__Xmod_OperationDef__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Xmod_OperationDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Xmod_OperationDef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationDef__Group__0"


    // $ANTLR start "rule__Xmod_OperationDef__Group__0__Impl"
    // InternalSpice.g:5140:1: rule__Xmod_OperationDef__Group__0__Impl : ( ( rule__Xmod_OperationDef__NameAssignment_0 ) ) ;
    public final void rule__Xmod_OperationDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5144:1: ( ( ( rule__Xmod_OperationDef__NameAssignment_0 ) ) )
            // InternalSpice.g:5145:1: ( ( rule__Xmod_OperationDef__NameAssignment_0 ) )
            {
            // InternalSpice.g:5145:1: ( ( rule__Xmod_OperationDef__NameAssignment_0 ) )
            // InternalSpice.g:5146:2: ( rule__Xmod_OperationDef__NameAssignment_0 )
            {
             before(grammarAccess.getXmod_OperationDefAccess().getNameAssignment_0()); 
            // InternalSpice.g:5147:2: ( rule__Xmod_OperationDef__NameAssignment_0 )
            // InternalSpice.g:5147:3: rule__Xmod_OperationDef__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Xmod_OperationDef__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getXmod_OperationDefAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationDef__Group__0__Impl"


    // $ANTLR start "rule__Xmod_OperationDef__Group__1"
    // InternalSpice.g:5155:1: rule__Xmod_OperationDef__Group__1 : rule__Xmod_OperationDef__Group__1__Impl rule__Xmod_OperationDef__Group__2 ;
    public final void rule__Xmod_OperationDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5159:1: ( rule__Xmod_OperationDef__Group__1__Impl rule__Xmod_OperationDef__Group__2 )
            // InternalSpice.g:5160:2: rule__Xmod_OperationDef__Group__1__Impl rule__Xmod_OperationDef__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__Xmod_OperationDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Xmod_OperationDef__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationDef__Group__1"


    // $ANTLR start "rule__Xmod_OperationDef__Group__1__Impl"
    // InternalSpice.g:5167:1: rule__Xmod_OperationDef__Group__1__Impl : ( '(' ) ;
    public final void rule__Xmod_OperationDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5171:1: ( ( '(' ) )
            // InternalSpice.g:5172:1: ( '(' )
            {
            // InternalSpice.g:5172:1: ( '(' )
            // InternalSpice.g:5173:2: '('
            {
             before(grammarAccess.getXmod_OperationDefAccess().getLeftParenthesisKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getXmod_OperationDefAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationDef__Group__1__Impl"


    // $ANTLR start "rule__Xmod_OperationDef__Group__2"
    // InternalSpice.g:5182:1: rule__Xmod_OperationDef__Group__2 : rule__Xmod_OperationDef__Group__2__Impl rule__Xmod_OperationDef__Group__3 ;
    public final void rule__Xmod_OperationDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5186:1: ( rule__Xmod_OperationDef__Group__2__Impl rule__Xmod_OperationDef__Group__3 )
            // InternalSpice.g:5187:2: rule__Xmod_OperationDef__Group__2__Impl rule__Xmod_OperationDef__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__Xmod_OperationDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Xmod_OperationDef__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationDef__Group__2"


    // $ANTLR start "rule__Xmod_OperationDef__Group__2__Impl"
    // InternalSpice.g:5194:1: rule__Xmod_OperationDef__Group__2__Impl : ( ( rule__Xmod_OperationDef__Group_2__0 )? ) ;
    public final void rule__Xmod_OperationDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5198:1: ( ( ( rule__Xmod_OperationDef__Group_2__0 )? ) )
            // InternalSpice.g:5199:1: ( ( rule__Xmod_OperationDef__Group_2__0 )? )
            {
            // InternalSpice.g:5199:1: ( ( rule__Xmod_OperationDef__Group_2__0 )? )
            // InternalSpice.g:5200:2: ( rule__Xmod_OperationDef__Group_2__0 )?
            {
             before(grammarAccess.getXmod_OperationDefAccess().getGroup_2()); 
            // InternalSpice.g:5201:2: ( rule__Xmod_OperationDef__Group_2__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_STRING && LA39_0<=RULE_ID)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSpice.g:5201:3: rule__Xmod_OperationDef__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Xmod_OperationDef__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXmod_OperationDefAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationDef__Group__2__Impl"


    // $ANTLR start "rule__Xmod_OperationDef__Group__3"
    // InternalSpice.g:5209:1: rule__Xmod_OperationDef__Group__3 : rule__Xmod_OperationDef__Group__3__Impl rule__Xmod_OperationDef__Group__4 ;
    public final void rule__Xmod_OperationDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5213:1: ( rule__Xmod_OperationDef__Group__3__Impl rule__Xmod_OperationDef__Group__4 )
            // InternalSpice.g:5214:2: rule__Xmod_OperationDef__Group__3__Impl rule__Xmod_OperationDef__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__Xmod_OperationDef__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Xmod_OperationDef__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationDef__Group__3"


    // $ANTLR start "rule__Xmod_OperationDef__Group__3__Impl"
    // InternalSpice.g:5221:1: rule__Xmod_OperationDef__Group__3__Impl : ( ')' ) ;
    public final void rule__Xmod_OperationDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5225:1: ( ( ')' ) )
            // InternalSpice.g:5226:1: ( ')' )
            {
            // InternalSpice.g:5226:1: ( ')' )
            // InternalSpice.g:5227:2: ')'
            {
             before(grammarAccess.getXmod_OperationDefAccess().getRightParenthesisKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getXmod_OperationDefAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationDef__Group__3__Impl"


    // $ANTLR start "rule__Xmod_OperationDef__Group__4"
    // InternalSpice.g:5236:1: rule__Xmod_OperationDef__Group__4 : rule__Xmod_OperationDef__Group__4__Impl rule__Xmod_OperationDef__Group__5 ;
    public final void rule__Xmod_OperationDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5240:1: ( rule__Xmod_OperationDef__Group__4__Impl rule__Xmod_OperationDef__Group__5 )
            // InternalSpice.g:5241:2: rule__Xmod_OperationDef__Group__4__Impl rule__Xmod_OperationDef__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Xmod_OperationDef__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Xmod_OperationDef__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationDef__Group__4"


    // $ANTLR start "rule__Xmod_OperationDef__Group__4__Impl"
    // InternalSpice.g:5248:1: rule__Xmod_OperationDef__Group__4__Impl : ( 'on' ) ;
    public final void rule__Xmod_OperationDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5252:1: ( ( 'on' ) )
            // InternalSpice.g:5253:1: ( 'on' )
            {
            // InternalSpice.g:5253:1: ( 'on' )
            // InternalSpice.g:5254:2: 'on'
            {
             before(grammarAccess.getXmod_OperationDefAccess().getOnKeyword_4()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getXmod_OperationDefAccess().getOnKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationDef__Group__4__Impl"


    // $ANTLR start "rule__Xmod_OperationDef__Group__5"
    // InternalSpice.g:5263:1: rule__Xmod_OperationDef__Group__5 : rule__Xmod_OperationDef__Group__5__Impl rule__Xmod_OperationDef__Group__6 ;
    public final void rule__Xmod_OperationDef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5267:1: ( rule__Xmod_OperationDef__Group__5__Impl rule__Xmod_OperationDef__Group__6 )
            // InternalSpice.g:5268:2: rule__Xmod_OperationDef__Group__5__Impl rule__Xmod_OperationDef__Group__6
            {
            pushFollow(FOLLOW_36);
            rule__Xmod_OperationDef__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Xmod_OperationDef__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationDef__Group__5"


    // $ANTLR start "rule__Xmod_OperationDef__Group__5__Impl"
    // InternalSpice.g:5275:1: rule__Xmod_OperationDef__Group__5__Impl : ( ( rule__Xmod_OperationDef__ObjectTagAssignment_5 ) ) ;
    public final void rule__Xmod_OperationDef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5279:1: ( ( ( rule__Xmod_OperationDef__ObjectTagAssignment_5 ) ) )
            // InternalSpice.g:5280:1: ( ( rule__Xmod_OperationDef__ObjectTagAssignment_5 ) )
            {
            // InternalSpice.g:5280:1: ( ( rule__Xmod_OperationDef__ObjectTagAssignment_5 ) )
            // InternalSpice.g:5281:2: ( rule__Xmod_OperationDef__ObjectTagAssignment_5 )
            {
             before(grammarAccess.getXmod_OperationDefAccess().getObjectTagAssignment_5()); 
            // InternalSpice.g:5282:2: ( rule__Xmod_OperationDef__ObjectTagAssignment_5 )
            // InternalSpice.g:5282:3: rule__Xmod_OperationDef__ObjectTagAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Xmod_OperationDef__ObjectTagAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getXmod_OperationDefAccess().getObjectTagAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationDef__Group__5__Impl"


    // $ANTLR start "rule__Xmod_OperationDef__Group__6"
    // InternalSpice.g:5290:1: rule__Xmod_OperationDef__Group__6 : rule__Xmod_OperationDef__Group__6__Impl rule__Xmod_OperationDef__Group__7 ;
    public final void rule__Xmod_OperationDef__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5294:1: ( rule__Xmod_OperationDef__Group__6__Impl rule__Xmod_OperationDef__Group__7 )
            // InternalSpice.g:5295:2: rule__Xmod_OperationDef__Group__6__Impl rule__Xmod_OperationDef__Group__7
            {
            pushFollow(FOLLOW_36);
            rule__Xmod_OperationDef__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Xmod_OperationDef__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationDef__Group__6"


    // $ANTLR start "rule__Xmod_OperationDef__Group__6__Impl"
    // InternalSpice.g:5302:1: rule__Xmod_OperationDef__Group__6__Impl : ( ( rule__Xmod_OperationDef__Group_6__0 )? ) ;
    public final void rule__Xmod_OperationDef__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5306:1: ( ( ( rule__Xmod_OperationDef__Group_6__0 )? ) )
            // InternalSpice.g:5307:1: ( ( rule__Xmod_OperationDef__Group_6__0 )? )
            {
            // InternalSpice.g:5307:1: ( ( rule__Xmod_OperationDef__Group_6__0 )? )
            // InternalSpice.g:5308:2: ( rule__Xmod_OperationDef__Group_6__0 )?
            {
             before(grammarAccess.getXmod_OperationDefAccess().getGroup_6()); 
            // InternalSpice.g:5309:2: ( rule__Xmod_OperationDef__Group_6__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==45) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalSpice.g:5309:3: rule__Xmod_OperationDef__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Xmod_OperationDef__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXmod_OperationDefAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationDef__Group__6__Impl"


    // $ANTLR start "rule__Xmod_OperationDef__Group__7"
    // InternalSpice.g:5317:1: rule__Xmod_OperationDef__Group__7 : rule__Xmod_OperationDef__Group__7__Impl ;
    public final void rule__Xmod_OperationDef__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5321:1: ( rule__Xmod_OperationDef__Group__7__Impl )
            // InternalSpice.g:5322:2: rule__Xmod_OperationDef__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Xmod_OperationDef__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationDef__Group__7"


    // $ANTLR start "rule__Xmod_OperationDef__Group__7__Impl"
    // InternalSpice.g:5328:1: rule__Xmod_OperationDef__Group__7__Impl : ( ( rule__Xmod_OperationDef__Group_7__0 )? ) ;
    public final void rule__Xmod_OperationDef__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5332:1: ( ( ( rule__Xmod_OperationDef__Group_7__0 )? ) )
            // InternalSpice.g:5333:1: ( ( rule__Xmod_OperationDef__Group_7__0 )? )
            {
            // InternalSpice.g:5333:1: ( ( rule__Xmod_OperationDef__Group_7__0 )? )
            // InternalSpice.g:5334:2: ( rule__Xmod_OperationDef__Group_7__0 )?
            {
             before(grammarAccess.getXmod_OperationDefAccess().getGroup_7()); 
            // InternalSpice.g:5335:2: ( rule__Xmod_OperationDef__Group_7__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==47) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSpice.g:5335:3: rule__Xmod_OperationDef__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Xmod_OperationDef__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXmod_OperationDefAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationDef__Group__7__Impl"


    // $ANTLR start "rule__Xmod_OperationDef__Group_2__0"
    // InternalSpice.g:5344:1: rule__Xmod_OperationDef__Group_2__0 : rule__Xmod_OperationDef__Group_2__0__Impl rule__Xmod_OperationDef__Group_2__1 ;
    public final void rule__Xmod_OperationDef__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5348:1: ( rule__Xmod_OperationDef__Group_2__0__Impl rule__Xmod_OperationDef__Group_2__1 )
            // InternalSpice.g:5349:2: rule__Xmod_OperationDef__Group_2__0__Impl rule__Xmod_OperationDef__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__Xmod_OperationDef__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Xmod_OperationDef__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationDef__Group_2__0"


    // $ANTLR start "rule__Xmod_OperationDef__Group_2__0__Impl"
    // InternalSpice.g:5356:1: rule__Xmod_OperationDef__Group_2__0__Impl : ( ( rule__Xmod_OperationDef__ParametersTagAssignment_2_0 ) ) ;
    public final void rule__Xmod_OperationDef__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5360:1: ( ( ( rule__Xmod_OperationDef__ParametersTagAssignment_2_0 ) ) )
            // InternalSpice.g:5361:1: ( ( rule__Xmod_OperationDef__ParametersTagAssignment_2_0 ) )
            {
            // InternalSpice.g:5361:1: ( ( rule__Xmod_OperationDef__ParametersTagAssignment_2_0 ) )
            // InternalSpice.g:5362:2: ( rule__Xmod_OperationDef__ParametersTagAssignment_2_0 )
            {
             before(grammarAccess.getXmod_OperationDefAccess().getParametersTagAssignment_2_0()); 
            // InternalSpice.g:5363:2: ( rule__Xmod_OperationDef__ParametersTagAssignment_2_0 )
            // InternalSpice.g:5363:3: rule__Xmod_OperationDef__ParametersTagAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Xmod_OperationDef__ParametersTagAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getXmod_OperationDefAccess().getParametersTagAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationDef__Group_2__0__Impl"


    // $ANTLR start "rule__Xmod_OperationDef__Group_2__1"
    // InternalSpice.g:5371:1: rule__Xmod_OperationDef__Group_2__1 : rule__Xmod_OperationDef__Group_2__1__Impl ;
    public final void rule__Xmod_OperationDef__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5375:1: ( rule__Xmod_OperationDef__Group_2__1__Impl )
            // InternalSpice.g:5376:2: rule__Xmod_OperationDef__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Xmod_OperationDef__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationDef__Group_2__1"


    // $ANTLR start "rule__Xmod_OperationDef__Group_2__1__Impl"
    // InternalSpice.g:5382:1: rule__Xmod_OperationDef__Group_2__1__Impl : ( ( rule__Xmod_OperationDef__Group_2_1__0 )* ) ;
    public final void rule__Xmod_OperationDef__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5386:1: ( ( ( rule__Xmod_OperationDef__Group_2_1__0 )* ) )
            // InternalSpice.g:5387:1: ( ( rule__Xmod_OperationDef__Group_2_1__0 )* )
            {
            // InternalSpice.g:5387:1: ( ( rule__Xmod_OperationDef__Group_2_1__0 )* )
            // InternalSpice.g:5388:2: ( rule__Xmod_OperationDef__Group_2_1__0 )*
            {
             before(grammarAccess.getXmod_OperationDefAccess().getGroup_2_1()); 
            // InternalSpice.g:5389:2: ( rule__Xmod_OperationDef__Group_2_1__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==29) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalSpice.g:5389:3: rule__Xmod_OperationDef__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Xmod_OperationDef__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

             after(grammarAccess.getXmod_OperationDefAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationDef__Group_2__1__Impl"


    // $ANTLR start "rule__Xmod_OperationDef__Group_2_1__0"
    // InternalSpice.g:5398:1: rule__Xmod_OperationDef__Group_2_1__0 : rule__Xmod_OperationDef__Group_2_1__0__Impl rule__Xmod_OperationDef__Group_2_1__1 ;
    public final void rule__Xmod_OperationDef__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5402:1: ( rule__Xmod_OperationDef__Group_2_1__0__Impl rule__Xmod_OperationDef__Group_2_1__1 )
            // InternalSpice.g:5403:2: rule__Xmod_OperationDef__Group_2_1__0__Impl rule__Xmod_OperationDef__Group_2_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Xmod_OperationDef__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Xmod_OperationDef__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationDef__Group_2_1__0"


    // $ANTLR start "rule__Xmod_OperationDef__Group_2_1__0__Impl"
    // InternalSpice.g:5410:1: rule__Xmod_OperationDef__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Xmod_OperationDef__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5414:1: ( ( ',' ) )
            // InternalSpice.g:5415:1: ( ',' )
            {
            // InternalSpice.g:5415:1: ( ',' )
            // InternalSpice.g:5416:2: ','
            {
             before(grammarAccess.getXmod_OperationDefAccess().getCommaKeyword_2_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getXmod_OperationDefAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationDef__Group_2_1__0__Impl"


    // $ANTLR start "rule__Xmod_OperationDef__Group_2_1__1"
    // InternalSpice.g:5425:1: rule__Xmod_OperationDef__Group_2_1__1 : rule__Xmod_OperationDef__Group_2_1__1__Impl ;
    public final void rule__Xmod_OperationDef__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5429:1: ( rule__Xmod_OperationDef__Group_2_1__1__Impl )
            // InternalSpice.g:5430:2: rule__Xmod_OperationDef__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Xmod_OperationDef__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationDef__Group_2_1__1"


    // $ANTLR start "rule__Xmod_OperationDef__Group_2_1__1__Impl"
    // InternalSpice.g:5436:1: rule__Xmod_OperationDef__Group_2_1__1__Impl : ( ( rule__Xmod_OperationDef__ParametersTagAssignment_2_1_1 ) ) ;
    public final void rule__Xmod_OperationDef__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5440:1: ( ( ( rule__Xmod_OperationDef__ParametersTagAssignment_2_1_1 ) ) )
            // InternalSpice.g:5441:1: ( ( rule__Xmod_OperationDef__ParametersTagAssignment_2_1_1 ) )
            {
            // InternalSpice.g:5441:1: ( ( rule__Xmod_OperationDef__ParametersTagAssignment_2_1_1 ) )
            // InternalSpice.g:5442:2: ( rule__Xmod_OperationDef__ParametersTagAssignment_2_1_1 )
            {
             before(grammarAccess.getXmod_OperationDefAccess().getParametersTagAssignment_2_1_1()); 
            // InternalSpice.g:5443:2: ( rule__Xmod_OperationDef__ParametersTagAssignment_2_1_1 )
            // InternalSpice.g:5443:3: rule__Xmod_OperationDef__ParametersTagAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Xmod_OperationDef__ParametersTagAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getXmod_OperationDefAccess().getParametersTagAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationDef__Group_2_1__1__Impl"


    // $ANTLR start "rule__Xmod_OperationDef__Group_6__0"
    // InternalSpice.g:5452:1: rule__Xmod_OperationDef__Group_6__0 : rule__Xmod_OperationDef__Group_6__0__Impl rule__Xmod_OperationDef__Group_6__1 ;
    public final void rule__Xmod_OperationDef__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5456:1: ( rule__Xmod_OperationDef__Group_6__0__Impl rule__Xmod_OperationDef__Group_6__1 )
            // InternalSpice.g:5457:2: rule__Xmod_OperationDef__Group_6__0__Impl rule__Xmod_OperationDef__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__Xmod_OperationDef__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Xmod_OperationDef__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationDef__Group_6__0"


    // $ANTLR start "rule__Xmod_OperationDef__Group_6__0__Impl"
    // InternalSpice.g:5464:1: rule__Xmod_OperationDef__Group_6__0__Impl : ( 'returns' ) ;
    public final void rule__Xmod_OperationDef__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5468:1: ( ( 'returns' ) )
            // InternalSpice.g:5469:1: ( 'returns' )
            {
            // InternalSpice.g:5469:1: ( 'returns' )
            // InternalSpice.g:5470:2: 'returns'
            {
             before(grammarAccess.getXmod_OperationDefAccess().getReturnsKeyword_6_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getXmod_OperationDefAccess().getReturnsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationDef__Group_6__0__Impl"


    // $ANTLR start "rule__Xmod_OperationDef__Group_6__1"
    // InternalSpice.g:5479:1: rule__Xmod_OperationDef__Group_6__1 : rule__Xmod_OperationDef__Group_6__1__Impl ;
    public final void rule__Xmod_OperationDef__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5483:1: ( rule__Xmod_OperationDef__Group_6__1__Impl )
            // InternalSpice.g:5484:2: rule__Xmod_OperationDef__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Xmod_OperationDef__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationDef__Group_6__1"


    // $ANTLR start "rule__Xmod_OperationDef__Group_6__1__Impl"
    // InternalSpice.g:5490:1: rule__Xmod_OperationDef__Group_6__1__Impl : ( ( rule__Xmod_OperationDef__ReturnTagAssignment_6_1 ) ) ;
    public final void rule__Xmod_OperationDef__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5494:1: ( ( ( rule__Xmod_OperationDef__ReturnTagAssignment_6_1 ) ) )
            // InternalSpice.g:5495:1: ( ( rule__Xmod_OperationDef__ReturnTagAssignment_6_1 ) )
            {
            // InternalSpice.g:5495:1: ( ( rule__Xmod_OperationDef__ReturnTagAssignment_6_1 ) )
            // InternalSpice.g:5496:2: ( rule__Xmod_OperationDef__ReturnTagAssignment_6_1 )
            {
             before(grammarAccess.getXmod_OperationDefAccess().getReturnTagAssignment_6_1()); 
            // InternalSpice.g:5497:2: ( rule__Xmod_OperationDef__ReturnTagAssignment_6_1 )
            // InternalSpice.g:5497:3: rule__Xmod_OperationDef__ReturnTagAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Xmod_OperationDef__ReturnTagAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getXmod_OperationDefAccess().getReturnTagAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationDef__Group_6__1__Impl"


    // $ANTLR start "rule__Xmod_OperationDef__Group_7__0"
    // InternalSpice.g:5506:1: rule__Xmod_OperationDef__Group_7__0 : rule__Xmod_OperationDef__Group_7__0__Impl rule__Xmod_OperationDef__Group_7__1 ;
    public final void rule__Xmod_OperationDef__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5510:1: ( rule__Xmod_OperationDef__Group_7__0__Impl rule__Xmod_OperationDef__Group_7__1 )
            // InternalSpice.g:5511:2: rule__Xmod_OperationDef__Group_7__0__Impl rule__Xmod_OperationDef__Group_7__1
            {
            pushFollow(FOLLOW_37);
            rule__Xmod_OperationDef__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Xmod_OperationDef__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationDef__Group_7__0"


    // $ANTLR start "rule__Xmod_OperationDef__Group_7__0__Impl"
    // InternalSpice.g:5518:1: rule__Xmod_OperationDef__Group_7__0__Impl : ( ( rule__Xmod_OperationDef__ExceptionsAssignment_7_0 ) ) ;
    public final void rule__Xmod_OperationDef__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5522:1: ( ( ( rule__Xmod_OperationDef__ExceptionsAssignment_7_0 ) ) )
            // InternalSpice.g:5523:1: ( ( rule__Xmod_OperationDef__ExceptionsAssignment_7_0 ) )
            {
            // InternalSpice.g:5523:1: ( ( rule__Xmod_OperationDef__ExceptionsAssignment_7_0 ) )
            // InternalSpice.g:5524:2: ( rule__Xmod_OperationDef__ExceptionsAssignment_7_0 )
            {
             before(grammarAccess.getXmod_OperationDefAccess().getExceptionsAssignment_7_0()); 
            // InternalSpice.g:5525:2: ( rule__Xmod_OperationDef__ExceptionsAssignment_7_0 )
            // InternalSpice.g:5525:3: rule__Xmod_OperationDef__ExceptionsAssignment_7_0
            {
            pushFollow(FOLLOW_2);
            rule__Xmod_OperationDef__ExceptionsAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getXmod_OperationDefAccess().getExceptionsAssignment_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationDef__Group_7__0__Impl"


    // $ANTLR start "rule__Xmod_OperationDef__Group_7__1"
    // InternalSpice.g:5533:1: rule__Xmod_OperationDef__Group_7__1 : rule__Xmod_OperationDef__Group_7__1__Impl ;
    public final void rule__Xmod_OperationDef__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5537:1: ( rule__Xmod_OperationDef__Group_7__1__Impl )
            // InternalSpice.g:5538:2: rule__Xmod_OperationDef__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Xmod_OperationDef__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationDef__Group_7__1"


    // $ANTLR start "rule__Xmod_OperationDef__Group_7__1__Impl"
    // InternalSpice.g:5544:1: rule__Xmod_OperationDef__Group_7__1__Impl : ( ( rule__Xmod_OperationDef__ExceptionsAssignment_7_1 )* ) ;
    public final void rule__Xmod_OperationDef__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5548:1: ( ( ( rule__Xmod_OperationDef__ExceptionsAssignment_7_1 )* ) )
            // InternalSpice.g:5549:1: ( ( rule__Xmod_OperationDef__ExceptionsAssignment_7_1 )* )
            {
            // InternalSpice.g:5549:1: ( ( rule__Xmod_OperationDef__ExceptionsAssignment_7_1 )* )
            // InternalSpice.g:5550:2: ( rule__Xmod_OperationDef__ExceptionsAssignment_7_1 )*
            {
             before(grammarAccess.getXmod_OperationDefAccess().getExceptionsAssignment_7_1()); 
            // InternalSpice.g:5551:2: ( rule__Xmod_OperationDef__ExceptionsAssignment_7_1 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==47) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalSpice.g:5551:3: rule__Xmod_OperationDef__ExceptionsAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__Xmod_OperationDef__ExceptionsAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getXmod_OperationDefAccess().getExceptionsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationDef__Group_7__1__Impl"


    // $ANTLR start "rule__Xmod_OperationCall__Group__0"
    // InternalSpice.g:5560:1: rule__Xmod_OperationCall__Group__0 : rule__Xmod_OperationCall__Group__0__Impl rule__Xmod_OperationCall__Group__1 ;
    public final void rule__Xmod_OperationCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5564:1: ( rule__Xmod_OperationCall__Group__0__Impl rule__Xmod_OperationCall__Group__1 )
            // InternalSpice.g:5565:2: rule__Xmod_OperationCall__Group__0__Impl rule__Xmod_OperationCall__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Xmod_OperationCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Xmod_OperationCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationCall__Group__0"


    // $ANTLR start "rule__Xmod_OperationCall__Group__0__Impl"
    // InternalSpice.g:5572:1: rule__Xmod_OperationCall__Group__0__Impl : ( 'call' ) ;
    public final void rule__Xmod_OperationCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5576:1: ( ( 'call' ) )
            // InternalSpice.g:5577:1: ( 'call' )
            {
            // InternalSpice.g:5577:1: ( 'call' )
            // InternalSpice.g:5578:2: 'call'
            {
             before(grammarAccess.getXmod_OperationCallAccess().getCallKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getXmod_OperationCallAccess().getCallKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationCall__Group__0__Impl"


    // $ANTLR start "rule__Xmod_OperationCall__Group__1"
    // InternalSpice.g:5587:1: rule__Xmod_OperationCall__Group__1 : rule__Xmod_OperationCall__Group__1__Impl rule__Xmod_OperationCall__Group__2 ;
    public final void rule__Xmod_OperationCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5591:1: ( rule__Xmod_OperationCall__Group__1__Impl rule__Xmod_OperationCall__Group__2 )
            // InternalSpice.g:5592:2: rule__Xmod_OperationCall__Group__1__Impl rule__Xmod_OperationCall__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Xmod_OperationCall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Xmod_OperationCall__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationCall__Group__1"


    // $ANTLR start "rule__Xmod_OperationCall__Group__1__Impl"
    // InternalSpice.g:5599:1: rule__Xmod_OperationCall__Group__1__Impl : ( ruleXmod_OperationDef ) ;
    public final void rule__Xmod_OperationCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5603:1: ( ( ruleXmod_OperationDef ) )
            // InternalSpice.g:5604:1: ( ruleXmod_OperationDef )
            {
            // InternalSpice.g:5604:1: ( ruleXmod_OperationDef )
            // InternalSpice.g:5605:2: ruleXmod_OperationDef
            {
             before(grammarAccess.getXmod_OperationCallAccess().getXmod_OperationDefParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleXmod_OperationDef();

            state._fsp--;

             after(grammarAccess.getXmod_OperationCallAccess().getXmod_OperationDefParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationCall__Group__1__Impl"


    // $ANTLR start "rule__Xmod_OperationCall__Group__2"
    // InternalSpice.g:5614:1: rule__Xmod_OperationCall__Group__2 : rule__Xmod_OperationCall__Group__2__Impl ;
    public final void rule__Xmod_OperationCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5618:1: ( rule__Xmod_OperationCall__Group__2__Impl )
            // InternalSpice.g:5619:2: rule__Xmod_OperationCall__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Xmod_OperationCall__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationCall__Group__2"


    // $ANTLR start "rule__Xmod_OperationCall__Group__2__Impl"
    // InternalSpice.g:5625:1: rule__Xmod_OperationCall__Group__2__Impl : ( ';' ) ;
    public final void rule__Xmod_OperationCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5629:1: ( ( ';' ) )
            // InternalSpice.g:5630:1: ( ';' )
            {
            // InternalSpice.g:5630:1: ( ';' )
            // InternalSpice.g:5631:2: ';'
            {
             before(grammarAccess.getXmod_OperationCallAccess().getSemicolonKeyword_2()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getXmod_OperationCallAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationCall__Group__2__Impl"


    // $ANTLR start "rule__Xmod_Exception__Group__0"
    // InternalSpice.g:5641:1: rule__Xmod_Exception__Group__0 : rule__Xmod_Exception__Group__0__Impl rule__Xmod_Exception__Group__1 ;
    public final void rule__Xmod_Exception__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5645:1: ( rule__Xmod_Exception__Group__0__Impl rule__Xmod_Exception__Group__1 )
            // InternalSpice.g:5646:2: rule__Xmod_Exception__Group__0__Impl rule__Xmod_Exception__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__Xmod_Exception__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Xmod_Exception__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_Exception__Group__0"


    // $ANTLR start "rule__Xmod_Exception__Group__0__Impl"
    // InternalSpice.g:5653:1: rule__Xmod_Exception__Group__0__Impl : ( 'onError' ) ;
    public final void rule__Xmod_Exception__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5657:1: ( ( 'onError' ) )
            // InternalSpice.g:5658:1: ( 'onError' )
            {
            // InternalSpice.g:5658:1: ( 'onError' )
            // InternalSpice.g:5659:2: 'onError'
            {
             before(grammarAccess.getXmod_ExceptionAccess().getOnErrorKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getXmod_ExceptionAccess().getOnErrorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_Exception__Group__0__Impl"


    // $ANTLR start "rule__Xmod_Exception__Group__1"
    // InternalSpice.g:5668:1: rule__Xmod_Exception__Group__1 : rule__Xmod_Exception__Group__1__Impl rule__Xmod_Exception__Group__2 ;
    public final void rule__Xmod_Exception__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5672:1: ( rule__Xmod_Exception__Group__1__Impl rule__Xmod_Exception__Group__2 )
            // InternalSpice.g:5673:2: rule__Xmod_Exception__Group__1__Impl rule__Xmod_Exception__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__Xmod_Exception__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Xmod_Exception__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_Exception__Group__1"


    // $ANTLR start "rule__Xmod_Exception__Group__1__Impl"
    // InternalSpice.g:5680:1: rule__Xmod_Exception__Group__1__Impl : ( ( rule__Xmod_Exception__Alternatives_1 ) ) ;
    public final void rule__Xmod_Exception__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5684:1: ( ( ( rule__Xmod_Exception__Alternatives_1 ) ) )
            // InternalSpice.g:5685:1: ( ( rule__Xmod_Exception__Alternatives_1 ) )
            {
            // InternalSpice.g:5685:1: ( ( rule__Xmod_Exception__Alternatives_1 ) )
            // InternalSpice.g:5686:2: ( rule__Xmod_Exception__Alternatives_1 )
            {
             before(grammarAccess.getXmod_ExceptionAccess().getAlternatives_1()); 
            // InternalSpice.g:5687:2: ( rule__Xmod_Exception__Alternatives_1 )
            // InternalSpice.g:5687:3: rule__Xmod_Exception__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Xmod_Exception__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getXmod_ExceptionAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_Exception__Group__1__Impl"


    // $ANTLR start "rule__Xmod_Exception__Group__2"
    // InternalSpice.g:5695:1: rule__Xmod_Exception__Group__2 : rule__Xmod_Exception__Group__2__Impl rule__Xmod_Exception__Group__3 ;
    public final void rule__Xmod_Exception__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5699:1: ( rule__Xmod_Exception__Group__2__Impl rule__Xmod_Exception__Group__3 )
            // InternalSpice.g:5700:2: rule__Xmod_Exception__Group__2__Impl rule__Xmod_Exception__Group__3
            {
            pushFollow(FOLLOW_40);
            rule__Xmod_Exception__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Xmod_Exception__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_Exception__Group__2"


    // $ANTLR start "rule__Xmod_Exception__Group__2__Impl"
    // InternalSpice.g:5707:1: rule__Xmod_Exception__Group__2__Impl : ( ( rule__Xmod_Exception__Group_2__0 )? ) ;
    public final void rule__Xmod_Exception__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5711:1: ( ( ( rule__Xmod_Exception__Group_2__0 )? ) )
            // InternalSpice.g:5712:1: ( ( rule__Xmod_Exception__Group_2__0 )? )
            {
            // InternalSpice.g:5712:1: ( ( rule__Xmod_Exception__Group_2__0 )? )
            // InternalSpice.g:5713:2: ( rule__Xmod_Exception__Group_2__0 )?
            {
             before(grammarAccess.getXmod_ExceptionAccess().getGroup_2()); 
            // InternalSpice.g:5714:2: ( rule__Xmod_Exception__Group_2__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==46) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalSpice.g:5714:3: rule__Xmod_Exception__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Xmod_Exception__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXmod_ExceptionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_Exception__Group__2__Impl"


    // $ANTLR start "rule__Xmod_Exception__Group__3"
    // InternalSpice.g:5722:1: rule__Xmod_Exception__Group__3 : rule__Xmod_Exception__Group__3__Impl rule__Xmod_Exception__Group__4 ;
    public final void rule__Xmod_Exception__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5726:1: ( rule__Xmod_Exception__Group__3__Impl rule__Xmod_Exception__Group__4 )
            // InternalSpice.g:5727:2: rule__Xmod_Exception__Group__3__Impl rule__Xmod_Exception__Group__4
            {
            pushFollow(FOLLOW_41);
            rule__Xmod_Exception__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Xmod_Exception__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_Exception__Group__3"


    // $ANTLR start "rule__Xmod_Exception__Group__3__Impl"
    // InternalSpice.g:5734:1: rule__Xmod_Exception__Group__3__Impl : ( 'then' ) ;
    public final void rule__Xmod_Exception__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5738:1: ( ( 'then' ) )
            // InternalSpice.g:5739:1: ( 'then' )
            {
            // InternalSpice.g:5739:1: ( 'then' )
            // InternalSpice.g:5740:2: 'then'
            {
             before(grammarAccess.getXmod_ExceptionAccess().getThenKeyword_3()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getXmod_ExceptionAccess().getThenKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_Exception__Group__3__Impl"


    // $ANTLR start "rule__Xmod_Exception__Group__4"
    // InternalSpice.g:5749:1: rule__Xmod_Exception__Group__4 : rule__Xmod_Exception__Group__4__Impl ;
    public final void rule__Xmod_Exception__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5753:1: ( rule__Xmod_Exception__Group__4__Impl )
            // InternalSpice.g:5754:2: rule__Xmod_Exception__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Xmod_Exception__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_Exception__Group__4"


    // $ANTLR start "rule__Xmod_Exception__Group__4__Impl"
    // InternalSpice.g:5760:1: rule__Xmod_Exception__Group__4__Impl : ( ( rule__Xmod_Exception__ReactionAssignment_4 ) ) ;
    public final void rule__Xmod_Exception__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5764:1: ( ( ( rule__Xmod_Exception__ReactionAssignment_4 ) ) )
            // InternalSpice.g:5765:1: ( ( rule__Xmod_Exception__ReactionAssignment_4 ) )
            {
            // InternalSpice.g:5765:1: ( ( rule__Xmod_Exception__ReactionAssignment_4 ) )
            // InternalSpice.g:5766:2: ( rule__Xmod_Exception__ReactionAssignment_4 )
            {
             before(grammarAccess.getXmod_ExceptionAccess().getReactionAssignment_4()); 
            // InternalSpice.g:5767:2: ( rule__Xmod_Exception__ReactionAssignment_4 )
            // InternalSpice.g:5767:3: rule__Xmod_Exception__ReactionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Xmod_Exception__ReactionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getXmod_ExceptionAccess().getReactionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_Exception__Group__4__Impl"


    // $ANTLR start "rule__Xmod_Exception__Group_1_1__0"
    // InternalSpice.g:5776:1: rule__Xmod_Exception__Group_1_1__0 : rule__Xmod_Exception__Group_1_1__0__Impl rule__Xmod_Exception__Group_1_1__1 ;
    public final void rule__Xmod_Exception__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5780:1: ( rule__Xmod_Exception__Group_1_1__0__Impl rule__Xmod_Exception__Group_1_1__1 )
            // InternalSpice.g:5781:2: rule__Xmod_Exception__Group_1_1__0__Impl rule__Xmod_Exception__Group_1_1__1
            {
            pushFollow(FOLLOW_5);
            rule__Xmod_Exception__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Xmod_Exception__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_Exception__Group_1_1__0"


    // $ANTLR start "rule__Xmod_Exception__Group_1_1__0__Impl"
    // InternalSpice.g:5788:1: rule__Xmod_Exception__Group_1_1__0__Impl : ( ( rule__Xmod_Exception__KindAssignment_1_1_0 ) ) ;
    public final void rule__Xmod_Exception__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5792:1: ( ( ( rule__Xmod_Exception__KindAssignment_1_1_0 ) ) )
            // InternalSpice.g:5793:1: ( ( rule__Xmod_Exception__KindAssignment_1_1_0 ) )
            {
            // InternalSpice.g:5793:1: ( ( rule__Xmod_Exception__KindAssignment_1_1_0 ) )
            // InternalSpice.g:5794:2: ( rule__Xmod_Exception__KindAssignment_1_1_0 )
            {
             before(grammarAccess.getXmod_ExceptionAccess().getKindAssignment_1_1_0()); 
            // InternalSpice.g:5795:2: ( rule__Xmod_Exception__KindAssignment_1_1_0 )
            // InternalSpice.g:5795:3: rule__Xmod_Exception__KindAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Xmod_Exception__KindAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getXmod_ExceptionAccess().getKindAssignment_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_Exception__Group_1_1__0__Impl"


    // $ANTLR start "rule__Xmod_Exception__Group_1_1__1"
    // InternalSpice.g:5803:1: rule__Xmod_Exception__Group_1_1__1 : rule__Xmod_Exception__Group_1_1__1__Impl rule__Xmod_Exception__Group_1_1__2 ;
    public final void rule__Xmod_Exception__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5807:1: ( rule__Xmod_Exception__Group_1_1__1__Impl rule__Xmod_Exception__Group_1_1__2 )
            // InternalSpice.g:5808:2: rule__Xmod_Exception__Group_1_1__1__Impl rule__Xmod_Exception__Group_1_1__2
            {
            pushFollow(FOLLOW_4);
            rule__Xmod_Exception__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Xmod_Exception__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_Exception__Group_1_1__1"


    // $ANTLR start "rule__Xmod_Exception__Group_1_1__1__Impl"
    // InternalSpice.g:5815:1: rule__Xmod_Exception__Group_1_1__1__Impl : ( '(' ) ;
    public final void rule__Xmod_Exception__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5819:1: ( ( '(' ) )
            // InternalSpice.g:5820:1: ( '(' )
            {
            // InternalSpice.g:5820:1: ( '(' )
            // InternalSpice.g:5821:2: '('
            {
             before(grammarAccess.getXmod_ExceptionAccess().getLeftParenthesisKeyword_1_1_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getXmod_ExceptionAccess().getLeftParenthesisKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_Exception__Group_1_1__1__Impl"


    // $ANTLR start "rule__Xmod_Exception__Group_1_1__2"
    // InternalSpice.g:5830:1: rule__Xmod_Exception__Group_1_1__2 : rule__Xmod_Exception__Group_1_1__2__Impl rule__Xmod_Exception__Group_1_1__3 ;
    public final void rule__Xmod_Exception__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5834:1: ( rule__Xmod_Exception__Group_1_1__2__Impl rule__Xmod_Exception__Group_1_1__3 )
            // InternalSpice.g:5835:2: rule__Xmod_Exception__Group_1_1__2__Impl rule__Xmod_Exception__Group_1_1__3
            {
            pushFollow(FOLLOW_8);
            rule__Xmod_Exception__Group_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Xmod_Exception__Group_1_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_Exception__Group_1_1__2"


    // $ANTLR start "rule__Xmod_Exception__Group_1_1__2__Impl"
    // InternalSpice.g:5842:1: rule__Xmod_Exception__Group_1_1__2__Impl : ( ( rule__Xmod_Exception__FilterAssignment_1_1_2 ) ) ;
    public final void rule__Xmod_Exception__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5846:1: ( ( ( rule__Xmod_Exception__FilterAssignment_1_1_2 ) ) )
            // InternalSpice.g:5847:1: ( ( rule__Xmod_Exception__FilterAssignment_1_1_2 ) )
            {
            // InternalSpice.g:5847:1: ( ( rule__Xmod_Exception__FilterAssignment_1_1_2 ) )
            // InternalSpice.g:5848:2: ( rule__Xmod_Exception__FilterAssignment_1_1_2 )
            {
             before(grammarAccess.getXmod_ExceptionAccess().getFilterAssignment_1_1_2()); 
            // InternalSpice.g:5849:2: ( rule__Xmod_Exception__FilterAssignment_1_1_2 )
            // InternalSpice.g:5849:3: rule__Xmod_Exception__FilterAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Xmod_Exception__FilterAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getXmod_ExceptionAccess().getFilterAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_Exception__Group_1_1__2__Impl"


    // $ANTLR start "rule__Xmod_Exception__Group_1_1__3"
    // InternalSpice.g:5857:1: rule__Xmod_Exception__Group_1_1__3 : rule__Xmod_Exception__Group_1_1__3__Impl ;
    public final void rule__Xmod_Exception__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5861:1: ( rule__Xmod_Exception__Group_1_1__3__Impl )
            // InternalSpice.g:5862:2: rule__Xmod_Exception__Group_1_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Xmod_Exception__Group_1_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_Exception__Group_1_1__3"


    // $ANTLR start "rule__Xmod_Exception__Group_1_1__3__Impl"
    // InternalSpice.g:5868:1: rule__Xmod_Exception__Group_1_1__3__Impl : ( ')' ) ;
    public final void rule__Xmod_Exception__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5872:1: ( ( ')' ) )
            // InternalSpice.g:5873:1: ( ')' )
            {
            // InternalSpice.g:5873:1: ( ')' )
            // InternalSpice.g:5874:2: ')'
            {
             before(grammarAccess.getXmod_ExceptionAccess().getRightParenthesisKeyword_1_1_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getXmod_ExceptionAccess().getRightParenthesisKeyword_1_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_Exception__Group_1_1__3__Impl"


    // $ANTLR start "rule__Xmod_Exception__Group_2__0"
    // InternalSpice.g:5884:1: rule__Xmod_Exception__Group_2__0 : rule__Xmod_Exception__Group_2__0__Impl rule__Xmod_Exception__Group_2__1 ;
    public final void rule__Xmod_Exception__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5888:1: ( rule__Xmod_Exception__Group_2__0__Impl rule__Xmod_Exception__Group_2__1 )
            // InternalSpice.g:5889:2: rule__Xmod_Exception__Group_2__0__Impl rule__Xmod_Exception__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Xmod_Exception__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Xmod_Exception__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_Exception__Group_2__0"


    // $ANTLR start "rule__Xmod_Exception__Group_2__0__Impl"
    // InternalSpice.g:5896:1: rule__Xmod_Exception__Group_2__0__Impl : ( 'call' ) ;
    public final void rule__Xmod_Exception__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5900:1: ( ( 'call' ) )
            // InternalSpice.g:5901:1: ( 'call' )
            {
            // InternalSpice.g:5901:1: ( 'call' )
            // InternalSpice.g:5902:2: 'call'
            {
             before(grammarAccess.getXmod_ExceptionAccess().getCallKeyword_2_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getXmod_ExceptionAccess().getCallKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_Exception__Group_2__0__Impl"


    // $ANTLR start "rule__Xmod_Exception__Group_2__1"
    // InternalSpice.g:5911:1: rule__Xmod_Exception__Group_2__1 : rule__Xmod_Exception__Group_2__1__Impl ;
    public final void rule__Xmod_Exception__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5915:1: ( rule__Xmod_Exception__Group_2__1__Impl )
            // InternalSpice.g:5916:2: rule__Xmod_Exception__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Xmod_Exception__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_Exception__Group_2__1"


    // $ANTLR start "rule__Xmod_Exception__Group_2__1__Impl"
    // InternalSpice.g:5922:1: rule__Xmod_Exception__Group_2__1__Impl : ( ( rule__Xmod_Exception__CalledOperationAssignment_2_1 ) ) ;
    public final void rule__Xmod_Exception__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5926:1: ( ( ( rule__Xmod_Exception__CalledOperationAssignment_2_1 ) ) )
            // InternalSpice.g:5927:1: ( ( rule__Xmod_Exception__CalledOperationAssignment_2_1 ) )
            {
            // InternalSpice.g:5927:1: ( ( rule__Xmod_Exception__CalledOperationAssignment_2_1 ) )
            // InternalSpice.g:5928:2: ( rule__Xmod_Exception__CalledOperationAssignment_2_1 )
            {
             before(grammarAccess.getXmod_ExceptionAccess().getCalledOperationAssignment_2_1()); 
            // InternalSpice.g:5929:2: ( rule__Xmod_Exception__CalledOperationAssignment_2_1 )
            // InternalSpice.g:5929:3: rule__Xmod_Exception__CalledOperationAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Xmod_Exception__CalledOperationAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getXmod_ExceptionAccess().getCalledOperationAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_Exception__Group_2__1__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalSpice.g:5938:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5942:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalSpice.g:5943:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalSpice.g:5950:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5954:1: ( ( ( '-' )? ) )
            // InternalSpice.g:5955:1: ( ( '-' )? )
            {
            // InternalSpice.g:5955:1: ( ( '-' )? )
            // InternalSpice.g:5956:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalSpice.g:5957:2: ( '-' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==49) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalSpice.g:5957:3: '-'
                    {
                    match(input,49,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalSpice.g:5965:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5969:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalSpice.g:5970:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalSpice.g:5977:1: rule__EDouble__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5981:1: ( ( RULE_INT ) )
            // InternalSpice.g:5982:1: ( RULE_INT )
            {
            // InternalSpice.g:5982:1: ( RULE_INT )
            // InternalSpice.g:5983:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // InternalSpice.g:5992:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:5996:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalSpice.g:5997:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // InternalSpice.g:6004:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6008:1: ( ( '.' ) )
            // InternalSpice.g:6009:1: ( '.' )
            {
            // InternalSpice.g:6009:1: ( '.' )
            // InternalSpice.g:6010:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // InternalSpice.g:6019:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6023:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalSpice.g:6024:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_43);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // InternalSpice.g:6031:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6035:1: ( ( RULE_INT ) )
            // InternalSpice.g:6036:1: ( RULE_INT )
            {
            // InternalSpice.g:6036:1: ( RULE_INT )
            // InternalSpice.g:6037:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // InternalSpice.g:6046:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6050:1: ( rule__EDouble__Group__4__Impl )
            // InternalSpice.g:6051:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // InternalSpice.g:6057:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6061:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalSpice.g:6062:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalSpice.g:6062:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalSpice.g:6063:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalSpice.g:6064:2: ( rule__EDouble__Group_4__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=18 && LA46_0<=19)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalSpice.g:6064:3: rule__EDouble__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // InternalSpice.g:6073:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6077:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalSpice.g:6078:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_29);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // InternalSpice.g:6085:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6089:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalSpice.g:6090:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalSpice.g:6090:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalSpice.g:6091:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalSpice.g:6092:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalSpice.g:6092:3: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // InternalSpice.g:6100:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6104:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalSpice.g:6105:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_29);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // InternalSpice.g:6112:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6116:1: ( ( ( '-' )? ) )
            // InternalSpice.g:6117:1: ( ( '-' )? )
            {
            // InternalSpice.g:6117:1: ( ( '-' )? )
            // InternalSpice.g:6118:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalSpice.g:6119:2: ( '-' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==49) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalSpice.g:6119:3: '-'
                    {
                    match(input,49,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // InternalSpice.g:6127:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6131:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalSpice.g:6132:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // InternalSpice.g:6138:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6142:1: ( ( RULE_INT ) )
            // InternalSpice.g:6143:1: ( RULE_INT )
            {
            // InternalSpice.g:6143:1: ( RULE_INT )
            // InternalSpice.g:6144:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__Simulation__Xmod_idAssignment_2"
    // InternalSpice.g:6154:1: rule__Simulation__Xmod_idAssignment_2 : ( ruleEString ) ;
    public final void rule__Simulation__Xmod_idAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6158:1: ( ( ruleEString ) )
            // InternalSpice.g:6159:2: ( ruleEString )
            {
            // InternalSpice.g:6159:2: ( ruleEString )
            // InternalSpice.g:6160:3: ruleEString
            {
             before(grammarAccess.getSimulationAccess().getXmod_idEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSimulationAccess().getXmod_idEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__Xmod_idAssignment_2"


    // $ANTLR start "rule__Simulation__StartTimeAssignment_4"
    // InternalSpice.g:6169:1: rule__Simulation__StartTimeAssignment_4 : ( ruleELong ) ;
    public final void rule__Simulation__StartTimeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6173:1: ( ( ruleELong ) )
            // InternalSpice.g:6174:2: ( ruleELong )
            {
            // InternalSpice.g:6174:2: ( ruleELong )
            // InternalSpice.g:6175:3: ruleELong
            {
             before(grammarAccess.getSimulationAccess().getStartTimeELongParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleELong();

            state._fsp--;

             after(grammarAccess.getSimulationAccess().getStartTimeELongParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__StartTimeAssignment_4"


    // $ANTLR start "rule__Simulation__EndTimeAssignment_6"
    // InternalSpice.g:6184:1: rule__Simulation__EndTimeAssignment_6 : ( ruleELong ) ;
    public final void rule__Simulation__EndTimeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6188:1: ( ( ruleELong ) )
            // InternalSpice.g:6189:2: ( ruleELong )
            {
            // InternalSpice.g:6189:2: ( ruleELong )
            // InternalSpice.g:6190:3: ruleELong
            {
             before(grammarAccess.getSimulationAccess().getEndTimeELongParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleELong();

            state._fsp--;

             after(grammarAccess.getSimulationAccess().getEndTimeELongParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__EndTimeAssignment_6"


    // $ANTLR start "rule__Simulation__DurationStepAssignment_8"
    // InternalSpice.g:6199:1: rule__Simulation__DurationStepAssignment_8 : ( ruleELong ) ;
    public final void rule__Simulation__DurationStepAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6203:1: ( ( ruleELong ) )
            // InternalSpice.g:6204:2: ( ruleELong )
            {
            // InternalSpice.g:6204:2: ( ruleELong )
            // InternalSpice.g:6205:3: ruleELong
            {
             before(grammarAccess.getSimulationAccess().getDurationStepELongParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleELong();

            state._fsp--;

             after(grammarAccess.getSimulationAccess().getDurationStepELongParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__DurationStepAssignment_8"


    // $ANTLR start "rule__Simulation__ComponentsAssignment_11_0"
    // InternalSpice.g:6214:1: rule__Simulation__ComponentsAssignment_11_0 : ( ruleComponent ) ;
    public final void rule__Simulation__ComponentsAssignment_11_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6218:1: ( ( ruleComponent ) )
            // InternalSpice.g:6219:2: ( ruleComponent )
            {
            // InternalSpice.g:6219:2: ( ruleComponent )
            // InternalSpice.g:6220:3: ruleComponent
            {
             before(grammarAccess.getSimulationAccess().getComponentsComponentParserRuleCall_11_0_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getSimulationAccess().getComponentsComponentParserRuleCall_11_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__ComponentsAssignment_11_0"


    // $ANTLR start "rule__Simulation__ComponentsAssignment_11_1"
    // InternalSpice.g:6229:1: rule__Simulation__ComponentsAssignment_11_1 : ( ruleComponent ) ;
    public final void rule__Simulation__ComponentsAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6233:1: ( ( ruleComponent ) )
            // InternalSpice.g:6234:2: ( ruleComponent )
            {
            // InternalSpice.g:6234:2: ( ruleComponent )
            // InternalSpice.g:6235:3: ruleComponent
            {
             before(grammarAccess.getSimulationAccess().getComponentsComponentParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getSimulationAccess().getComponentsComponentParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__ComponentsAssignment_11_1"


    // $ANTLR start "rule__Simulation__ViewsAssignment_12_0"
    // InternalSpice.g:6244:1: rule__Simulation__ViewsAssignment_12_0 : ( ruleView ) ;
    public final void rule__Simulation__ViewsAssignment_12_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6248:1: ( ( ruleView ) )
            // InternalSpice.g:6249:2: ( ruleView )
            {
            // InternalSpice.g:6249:2: ( ruleView )
            // InternalSpice.g:6250:3: ruleView
            {
             before(grammarAccess.getSimulationAccess().getViewsViewParserRuleCall_12_0_0()); 
            pushFollow(FOLLOW_2);
            ruleView();

            state._fsp--;

             after(grammarAccess.getSimulationAccess().getViewsViewParserRuleCall_12_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__ViewsAssignment_12_0"


    // $ANTLR start "rule__Simulation__ViewsAssignment_12_1"
    // InternalSpice.g:6259:1: rule__Simulation__ViewsAssignment_12_1 : ( ruleView ) ;
    public final void rule__Simulation__ViewsAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6263:1: ( ( ruleView ) )
            // InternalSpice.g:6264:2: ( ruleView )
            {
            // InternalSpice.g:6264:2: ( ruleView )
            // InternalSpice.g:6265:3: ruleView
            {
             before(grammarAccess.getSimulationAccess().getViewsViewParserRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleView();

            state._fsp--;

             after(grammarAccess.getSimulationAccess().getViewsViewParserRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Simulation__ViewsAssignment_12_1"


    // $ANTLR start "rule__Component__Xmod_idAssignment_2"
    // InternalSpice.g:6274:1: rule__Component__Xmod_idAssignment_2 : ( ruleEString ) ;
    public final void rule__Component__Xmod_idAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6278:1: ( ( ruleEString ) )
            // InternalSpice.g:6279:2: ( ruleEString )
            {
            // InternalSpice.g:6279:2: ( ruleEString )
            // InternalSpice.g:6280:3: ruleEString
            {
             before(grammarAccess.getComponentAccess().getXmod_idEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getXmod_idEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__Xmod_idAssignment_2"


    // $ANTLR start "rule__Component__PriorityAssignment_4"
    // InternalSpice.g:6289:1: rule__Component__PriorityAssignment_4 : ( ruleELong ) ;
    public final void rule__Component__PriorityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6293:1: ( ( ruleELong ) )
            // InternalSpice.g:6294:2: ( ruleELong )
            {
            // InternalSpice.g:6294:2: ( ruleELong )
            // InternalSpice.g:6295:3: ruleELong
            {
             before(grammarAccess.getComponentAccess().getPriorityELongParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleELong();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getPriorityELongParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__PriorityAssignment_4"


    // $ANTLR start "rule__Component__PeriodAssignment_6"
    // InternalSpice.g:6304:1: rule__Component__PeriodAssignment_6 : ( ruleELong ) ;
    public final void rule__Component__PeriodAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6308:1: ( ( ruleELong ) )
            // InternalSpice.g:6309:2: ( ruleELong )
            {
            // InternalSpice.g:6309:2: ( ruleELong )
            // InternalSpice.g:6310:3: ruleELong
            {
             before(grammarAccess.getComponentAccess().getPeriodELongParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleELong();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getPeriodELongParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__PeriodAssignment_6"


    // $ANTLR start "rule__Component__IsDataFlowAssignment_8"
    // InternalSpice.g:6319:1: rule__Component__IsDataFlowAssignment_8 : ( ( 'DF' ) ) ;
    public final void rule__Component__IsDataFlowAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6323:1: ( ( ( 'DF' ) ) )
            // InternalSpice.g:6324:2: ( ( 'DF' ) )
            {
            // InternalSpice.g:6324:2: ( ( 'DF' ) )
            // InternalSpice.g:6325:3: ( 'DF' )
            {
             before(grammarAccess.getComponentAccess().getIsDataFlowDFKeyword_8_0()); 
            // InternalSpice.g:6326:3: ( 'DF' )
            // InternalSpice.g:6327:4: 'DF'
            {
             before(grammarAccess.getComponentAccess().getIsDataFlowDFKeyword_8_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getIsDataFlowDFKeyword_8_0()); 

            }

             after(grammarAccess.getComponentAccess().getIsDataFlowDFKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__IsDataFlowAssignment_8"


    // $ANTLR start "rule__Component__AttributesAssignment_10_0"
    // InternalSpice.g:6338:1: rule__Component__AttributesAssignment_10_0 : ( ruleAttribute ) ;
    public final void rule__Component__AttributesAssignment_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6342:1: ( ( ruleAttribute ) )
            // InternalSpice.g:6343:2: ( ruleAttribute )
            {
            // InternalSpice.g:6343:2: ( ruleAttribute )
            // InternalSpice.g:6344:3: ruleAttribute
            {
             before(grammarAccess.getComponentAccess().getAttributesAttributeParserRuleCall_10_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getAttributesAttributeParserRuleCall_10_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__AttributesAssignment_10_0"


    // $ANTLR start "rule__Component__AttributesAssignment_10_1"
    // InternalSpice.g:6353:1: rule__Component__AttributesAssignment_10_1 : ( ruleAttribute ) ;
    public final void rule__Component__AttributesAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6357:1: ( ( ruleAttribute ) )
            // InternalSpice.g:6358:2: ( ruleAttribute )
            {
            // InternalSpice.g:6358:2: ( ruleAttribute )
            // InternalSpice.g:6359:3: ruleAttribute
            {
             before(grammarAccess.getComponentAccess().getAttributesAttributeParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getAttributesAttributeParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__AttributesAssignment_10_1"


    // $ANTLR start "rule__Component__ActionsAssignment_11_0"
    // InternalSpice.g:6368:1: rule__Component__ActionsAssignment_11_0 : ( ruleXmod_Action ) ;
    public final void rule__Component__ActionsAssignment_11_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6372:1: ( ( ruleXmod_Action ) )
            // InternalSpice.g:6373:2: ( ruleXmod_Action )
            {
            // InternalSpice.g:6373:2: ( ruleXmod_Action )
            // InternalSpice.g:6374:3: ruleXmod_Action
            {
             before(grammarAccess.getComponentAccess().getActionsXmod_ActionParserRuleCall_11_0_0()); 
            pushFollow(FOLLOW_2);
            ruleXmod_Action();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getActionsXmod_ActionParserRuleCall_11_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ActionsAssignment_11_0"


    // $ANTLR start "rule__Component__ActionsAssignment_11_1"
    // InternalSpice.g:6383:1: rule__Component__ActionsAssignment_11_1 : ( ruleXmod_Action ) ;
    public final void rule__Component__ActionsAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6387:1: ( ( ruleXmod_Action ) )
            // InternalSpice.g:6388:2: ( ruleXmod_Action )
            {
            // InternalSpice.g:6388:2: ( ruleXmod_Action )
            // InternalSpice.g:6389:3: ruleXmod_Action
            {
             before(grammarAccess.getComponentAccess().getActionsXmod_ActionParserRuleCall_11_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXmod_Action();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getActionsXmod_ActionParserRuleCall_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Component__ActionsAssignment_11_1"


    // $ANTLR start "rule__View__Xmod_idAssignment_2"
    // InternalSpice.g:6398:1: rule__View__Xmod_idAssignment_2 : ( ruleEString ) ;
    public final void rule__View__Xmod_idAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6402:1: ( ( ruleEString ) )
            // InternalSpice.g:6403:2: ( ruleEString )
            {
            // InternalSpice.g:6403:2: ( ruleEString )
            // InternalSpice.g:6404:3: ruleEString
            {
             before(grammarAccess.getViewAccess().getXmod_idEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getViewAccess().getXmod_idEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__Xmod_idAssignment_2"


    // $ANTLR start "rule__View__HostAssignment_4_1"
    // InternalSpice.g:6413:1: rule__View__HostAssignment_4_1 : ( ruleEString ) ;
    public final void rule__View__HostAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6417:1: ( ( ruleEString ) )
            // InternalSpice.g:6418:2: ( ruleEString )
            {
            // InternalSpice.g:6418:2: ( ruleEString )
            // InternalSpice.g:6419:3: ruleEString
            {
             before(grammarAccess.getViewAccess().getHostEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getViewAccess().getHostEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__HostAssignment_4_1"


    // $ANTLR start "rule__View__PortAssignment_5_1"
    // InternalSpice.g:6428:1: rule__View__PortAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__View__PortAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6432:1: ( ( ruleEInt ) )
            // InternalSpice.g:6433:2: ( ruleEInt )
            {
            // InternalSpice.g:6433:2: ( ruleEInt )
            // InternalSpice.g:6434:3: ruleEInt
            {
             before(grammarAccess.getViewAccess().getPortEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getViewAccess().getPortEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__PortAssignment_5_1"


    // $ANTLR start "rule__View__PeriodAssignment_6_1"
    // InternalSpice.g:6443:1: rule__View__PeriodAssignment_6_1 : ( ruleELong ) ;
    public final void rule__View__PeriodAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6447:1: ( ( ruleELong ) )
            // InternalSpice.g:6448:2: ( ruleELong )
            {
            // InternalSpice.g:6448:2: ( ruleELong )
            // InternalSpice.g:6449:3: ruleELong
            {
             before(grammarAccess.getViewAccess().getPeriodELongParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleELong();

            state._fsp--;

             after(grammarAccess.getViewAccess().getPeriodELongParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__PeriodAssignment_6_1"


    // $ANTLR start "rule__View__ObservedTagsAssignment_7_1"
    // InternalSpice.g:6458:1: rule__View__ObservedTagsAssignment_7_1 : ( ruleEString ) ;
    public final void rule__View__ObservedTagsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6462:1: ( ( ruleEString ) )
            // InternalSpice.g:6463:2: ( ruleEString )
            {
            // InternalSpice.g:6463:2: ( ruleEString )
            // InternalSpice.g:6464:3: ruleEString
            {
             before(grammarAccess.getViewAccess().getObservedTagsEStringParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getViewAccess().getObservedTagsEStringParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__ObservedTagsAssignment_7_1"


    // $ANTLR start "rule__View__ObservedTagsAssignment_7_2_1"
    // InternalSpice.g:6473:1: rule__View__ObservedTagsAssignment_7_2_1 : ( ruleEString ) ;
    public final void rule__View__ObservedTagsAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6477:1: ( ( ruleEString ) )
            // InternalSpice.g:6478:2: ( ruleEString )
            {
            // InternalSpice.g:6478:2: ( ruleEString )
            // InternalSpice.g:6479:3: ruleEString
            {
             before(grammarAccess.getViewAccess().getObservedTagsEStringParserRuleCall_7_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getViewAccess().getObservedTagsEStringParserRuleCall_7_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__View__ObservedTagsAssignment_7_2_1"


    // $ANTLR start "rule__IntBasic__IsObservableAssignment_0"
    // InternalSpice.g:6488:1: rule__IntBasic__IsObservableAssignment_0 : ( ( 'observable' ) ) ;
    public final void rule__IntBasic__IsObservableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6492:1: ( ( ( 'observable' ) ) )
            // InternalSpice.g:6493:2: ( ( 'observable' ) )
            {
            // InternalSpice.g:6493:2: ( ( 'observable' ) )
            // InternalSpice.g:6494:3: ( 'observable' )
            {
             before(grammarAccess.getIntBasicAccess().getIsObservableObservableKeyword_0_0()); 
            // InternalSpice.g:6495:3: ( 'observable' )
            // InternalSpice.g:6496:4: 'observable'
            {
             before(grammarAccess.getIntBasicAccess().getIsObservableObservableKeyword_0_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getIntBasicAccess().getIsObservableObservableKeyword_0_0()); 

            }

             after(grammarAccess.getIntBasicAccess().getIsObservableObservableKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntBasic__IsObservableAssignment_0"


    // $ANTLR start "rule__IntBasic__TypeAssignment_1"
    // InternalSpice.g:6507:1: rule__IntBasic__TypeAssignment_1 : ( ruleEString ) ;
    public final void rule__IntBasic__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6511:1: ( ( ruleEString ) )
            // InternalSpice.g:6512:2: ( ruleEString )
            {
            // InternalSpice.g:6512:2: ( ruleEString )
            // InternalSpice.g:6513:3: ruleEString
            {
             before(grammarAccess.getIntBasicAccess().getTypeEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIntBasicAccess().getTypeEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntBasic__TypeAssignment_1"


    // $ANTLR start "rule__IntBasic__NameAssignment_2"
    // InternalSpice.g:6522:1: rule__IntBasic__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__IntBasic__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6526:1: ( ( ruleEString ) )
            // InternalSpice.g:6527:2: ( ruleEString )
            {
            // InternalSpice.g:6527:2: ( ruleEString )
            // InternalSpice.g:6528:3: ruleEString
            {
             before(grammarAccess.getIntBasicAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIntBasicAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntBasic__NameAssignment_2"


    // $ANTLR start "rule__IntBasic__ValueAssignment_4"
    // InternalSpice.g:6537:1: rule__IntBasic__ValueAssignment_4 : ( ruleEInt ) ;
    public final void rule__IntBasic__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6541:1: ( ( ruleEInt ) )
            // InternalSpice.g:6542:2: ( ruleEInt )
            {
            // InternalSpice.g:6542:2: ( ruleEInt )
            // InternalSpice.g:6543:3: ruleEInt
            {
             before(grammarAccess.getIntBasicAccess().getValueEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIntBasicAccess().getValueEIntParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntBasic__ValueAssignment_4"


    // $ANTLR start "rule__IntArray__IsObservableAssignment_0"
    // InternalSpice.g:6552:1: rule__IntArray__IsObservableAssignment_0 : ( ( 'observable' ) ) ;
    public final void rule__IntArray__IsObservableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6556:1: ( ( ( 'observable' ) ) )
            // InternalSpice.g:6557:2: ( ( 'observable' ) )
            {
            // InternalSpice.g:6557:2: ( ( 'observable' ) )
            // InternalSpice.g:6558:3: ( 'observable' )
            {
             before(grammarAccess.getIntArrayAccess().getIsObservableObservableKeyword_0_0()); 
            // InternalSpice.g:6559:3: ( 'observable' )
            // InternalSpice.g:6560:4: 'observable'
            {
             before(grammarAccess.getIntArrayAccess().getIsObservableObservableKeyword_0_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getIntArrayAccess().getIsObservableObservableKeyword_0_0()); 

            }

             after(grammarAccess.getIntArrayAccess().getIsObservableObservableKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntArray__IsObservableAssignment_0"


    // $ANTLR start "rule__IntArray__TypeAssignment_1"
    // InternalSpice.g:6571:1: rule__IntArray__TypeAssignment_1 : ( ruleEString ) ;
    public final void rule__IntArray__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6575:1: ( ( ruleEString ) )
            // InternalSpice.g:6576:2: ( ruleEString )
            {
            // InternalSpice.g:6576:2: ( ruleEString )
            // InternalSpice.g:6577:3: ruleEString
            {
             before(grammarAccess.getIntArrayAccess().getTypeEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIntArrayAccess().getTypeEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntArray__TypeAssignment_1"


    // $ANTLR start "rule__IntArray__MultiplicityAssignment_2_1"
    // InternalSpice.g:6586:1: rule__IntArray__MultiplicityAssignment_2_1 : ( ruleELong ) ;
    public final void rule__IntArray__MultiplicityAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6590:1: ( ( ruleELong ) )
            // InternalSpice.g:6591:2: ( ruleELong )
            {
            // InternalSpice.g:6591:2: ( ruleELong )
            // InternalSpice.g:6592:3: ruleELong
            {
             before(grammarAccess.getIntArrayAccess().getMultiplicityELongParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleELong();

            state._fsp--;

             after(grammarAccess.getIntArrayAccess().getMultiplicityELongParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntArray__MultiplicityAssignment_2_1"


    // $ANTLR start "rule__IntArray__NameAssignment_3"
    // InternalSpice.g:6601:1: rule__IntArray__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__IntArray__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6605:1: ( ( ruleEString ) )
            // InternalSpice.g:6606:2: ( ruleEString )
            {
            // InternalSpice.g:6606:2: ( ruleEString )
            // InternalSpice.g:6607:3: ruleEString
            {
             before(grammarAccess.getIntArrayAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getIntArrayAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntArray__NameAssignment_3"


    // $ANTLR start "rule__IntArray__ValueAssignment_5_1"
    // InternalSpice.g:6616:1: rule__IntArray__ValueAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__IntArray__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6620:1: ( ( ruleEInt ) )
            // InternalSpice.g:6621:2: ( ruleEInt )
            {
            // InternalSpice.g:6621:2: ( ruleEInt )
            // InternalSpice.g:6622:3: ruleEInt
            {
             before(grammarAccess.getIntArrayAccess().getValueEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIntArrayAccess().getValueEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntArray__ValueAssignment_5_1"


    // $ANTLR start "rule__IntArray__ValueAssignment_5_3"
    // InternalSpice.g:6631:1: rule__IntArray__ValueAssignment_5_3 : ( ruleEInt ) ;
    public final void rule__IntArray__ValueAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6635:1: ( ( ruleEInt ) )
            // InternalSpice.g:6636:2: ( ruleEInt )
            {
            // InternalSpice.g:6636:2: ( ruleEInt )
            // InternalSpice.g:6637:3: ruleEInt
            {
             before(grammarAccess.getIntArrayAccess().getValueEIntParserRuleCall_5_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIntArrayAccess().getValueEIntParserRuleCall_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntArray__ValueAssignment_5_3"


    // $ANTLR start "rule__IntArray__ValueAssignment_5_4_1"
    // InternalSpice.g:6646:1: rule__IntArray__ValueAssignment_5_4_1 : ( ruleEInt ) ;
    public final void rule__IntArray__ValueAssignment_5_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6650:1: ( ( ruleEInt ) )
            // InternalSpice.g:6651:2: ( ruleEInt )
            {
            // InternalSpice.g:6651:2: ( ruleEInt )
            // InternalSpice.g:6652:3: ruleEInt
            {
             before(grammarAccess.getIntArrayAccess().getValueEIntParserRuleCall_5_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getIntArrayAccess().getValueEIntParserRuleCall_5_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntArray__ValueAssignment_5_4_1"


    // $ANTLR start "rule__DoubleBasic__IsObservableAssignment_0"
    // InternalSpice.g:6661:1: rule__DoubleBasic__IsObservableAssignment_0 : ( ( 'observable' ) ) ;
    public final void rule__DoubleBasic__IsObservableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6665:1: ( ( ( 'observable' ) ) )
            // InternalSpice.g:6666:2: ( ( 'observable' ) )
            {
            // InternalSpice.g:6666:2: ( ( 'observable' ) )
            // InternalSpice.g:6667:3: ( 'observable' )
            {
             before(grammarAccess.getDoubleBasicAccess().getIsObservableObservableKeyword_0_0()); 
            // InternalSpice.g:6668:3: ( 'observable' )
            // InternalSpice.g:6669:4: 'observable'
            {
             before(grammarAccess.getDoubleBasicAccess().getIsObservableObservableKeyword_0_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getDoubleBasicAccess().getIsObservableObservableKeyword_0_0()); 

            }

             after(grammarAccess.getDoubleBasicAccess().getIsObservableObservableKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleBasic__IsObservableAssignment_0"


    // $ANTLR start "rule__DoubleBasic__TypeAssignment_1"
    // InternalSpice.g:6680:1: rule__DoubleBasic__TypeAssignment_1 : ( ruleEString ) ;
    public final void rule__DoubleBasic__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6684:1: ( ( ruleEString ) )
            // InternalSpice.g:6685:2: ( ruleEString )
            {
            // InternalSpice.g:6685:2: ( ruleEString )
            // InternalSpice.g:6686:3: ruleEString
            {
             before(grammarAccess.getDoubleBasicAccess().getTypeEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDoubleBasicAccess().getTypeEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleBasic__TypeAssignment_1"


    // $ANTLR start "rule__DoubleBasic__NameAssignment_2"
    // InternalSpice.g:6695:1: rule__DoubleBasic__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__DoubleBasic__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6699:1: ( ( ruleEString ) )
            // InternalSpice.g:6700:2: ( ruleEString )
            {
            // InternalSpice.g:6700:2: ( ruleEString )
            // InternalSpice.g:6701:3: ruleEString
            {
             before(grammarAccess.getDoubleBasicAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDoubleBasicAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleBasic__NameAssignment_2"


    // $ANTLR start "rule__DoubleBasic__ValueAssignment_4"
    // InternalSpice.g:6710:1: rule__DoubleBasic__ValueAssignment_4 : ( ruleEDouble ) ;
    public final void rule__DoubleBasic__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6714:1: ( ( ruleEDouble ) )
            // InternalSpice.g:6715:2: ( ruleEDouble )
            {
            // InternalSpice.g:6715:2: ( ruleEDouble )
            // InternalSpice.g:6716:3: ruleEDouble
            {
             before(grammarAccess.getDoubleBasicAccess().getValueEDoubleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getDoubleBasicAccess().getValueEDoubleParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleBasic__ValueAssignment_4"


    // $ANTLR start "rule__DoubleArray__IsObservableAssignment_0"
    // InternalSpice.g:6725:1: rule__DoubleArray__IsObservableAssignment_0 : ( ( 'observable' ) ) ;
    public final void rule__DoubleArray__IsObservableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6729:1: ( ( ( 'observable' ) ) )
            // InternalSpice.g:6730:2: ( ( 'observable' ) )
            {
            // InternalSpice.g:6730:2: ( ( 'observable' ) )
            // InternalSpice.g:6731:3: ( 'observable' )
            {
             before(grammarAccess.getDoubleArrayAccess().getIsObservableObservableKeyword_0_0()); 
            // InternalSpice.g:6732:3: ( 'observable' )
            // InternalSpice.g:6733:4: 'observable'
            {
             before(grammarAccess.getDoubleArrayAccess().getIsObservableObservableKeyword_0_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getDoubleArrayAccess().getIsObservableObservableKeyword_0_0()); 

            }

             after(grammarAccess.getDoubleArrayAccess().getIsObservableObservableKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleArray__IsObservableAssignment_0"


    // $ANTLR start "rule__DoubleArray__TypeAssignment_1"
    // InternalSpice.g:6744:1: rule__DoubleArray__TypeAssignment_1 : ( ruleEString ) ;
    public final void rule__DoubleArray__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6748:1: ( ( ruleEString ) )
            // InternalSpice.g:6749:2: ( ruleEString )
            {
            // InternalSpice.g:6749:2: ( ruleEString )
            // InternalSpice.g:6750:3: ruleEString
            {
             before(grammarAccess.getDoubleArrayAccess().getTypeEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDoubleArrayAccess().getTypeEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleArray__TypeAssignment_1"


    // $ANTLR start "rule__DoubleArray__MultiplicityAssignment_2_1"
    // InternalSpice.g:6759:1: rule__DoubleArray__MultiplicityAssignment_2_1 : ( ruleELong ) ;
    public final void rule__DoubleArray__MultiplicityAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6763:1: ( ( ruleELong ) )
            // InternalSpice.g:6764:2: ( ruleELong )
            {
            // InternalSpice.g:6764:2: ( ruleELong )
            // InternalSpice.g:6765:3: ruleELong
            {
             before(grammarAccess.getDoubleArrayAccess().getMultiplicityELongParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleELong();

            state._fsp--;

             after(grammarAccess.getDoubleArrayAccess().getMultiplicityELongParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleArray__MultiplicityAssignment_2_1"


    // $ANTLR start "rule__DoubleArray__NameAssignment_3"
    // InternalSpice.g:6774:1: rule__DoubleArray__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__DoubleArray__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6778:1: ( ( ruleEString ) )
            // InternalSpice.g:6779:2: ( ruleEString )
            {
            // InternalSpice.g:6779:2: ( ruleEString )
            // InternalSpice.g:6780:3: ruleEString
            {
             before(grammarAccess.getDoubleArrayAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDoubleArrayAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleArray__NameAssignment_3"


    // $ANTLR start "rule__DoubleArray__ValueAssignment_5_1"
    // InternalSpice.g:6789:1: rule__DoubleArray__ValueAssignment_5_1 : ( ruleEDouble ) ;
    public final void rule__DoubleArray__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6793:1: ( ( ruleEDouble ) )
            // InternalSpice.g:6794:2: ( ruleEDouble )
            {
            // InternalSpice.g:6794:2: ( ruleEDouble )
            // InternalSpice.g:6795:3: ruleEDouble
            {
             before(grammarAccess.getDoubleArrayAccess().getValueEDoubleParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getDoubleArrayAccess().getValueEDoubleParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleArray__ValueAssignment_5_1"


    // $ANTLR start "rule__DoubleArray__ValueAssignment_5_3"
    // InternalSpice.g:6804:1: rule__DoubleArray__ValueAssignment_5_3 : ( ruleEDouble ) ;
    public final void rule__DoubleArray__ValueAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6808:1: ( ( ruleEDouble ) )
            // InternalSpice.g:6809:2: ( ruleEDouble )
            {
            // InternalSpice.g:6809:2: ( ruleEDouble )
            // InternalSpice.g:6810:3: ruleEDouble
            {
             before(grammarAccess.getDoubleArrayAccess().getValueEDoubleParserRuleCall_5_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getDoubleArrayAccess().getValueEDoubleParserRuleCall_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleArray__ValueAssignment_5_3"


    // $ANTLR start "rule__DoubleArray__ValueAssignment_5_4_1"
    // InternalSpice.g:6819:1: rule__DoubleArray__ValueAssignment_5_4_1 : ( ruleEDouble ) ;
    public final void rule__DoubleArray__ValueAssignment_5_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6823:1: ( ( ruleEDouble ) )
            // InternalSpice.g:6824:2: ( ruleEDouble )
            {
            // InternalSpice.g:6824:2: ( ruleEDouble )
            // InternalSpice.g:6825:3: ruleEDouble
            {
             before(grammarAccess.getDoubleArrayAccess().getValueEDoubleParserRuleCall_5_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getDoubleArrayAccess().getValueEDoubleParserRuleCall_5_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoubleArray__ValueAssignment_5_4_1"


    // $ANTLR start "rule__StringBasic__IsObservableAssignment_0"
    // InternalSpice.g:6834:1: rule__StringBasic__IsObservableAssignment_0 : ( ( 'observable' ) ) ;
    public final void rule__StringBasic__IsObservableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6838:1: ( ( ( 'observable' ) ) )
            // InternalSpice.g:6839:2: ( ( 'observable' ) )
            {
            // InternalSpice.g:6839:2: ( ( 'observable' ) )
            // InternalSpice.g:6840:3: ( 'observable' )
            {
             before(grammarAccess.getStringBasicAccess().getIsObservableObservableKeyword_0_0()); 
            // InternalSpice.g:6841:3: ( 'observable' )
            // InternalSpice.g:6842:4: 'observable'
            {
             before(grammarAccess.getStringBasicAccess().getIsObservableObservableKeyword_0_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getStringBasicAccess().getIsObservableObservableKeyword_0_0()); 

            }

             after(grammarAccess.getStringBasicAccess().getIsObservableObservableKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringBasic__IsObservableAssignment_0"


    // $ANTLR start "rule__StringBasic__TypeAssignment_1"
    // InternalSpice.g:6853:1: rule__StringBasic__TypeAssignment_1 : ( ruleEString ) ;
    public final void rule__StringBasic__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6857:1: ( ( ruleEString ) )
            // InternalSpice.g:6858:2: ( ruleEString )
            {
            // InternalSpice.g:6858:2: ( ruleEString )
            // InternalSpice.g:6859:3: ruleEString
            {
             before(grammarAccess.getStringBasicAccess().getTypeEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStringBasicAccess().getTypeEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringBasic__TypeAssignment_1"


    // $ANTLR start "rule__StringBasic__NameAssignment_2"
    // InternalSpice.g:6868:1: rule__StringBasic__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__StringBasic__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6872:1: ( ( ruleEString ) )
            // InternalSpice.g:6873:2: ( ruleEString )
            {
            // InternalSpice.g:6873:2: ( ruleEString )
            // InternalSpice.g:6874:3: ruleEString
            {
             before(grammarAccess.getStringBasicAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStringBasicAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringBasic__NameAssignment_2"


    // $ANTLR start "rule__StringBasic__ValueAssignment_4"
    // InternalSpice.g:6883:1: rule__StringBasic__ValueAssignment_4 : ( ruleEString ) ;
    public final void rule__StringBasic__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6887:1: ( ( ruleEString ) )
            // InternalSpice.g:6888:2: ( ruleEString )
            {
            // InternalSpice.g:6888:2: ( ruleEString )
            // InternalSpice.g:6889:3: ruleEString
            {
             before(grammarAccess.getStringBasicAccess().getValueEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStringBasicAccess().getValueEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringBasic__ValueAssignment_4"


    // $ANTLR start "rule__StringArray__IsObservableAssignment_0"
    // InternalSpice.g:6898:1: rule__StringArray__IsObservableAssignment_0 : ( ( 'observable' ) ) ;
    public final void rule__StringArray__IsObservableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6902:1: ( ( ( 'observable' ) ) )
            // InternalSpice.g:6903:2: ( ( 'observable' ) )
            {
            // InternalSpice.g:6903:2: ( ( 'observable' ) )
            // InternalSpice.g:6904:3: ( 'observable' )
            {
             before(grammarAccess.getStringArrayAccess().getIsObservableObservableKeyword_0_0()); 
            // InternalSpice.g:6905:3: ( 'observable' )
            // InternalSpice.g:6906:4: 'observable'
            {
             before(grammarAccess.getStringArrayAccess().getIsObservableObservableKeyword_0_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getStringArrayAccess().getIsObservableObservableKeyword_0_0()); 

            }

             after(grammarAccess.getStringArrayAccess().getIsObservableObservableKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__IsObservableAssignment_0"


    // $ANTLR start "rule__StringArray__TypeAssignment_1"
    // InternalSpice.g:6917:1: rule__StringArray__TypeAssignment_1 : ( ruleEString ) ;
    public final void rule__StringArray__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6921:1: ( ( ruleEString ) )
            // InternalSpice.g:6922:2: ( ruleEString )
            {
            // InternalSpice.g:6922:2: ( ruleEString )
            // InternalSpice.g:6923:3: ruleEString
            {
             before(grammarAccess.getStringArrayAccess().getTypeEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStringArrayAccess().getTypeEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__TypeAssignment_1"


    // $ANTLR start "rule__StringArray__MultiplicityAssignment_2_1"
    // InternalSpice.g:6932:1: rule__StringArray__MultiplicityAssignment_2_1 : ( ruleELong ) ;
    public final void rule__StringArray__MultiplicityAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6936:1: ( ( ruleELong ) )
            // InternalSpice.g:6937:2: ( ruleELong )
            {
            // InternalSpice.g:6937:2: ( ruleELong )
            // InternalSpice.g:6938:3: ruleELong
            {
             before(grammarAccess.getStringArrayAccess().getMultiplicityELongParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleELong();

            state._fsp--;

             after(grammarAccess.getStringArrayAccess().getMultiplicityELongParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__MultiplicityAssignment_2_1"


    // $ANTLR start "rule__StringArray__NameAssignment_3"
    // InternalSpice.g:6947:1: rule__StringArray__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__StringArray__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6951:1: ( ( ruleEString ) )
            // InternalSpice.g:6952:2: ( ruleEString )
            {
            // InternalSpice.g:6952:2: ( ruleEString )
            // InternalSpice.g:6953:3: ruleEString
            {
             before(grammarAccess.getStringArrayAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStringArrayAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__NameAssignment_3"


    // $ANTLR start "rule__StringArray__ValueAssignment_5_1"
    // InternalSpice.g:6962:1: rule__StringArray__ValueAssignment_5_1 : ( ruleEString ) ;
    public final void rule__StringArray__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6966:1: ( ( ruleEString ) )
            // InternalSpice.g:6967:2: ( ruleEString )
            {
            // InternalSpice.g:6967:2: ( ruleEString )
            // InternalSpice.g:6968:3: ruleEString
            {
             before(grammarAccess.getStringArrayAccess().getValueEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStringArrayAccess().getValueEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__ValueAssignment_5_1"


    // $ANTLR start "rule__StringArray__ValueAssignment_5_3"
    // InternalSpice.g:6977:1: rule__StringArray__ValueAssignment_5_3 : ( ruleEString ) ;
    public final void rule__StringArray__ValueAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6981:1: ( ( ruleEString ) )
            // InternalSpice.g:6982:2: ( ruleEString )
            {
            // InternalSpice.g:6982:2: ( ruleEString )
            // InternalSpice.g:6983:3: ruleEString
            {
             before(grammarAccess.getStringArrayAccess().getValueEStringParserRuleCall_5_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStringArrayAccess().getValueEStringParserRuleCall_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__ValueAssignment_5_3"


    // $ANTLR start "rule__StringArray__ValueAssignment_5_4_1"
    // InternalSpice.g:6992:1: rule__StringArray__ValueAssignment_5_4_1 : ( ruleEString ) ;
    public final void rule__StringArray__ValueAssignment_5_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:6996:1: ( ( ruleEString ) )
            // InternalSpice.g:6997:2: ( ruleEString )
            {
            // InternalSpice.g:6997:2: ( ruleEString )
            // InternalSpice.g:6998:3: ruleEString
            {
             before(grammarAccess.getStringArrayAccess().getValueEStringParserRuleCall_5_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStringArrayAccess().getValueEStringParserRuleCall_5_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringArray__ValueAssignment_5_4_1"


    // $ANTLR start "rule__BooleanBasic__IsObservableAssignment_0"
    // InternalSpice.g:7007:1: rule__BooleanBasic__IsObservableAssignment_0 : ( ( 'observable' ) ) ;
    public final void rule__BooleanBasic__IsObservableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:7011:1: ( ( ( 'observable' ) ) )
            // InternalSpice.g:7012:2: ( ( 'observable' ) )
            {
            // InternalSpice.g:7012:2: ( ( 'observable' ) )
            // InternalSpice.g:7013:3: ( 'observable' )
            {
             before(grammarAccess.getBooleanBasicAccess().getIsObservableObservableKeyword_0_0()); 
            // InternalSpice.g:7014:3: ( 'observable' )
            // InternalSpice.g:7015:4: 'observable'
            {
             before(grammarAccess.getBooleanBasicAccess().getIsObservableObservableKeyword_0_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getBooleanBasicAccess().getIsObservableObservableKeyword_0_0()); 

            }

             after(grammarAccess.getBooleanBasicAccess().getIsObservableObservableKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanBasic__IsObservableAssignment_0"


    // $ANTLR start "rule__BooleanBasic__TypeAssignment_1"
    // InternalSpice.g:7026:1: rule__BooleanBasic__TypeAssignment_1 : ( ruleEString ) ;
    public final void rule__BooleanBasic__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:7030:1: ( ( ruleEString ) )
            // InternalSpice.g:7031:2: ( ruleEString )
            {
            // InternalSpice.g:7031:2: ( ruleEString )
            // InternalSpice.g:7032:3: ruleEString
            {
             before(grammarAccess.getBooleanBasicAccess().getTypeEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBooleanBasicAccess().getTypeEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanBasic__TypeAssignment_1"


    // $ANTLR start "rule__BooleanBasic__NameAssignment_2"
    // InternalSpice.g:7041:1: rule__BooleanBasic__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__BooleanBasic__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:7045:1: ( ( ruleEString ) )
            // InternalSpice.g:7046:2: ( ruleEString )
            {
            // InternalSpice.g:7046:2: ( ruleEString )
            // InternalSpice.g:7047:3: ruleEString
            {
             before(grammarAccess.getBooleanBasicAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBooleanBasicAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanBasic__NameAssignment_2"


    // $ANTLR start "rule__BooleanBasic__ValueAssignment_4"
    // InternalSpice.g:7056:1: rule__BooleanBasic__ValueAssignment_4 : ( ruleEBoolean ) ;
    public final void rule__BooleanBasic__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:7060:1: ( ( ruleEBoolean ) )
            // InternalSpice.g:7061:2: ( ruleEBoolean )
            {
            // InternalSpice.g:7061:2: ( ruleEBoolean )
            // InternalSpice.g:7062:3: ruleEBoolean
            {
             before(grammarAccess.getBooleanBasicAccess().getValueEBooleanParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanBasicAccess().getValueEBooleanParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanBasic__ValueAssignment_4"


    // $ANTLR start "rule__BooleanArray__IsObservableAssignment_0"
    // InternalSpice.g:7071:1: rule__BooleanArray__IsObservableAssignment_0 : ( ( 'observable' ) ) ;
    public final void rule__BooleanArray__IsObservableAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:7075:1: ( ( ( 'observable' ) ) )
            // InternalSpice.g:7076:2: ( ( 'observable' ) )
            {
            // InternalSpice.g:7076:2: ( ( 'observable' ) )
            // InternalSpice.g:7077:3: ( 'observable' )
            {
             before(grammarAccess.getBooleanArrayAccess().getIsObservableObservableKeyword_0_0()); 
            // InternalSpice.g:7078:3: ( 'observable' )
            // InternalSpice.g:7079:4: 'observable'
            {
             before(grammarAccess.getBooleanArrayAccess().getIsObservableObservableKeyword_0_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getBooleanArrayAccess().getIsObservableObservableKeyword_0_0()); 

            }

             after(grammarAccess.getBooleanArrayAccess().getIsObservableObservableKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanArray__IsObservableAssignment_0"


    // $ANTLR start "rule__BooleanArray__TypeAssignment_1"
    // InternalSpice.g:7090:1: rule__BooleanArray__TypeAssignment_1 : ( ruleEString ) ;
    public final void rule__BooleanArray__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:7094:1: ( ( ruleEString ) )
            // InternalSpice.g:7095:2: ( ruleEString )
            {
            // InternalSpice.g:7095:2: ( ruleEString )
            // InternalSpice.g:7096:3: ruleEString
            {
             before(grammarAccess.getBooleanArrayAccess().getTypeEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBooleanArrayAccess().getTypeEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanArray__TypeAssignment_1"


    // $ANTLR start "rule__BooleanArray__MultiplicityAssignment_2_1"
    // InternalSpice.g:7105:1: rule__BooleanArray__MultiplicityAssignment_2_1 : ( ruleELong ) ;
    public final void rule__BooleanArray__MultiplicityAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:7109:1: ( ( ruleELong ) )
            // InternalSpice.g:7110:2: ( ruleELong )
            {
            // InternalSpice.g:7110:2: ( ruleELong )
            // InternalSpice.g:7111:3: ruleELong
            {
             before(grammarAccess.getBooleanArrayAccess().getMultiplicityELongParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleELong();

            state._fsp--;

             after(grammarAccess.getBooleanArrayAccess().getMultiplicityELongParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanArray__MultiplicityAssignment_2_1"


    // $ANTLR start "rule__BooleanArray__NameAssignment_3"
    // InternalSpice.g:7120:1: rule__BooleanArray__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__BooleanArray__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:7124:1: ( ( ruleEString ) )
            // InternalSpice.g:7125:2: ( ruleEString )
            {
            // InternalSpice.g:7125:2: ( ruleEString )
            // InternalSpice.g:7126:3: ruleEString
            {
             before(grammarAccess.getBooleanArrayAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBooleanArrayAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanArray__NameAssignment_3"


    // $ANTLR start "rule__BooleanArray__ValueAssignment_5_1"
    // InternalSpice.g:7135:1: rule__BooleanArray__ValueAssignment_5_1 : ( ruleEBoolean ) ;
    public final void rule__BooleanArray__ValueAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:7139:1: ( ( ruleEBoolean ) )
            // InternalSpice.g:7140:2: ( ruleEBoolean )
            {
            // InternalSpice.g:7140:2: ( ruleEBoolean )
            // InternalSpice.g:7141:3: ruleEBoolean
            {
             before(grammarAccess.getBooleanArrayAccess().getValueEBooleanParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanArrayAccess().getValueEBooleanParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanArray__ValueAssignment_5_1"


    // $ANTLR start "rule__BooleanArray__ValueAssignment_5_3"
    // InternalSpice.g:7150:1: rule__BooleanArray__ValueAssignment_5_3 : ( ruleEBoolean ) ;
    public final void rule__BooleanArray__ValueAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:7154:1: ( ( ruleEBoolean ) )
            // InternalSpice.g:7155:2: ( ruleEBoolean )
            {
            // InternalSpice.g:7155:2: ( ruleEBoolean )
            // InternalSpice.g:7156:3: ruleEBoolean
            {
             before(grammarAccess.getBooleanArrayAccess().getValueEBooleanParserRuleCall_5_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanArrayAccess().getValueEBooleanParserRuleCall_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanArray__ValueAssignment_5_3"


    // $ANTLR start "rule__BooleanArray__ValueAssignment_5_4_1"
    // InternalSpice.g:7165:1: rule__BooleanArray__ValueAssignment_5_4_1 : ( ruleEBoolean ) ;
    public final void rule__BooleanArray__ValueAssignment_5_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:7169:1: ( ( ruleEBoolean ) )
            // InternalSpice.g:7170:2: ( ruleEBoolean )
            {
            // InternalSpice.g:7170:2: ( ruleEBoolean )
            // InternalSpice.g:7171:3: ruleEBoolean
            {
             before(grammarAccess.getBooleanArrayAccess().getValueEBooleanParserRuleCall_5_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getBooleanArrayAccess().getValueEBooleanParserRuleCall_5_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanArray__ValueAssignment_5_4_1"


    // $ANTLR start "rule__Xmod_Action__NameAssignment_1"
    // InternalSpice.g:7180:1: rule__Xmod_Action__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Xmod_Action__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:7184:1: ( ( ruleEString ) )
            // InternalSpice.g:7185:2: ( ruleEString )
            {
            // InternalSpice.g:7185:2: ( ruleEString )
            // InternalSpice.g:7186:3: ruleEString
            {
             before(grammarAccess.getXmod_ActionAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getXmod_ActionAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_Action__NameAssignment_1"


    // $ANTLR start "rule__Xmod_Action__OperationsAssignment_3"
    // InternalSpice.g:7195:1: rule__Xmod_Action__OperationsAssignment_3 : ( ruleXmod_OperationCall ) ;
    public final void rule__Xmod_Action__OperationsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:7199:1: ( ( ruleXmod_OperationCall ) )
            // InternalSpice.g:7200:2: ( ruleXmod_OperationCall )
            {
            // InternalSpice.g:7200:2: ( ruleXmod_OperationCall )
            // InternalSpice.g:7201:3: ruleXmod_OperationCall
            {
             before(grammarAccess.getXmod_ActionAccess().getOperationsXmod_OperationCallParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleXmod_OperationCall();

            state._fsp--;

             after(grammarAccess.getXmod_ActionAccess().getOperationsXmod_OperationCallParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_Action__OperationsAssignment_3"


    // $ANTLR start "rule__Xmod_Action__OperationsAssignment_4"
    // InternalSpice.g:7210:1: rule__Xmod_Action__OperationsAssignment_4 : ( ruleXmod_OperationCall ) ;
    public final void rule__Xmod_Action__OperationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:7214:1: ( ( ruleXmod_OperationCall ) )
            // InternalSpice.g:7215:2: ( ruleXmod_OperationCall )
            {
            // InternalSpice.g:7215:2: ( ruleXmod_OperationCall )
            // InternalSpice.g:7216:3: ruleXmod_OperationCall
            {
             before(grammarAccess.getXmod_ActionAccess().getOperationsXmod_OperationCallParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleXmod_OperationCall();

            state._fsp--;

             after(grammarAccess.getXmod_ActionAccess().getOperationsXmod_OperationCallParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_Action__OperationsAssignment_4"


    // $ANTLR start "rule__Xmod_OperationDef__NameAssignment_0"
    // InternalSpice.g:7225:1: rule__Xmod_OperationDef__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Xmod_OperationDef__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:7229:1: ( ( ruleEString ) )
            // InternalSpice.g:7230:2: ( ruleEString )
            {
            // InternalSpice.g:7230:2: ( ruleEString )
            // InternalSpice.g:7231:3: ruleEString
            {
             before(grammarAccess.getXmod_OperationDefAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getXmod_OperationDefAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationDef__NameAssignment_0"


    // $ANTLR start "rule__Xmod_OperationDef__ParametersTagAssignment_2_0"
    // InternalSpice.g:7240:1: rule__Xmod_OperationDef__ParametersTagAssignment_2_0 : ( ruleEString ) ;
    public final void rule__Xmod_OperationDef__ParametersTagAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:7244:1: ( ( ruleEString ) )
            // InternalSpice.g:7245:2: ( ruleEString )
            {
            // InternalSpice.g:7245:2: ( ruleEString )
            // InternalSpice.g:7246:3: ruleEString
            {
             before(grammarAccess.getXmod_OperationDefAccess().getParametersTagEStringParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getXmod_OperationDefAccess().getParametersTagEStringParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationDef__ParametersTagAssignment_2_0"


    // $ANTLR start "rule__Xmod_OperationDef__ParametersTagAssignment_2_1_1"
    // InternalSpice.g:7255:1: rule__Xmod_OperationDef__ParametersTagAssignment_2_1_1 : ( ruleEString ) ;
    public final void rule__Xmod_OperationDef__ParametersTagAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:7259:1: ( ( ruleEString ) )
            // InternalSpice.g:7260:2: ( ruleEString )
            {
            // InternalSpice.g:7260:2: ( ruleEString )
            // InternalSpice.g:7261:3: ruleEString
            {
             before(grammarAccess.getXmod_OperationDefAccess().getParametersTagEStringParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getXmod_OperationDefAccess().getParametersTagEStringParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationDef__ParametersTagAssignment_2_1_1"


    // $ANTLR start "rule__Xmod_OperationDef__ObjectTagAssignment_5"
    // InternalSpice.g:7270:1: rule__Xmod_OperationDef__ObjectTagAssignment_5 : ( ruleEString ) ;
    public final void rule__Xmod_OperationDef__ObjectTagAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:7274:1: ( ( ruleEString ) )
            // InternalSpice.g:7275:2: ( ruleEString )
            {
            // InternalSpice.g:7275:2: ( ruleEString )
            // InternalSpice.g:7276:3: ruleEString
            {
             before(grammarAccess.getXmod_OperationDefAccess().getObjectTagEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getXmod_OperationDefAccess().getObjectTagEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationDef__ObjectTagAssignment_5"


    // $ANTLR start "rule__Xmod_OperationDef__ReturnTagAssignment_6_1"
    // InternalSpice.g:7285:1: rule__Xmod_OperationDef__ReturnTagAssignment_6_1 : ( ruleEString ) ;
    public final void rule__Xmod_OperationDef__ReturnTagAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:7289:1: ( ( ruleEString ) )
            // InternalSpice.g:7290:2: ( ruleEString )
            {
            // InternalSpice.g:7290:2: ( ruleEString )
            // InternalSpice.g:7291:3: ruleEString
            {
             before(grammarAccess.getXmod_OperationDefAccess().getReturnTagEStringParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getXmod_OperationDefAccess().getReturnTagEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationDef__ReturnTagAssignment_6_1"


    // $ANTLR start "rule__Xmod_OperationDef__ExceptionsAssignment_7_0"
    // InternalSpice.g:7300:1: rule__Xmod_OperationDef__ExceptionsAssignment_7_0 : ( ruleXmod_Exception ) ;
    public final void rule__Xmod_OperationDef__ExceptionsAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:7304:1: ( ( ruleXmod_Exception ) )
            // InternalSpice.g:7305:2: ( ruleXmod_Exception )
            {
            // InternalSpice.g:7305:2: ( ruleXmod_Exception )
            // InternalSpice.g:7306:3: ruleXmod_Exception
            {
             before(grammarAccess.getXmod_OperationDefAccess().getExceptionsXmod_ExceptionParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_2);
            ruleXmod_Exception();

            state._fsp--;

             after(grammarAccess.getXmod_OperationDefAccess().getExceptionsXmod_ExceptionParserRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationDef__ExceptionsAssignment_7_0"


    // $ANTLR start "rule__Xmod_OperationDef__ExceptionsAssignment_7_1"
    // InternalSpice.g:7315:1: rule__Xmod_OperationDef__ExceptionsAssignment_7_1 : ( ruleXmod_Exception ) ;
    public final void rule__Xmod_OperationDef__ExceptionsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:7319:1: ( ( ruleXmod_Exception ) )
            // InternalSpice.g:7320:2: ( ruleXmod_Exception )
            {
            // InternalSpice.g:7320:2: ( ruleXmod_Exception )
            // InternalSpice.g:7321:3: ruleXmod_Exception
            {
             before(grammarAccess.getXmod_OperationDefAccess().getExceptionsXmod_ExceptionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXmod_Exception();

            state._fsp--;

             after(grammarAccess.getXmod_OperationDefAccess().getExceptionsXmod_ExceptionParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_OperationDef__ExceptionsAssignment_7_1"


    // $ANTLR start "rule__Xmod_Exception__KindAssignment_1_0"
    // InternalSpice.g:7330:1: rule__Xmod_Exception__KindAssignment_1_0 : ( ruleXmod_ExceptionKind_Unfiltered ) ;
    public final void rule__Xmod_Exception__KindAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:7334:1: ( ( ruleXmod_ExceptionKind_Unfiltered ) )
            // InternalSpice.g:7335:2: ( ruleXmod_ExceptionKind_Unfiltered )
            {
            // InternalSpice.g:7335:2: ( ruleXmod_ExceptionKind_Unfiltered )
            // InternalSpice.g:7336:3: ruleXmod_ExceptionKind_Unfiltered
            {
             before(grammarAccess.getXmod_ExceptionAccess().getKindXmod_ExceptionKind_UnfilteredParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleXmod_ExceptionKind_Unfiltered();

            state._fsp--;

             after(grammarAccess.getXmod_ExceptionAccess().getKindXmod_ExceptionKind_UnfilteredParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_Exception__KindAssignment_1_0"


    // $ANTLR start "rule__Xmod_Exception__KindAssignment_1_1_0"
    // InternalSpice.g:7345:1: rule__Xmod_Exception__KindAssignment_1_1_0 : ( ruleXmod_ExceptionKind_Filtered ) ;
    public final void rule__Xmod_Exception__KindAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:7349:1: ( ( ruleXmod_ExceptionKind_Filtered ) )
            // InternalSpice.g:7350:2: ( ruleXmod_ExceptionKind_Filtered )
            {
            // InternalSpice.g:7350:2: ( ruleXmod_ExceptionKind_Filtered )
            // InternalSpice.g:7351:3: ruleXmod_ExceptionKind_Filtered
            {
             before(grammarAccess.getXmod_ExceptionAccess().getKindXmod_ExceptionKind_FilteredParserRuleCall_1_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleXmod_ExceptionKind_Filtered();

            state._fsp--;

             after(grammarAccess.getXmod_ExceptionAccess().getKindXmod_ExceptionKind_FilteredParserRuleCall_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_Exception__KindAssignment_1_1_0"


    // $ANTLR start "rule__Xmod_Exception__FilterAssignment_1_1_2"
    // InternalSpice.g:7360:1: rule__Xmod_Exception__FilterAssignment_1_1_2 : ( ruleEString ) ;
    public final void rule__Xmod_Exception__FilterAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:7364:1: ( ( ruleEString ) )
            // InternalSpice.g:7365:2: ( ruleEString )
            {
            // InternalSpice.g:7365:2: ( ruleEString )
            // InternalSpice.g:7366:3: ruleEString
            {
             before(grammarAccess.getXmod_ExceptionAccess().getFilterEStringParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getXmod_ExceptionAccess().getFilterEStringParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_Exception__FilterAssignment_1_1_2"


    // $ANTLR start "rule__Xmod_Exception__CalledOperationAssignment_2_1"
    // InternalSpice.g:7375:1: rule__Xmod_Exception__CalledOperationAssignment_2_1 : ( ruleXmod_OperationDef ) ;
    public final void rule__Xmod_Exception__CalledOperationAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:7379:1: ( ( ruleXmod_OperationDef ) )
            // InternalSpice.g:7380:2: ( ruleXmod_OperationDef )
            {
            // InternalSpice.g:7380:2: ( ruleXmod_OperationDef )
            // InternalSpice.g:7381:3: ruleXmod_OperationDef
            {
             before(grammarAccess.getXmod_ExceptionAccess().getCalledOperationXmod_OperationDefParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleXmod_OperationDef();

            state._fsp--;

             after(grammarAccess.getXmod_ExceptionAccess().getCalledOperationXmod_OperationDefParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_Exception__CalledOperationAssignment_2_1"


    // $ANTLR start "rule__Xmod_Exception__ReactionAssignment_4"
    // InternalSpice.g:7390:1: rule__Xmod_Exception__ReactionAssignment_4 : ( ruleXmod_ExceptionReaction ) ;
    public final void rule__Xmod_Exception__ReactionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpice.g:7394:1: ( ( ruleXmod_ExceptionReaction ) )
            // InternalSpice.g:7395:2: ( ruleXmod_ExceptionReaction )
            {
            // InternalSpice.g:7395:2: ( ruleXmod_ExceptionReaction )
            // InternalSpice.g:7396:3: ruleXmod_ExceptionReaction
            {
             before(grammarAccess.getXmod_ExceptionAccess().getReactionXmod_ExceptionReactionEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleXmod_ExceptionReaction();

            state._fsp--;

             after(grammarAccess.getXmod_ExceptionAccess().getReactionXmod_ExceptionReactionEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Xmod_Exception__ReactionAssignment_4"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\30\uffff";
    static final String dfa_2s = "\4\5\1\4\2\50\1\52\1\4\1\5\1\4\3\uffff\1\47\2\50\1\uffff\1\35\3\uffff\1\34\1\uffff";
    static final String dfa_3s = "\1\64\1\6\2\51\1\4\2\50\1\52\1\61\1\6\1\61\3\uffff\1\62\2\50\1\uffff\1\62\3\uffff\1\34\1\uffff";
    static final String dfa_4s = "\13\uffff\1\7\1\5\1\3\3\uffff\1\4\1\uffff\1\6\1\10\1\1\1\uffff\1\2";
    static final String dfa_5s = "\30\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\3\55\uffff\1\1",
            "\1\2\1\3",
            "\1\5\1\6\42\uffff\1\4",
            "\1\5\1\6\42\uffff\1\4",
            "\1\7",
            "\1\10",
            "\1\10",
            "\1\11",
            "\1\16\2\14\15\uffff\2\13\6\uffff\1\12\24\uffff\1\15",
            "\1\17\1\20",
            "\1\22\2\23\15\uffff\2\24\33\uffff\1\21",
            "",
            "",
            "",
            "\1\25\12\uffff\1\15",
            "\1\26",
            "\1\26",
            "",
            "\1\27\24\uffff\1\21",
            "",
            "",
            "",
            "\1\12",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "643:1: rule__Attribute__Alternatives : ( ( ruleIntBasic ) | ( ruleIntArray ) | ( ruleDoubleBasic ) | ( ruleDoubleArray ) | ( ruleStringBasic ) | ( ruleStringArray ) | ( ruleBooleanBasic ) | ( ruleBooleanArray ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0008000080000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0010080100000060L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0010000000000060L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0010000000000062L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000007900000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000008020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000020000000060L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0002000000000010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000400100000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000040000060L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000000000003F800L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0001400000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00000000000C0000L});

}