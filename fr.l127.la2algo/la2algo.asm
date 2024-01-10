<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="la2algo"/>
		<constant value="links"/>
		<constant value="NTransientLinkSet;"/>
		<constant value="col"/>
		<constant value="J"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="OclParametrizedType"/>
		<constant value="#native"/>
		<constant value="Collection"/>
		<constant value="J.setName(S):V"/>
		<constant value="OclSimpleType"/>
		<constant value="OclAny"/>
		<constant value="J.setElementType(J):V"/>
		<constant value="TransientLinkSet"/>
		<constant value="A.__matcher__():V"/>
		<constant value="A.__exec__():V"/>
		<constant value="self"/>
		<constant value="__resolve__"/>
		<constant value="1"/>
		<constant value="J.oclIsKindOf(J):B"/>
		<constant value="18"/>
		<constant value="NTransientLinkSet;.getLinkBySourceElement(S):QNTransientLink;"/>
		<constant value="J.oclIsUndefined():B"/>
		<constant value="15"/>
		<constant value="NTransientLink;.getTargetFromSource(J):J"/>
		<constant value="17"/>
		<constant value="30"/>
		<constant value="Sequence"/>
		<constant value="2"/>
		<constant value="A.__resolve__(J):J"/>
		<constant value="QJ.including(J):QJ"/>
		<constant value="QJ.flatten():QJ"/>
		<constant value="e"/>
		<constant value="value"/>
		<constant value="resolveTemp"/>
		<constant value="S"/>
		<constant value="NTransientLink;.getNamedTargetFromSource(JS):J"/>
		<constant value="name"/>
		<constant value="__matcher__"/>
		<constant value="A.__matchlibrairie2algorithme():V"/>
		<constant value="A.__matchAlgorithme2Algorithme():V"/>
		<constant value="__exec__"/>
		<constant value="librairie2algorithme"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applylibrairie2algorithme(NTransientLink;):V"/>
		<constant value="Algorithme2Algorithme"/>
		<constant value="A.__applyAlgorithme2Algorithme(NTransientLink;):V"/>
		<constant value="__matchlibrairie2algorithme"/>
		<constant value="Librairie"/>
		<constant value="la"/>
		<constant value="IN"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="librairie"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="catalogue"/>
		<constant value="Catalogue"/>
		<constant value="schemaAlgo"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="9:5-11:39"/>
		<constant value="__applylibrairie2algorithme"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="3"/>
		<constant value="elements"/>
		<constant value="algorithme"/>
		<constant value="10:14-10:23"/>
		<constant value="10:14-10:28"/>
		<constant value="10:7-10:28"/>
		<constant value="11:20-11:29"/>
		<constant value="11:20-11:38"/>
		<constant value="11:7-11:38"/>
		<constant value="link"/>
		<constant value="__matchAlgorithme2Algorithme"/>
		<constant value="Algorithme"/>
		<constant value="algoLA"/>
		<constant value="16:6-22:10"/>
		<constant value="__applyAlgorithme2Algorithme"/>
		<constant value="nom"/>
		<constant value="chemin"/>
		<constant value="entrees"/>
		<constant value="4"/>
		<constant value="idColonne"/>
		<constant value="CJ.including(J):CJ"/>
		<constant value="sorties"/>
		<constant value="17:10-17:16"/>
		<constant value="17:10-17:21"/>
		<constant value="17:4-17:21"/>
		<constant value="18:13-18:19"/>
		<constant value="18:13-18:26"/>
		<constant value="18:4-18:26"/>
		<constant value="19:15-19:21"/>
		<constant value="19:15-19:29"/>
		<constant value="19:49-19:57"/>
		<constant value="19:49-19:67"/>
		<constant value="19:15-19:68"/>
		<constant value="19:4-19:68"/>
		<constant value="20:15-20:21"/>
		<constant value="20:15-20:29"/>
		<constant value="20:49-20:57"/>
		<constant value="20:49-20:67"/>
		<constant value="20:15-20:68"/>
		<constant value="20:4-20:68"/>
		<constant value="entreeLA"/>
	</cp>
	<field name="1" type="2"/>
	<field name="3" type="4"/>
	<operation name="5">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<push arg="7"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="9"/>
			<pcall arg="10"/>
			<dup/>
			<push arg="11"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="12"/>
			<pcall arg="10"/>
			<pcall arg="13"/>
			<set arg="3"/>
			<getasm/>
			<push arg="14"/>
			<push arg="8"/>
			<new/>
			<set arg="1"/>
			<getasm/>
			<pcall arg="15"/>
			<getasm/>
			<pcall arg="16"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="24"/>
		</localvariabletable>
	</operation>
	<operation name="18">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
		</parameters>
		<code>
			<load arg="19"/>
			<getasm/>
			<get arg="3"/>
			<call arg="20"/>
			<if arg="21"/>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<dup/>
			<call arg="23"/>
			<if arg="24"/>
			<load arg="19"/>
			<call arg="25"/>
			<goto arg="26"/>
			<pop/>
			<load arg="19"/>
			<goto arg="27"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="19"/>
			<iterate/>
			<store arg="29"/>
			<getasm/>
			<load arg="29"/>
			<call arg="30"/>
			<call arg="31"/>
			<enditerate/>
			<call arg="32"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="33" begin="23" end="27"/>
			<lve slot="0" name="17" begin="0" end="29"/>
			<lve slot="1" name="34" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="35">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
			<parameter name="29" type="36"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<load arg="19"/>
			<load arg="29"/>
			<call arg="37"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="6"/>
			<lve slot="1" name="34" begin="0" end="6"/>
			<lve slot="2" name="38" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="39">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<pcall arg="40"/>
			<getasm/>
			<pcall arg="41"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="3"/>
		</localvariabletable>
	</operation>
	<operation name="42">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="43"/>
			<call arg="44"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="45"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="46"/>
			<call arg="44"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="47"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="33" begin="5" end="8"/>
			<lve slot="1" name="33" begin="15" end="18"/>
			<lve slot="0" name="17" begin="0" end="19"/>
		</localvariabletable>
	</operation>
	<operation name="48">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="49"/>
			<push arg="50"/>
			<findme/>
			<push arg="51"/>
			<call arg="52"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="53"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="43"/>
			<pcall arg="54"/>
			<dup/>
			<push arg="55"/>
			<load arg="19"/>
			<pcall arg="56"/>
			<dup/>
			<push arg="57"/>
			<push arg="58"/>
			<push arg="59"/>
			<new/>
			<pcall arg="60"/>
			<pusht/>
			<pcall arg="61"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="62" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="55" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="63">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="64"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="55"/>
			<call arg="65"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="57"/>
			<call arg="66"/>
			<store arg="67"/>
			<load arg="67"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="38"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="68"/>
			<call arg="30"/>
			<set arg="69"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="70" begin="11" end="11"/>
			<lne id="71" begin="11" end="12"/>
			<lne id="72" begin="9" end="14"/>
			<lne id="73" begin="17" end="17"/>
			<lne id="74" begin="17" end="18"/>
			<lne id="75" begin="15" end="20"/>
			<lne id="62" begin="8" end="21"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="57" begin="7" end="21"/>
			<lve slot="2" name="55" begin="3" end="21"/>
			<lve slot="0" name="17" begin="0" end="21"/>
			<lve slot="1" name="76" begin="0" end="21"/>
		</localvariabletable>
	</operation>
	<operation name="77">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="78"/>
			<push arg="50"/>
			<findme/>
			<push arg="51"/>
			<call arg="52"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="53"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="46"/>
			<pcall arg="54"/>
			<dup/>
			<push arg="79"/>
			<load arg="19"/>
			<pcall arg="56"/>
			<dup/>
			<push arg="69"/>
			<push arg="78"/>
			<push arg="59"/>
			<new/>
			<pcall arg="60"/>
			<pusht/>
			<pcall arg="61"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="80" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="79" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="81">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="64"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="79"/>
			<call arg="65"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="69"/>
			<call arg="66"/>
			<store arg="67"/>
			<load arg="67"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="38"/>
			<call arg="30"/>
			<set arg="82"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="83"/>
			<call arg="30"/>
			<set arg="83"/>
			<dup/>
			<getasm/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="29"/>
			<get arg="84"/>
			<iterate/>
			<store arg="85"/>
			<load arg="85"/>
			<get arg="86"/>
			<call arg="87"/>
			<enditerate/>
			<call arg="30"/>
			<set arg="84"/>
			<dup/>
			<getasm/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="29"/>
			<get arg="88"/>
			<iterate/>
			<store arg="85"/>
			<load arg="85"/>
			<get arg="86"/>
			<call arg="87"/>
			<enditerate/>
			<call arg="30"/>
			<set arg="88"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="89" begin="11" end="11"/>
			<lne id="90" begin="11" end="12"/>
			<lne id="91" begin="9" end="14"/>
			<lne id="92" begin="17" end="17"/>
			<lne id="93" begin="17" end="18"/>
			<lne id="94" begin="15" end="20"/>
			<lne id="95" begin="26" end="26"/>
			<lne id="96" begin="26" end="27"/>
			<lne id="97" begin="30" end="30"/>
			<lne id="98" begin="30" end="31"/>
			<lne id="99" begin="23" end="33"/>
			<lne id="100" begin="21" end="35"/>
			<lne id="101" begin="41" end="41"/>
			<lne id="102" begin="41" end="42"/>
			<lne id="103" begin="45" end="45"/>
			<lne id="104" begin="45" end="46"/>
			<lne id="105" begin="38" end="48"/>
			<lne id="106" begin="36" end="50"/>
			<lne id="80" begin="8" end="51"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="4" name="107" begin="29" end="32"/>
			<lve slot="4" name="107" begin="44" end="47"/>
			<lve slot="3" name="69" begin="7" end="51"/>
			<lve slot="2" name="79" begin="3" end="51"/>
			<lve slot="0" name="17" begin="0" end="51"/>
			<lve slot="1" name="76" begin="0" end="51"/>
		</localvariabletable>
	</operation>
</asm>
