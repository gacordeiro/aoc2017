package com.tutuland.aoc2017

val inputForDay1 = "892195969991735837915273868729548694237967495115412399373194562526947585337233793568278265279199883197167634791293177986152566236718332617536487236879747167999983363832257912445756887314879229925864477761357139855548522513798899853896612387146687716264599943289416326727256525173953861534244979466587895429399159924916364476319573895566795393368411672387263615582128377676293612892723762237191146714286233543514411813323197995953854871628225358543514157867372265718724276911699514971458844849349726276329135118243155698271218844347387457343656446381799296893222256198484465873714311777937421161581798189554141474236239447612421883232173914183732126332838194648583472419154369952477422666389517569944428464617457124369349242479612422673241361777576466946622932243728551273284837934497511114334421486262244982914734452113946361245377351849815584855691778894798219822463298387771923329337634394654439458564233259451453345316753241438267739439225497515276522424441532462541528195782818326918562247278496495764435386667383577543385186827269732261223156824351164841648424564925198783625721396988984481558391866483955533972212164693898955412719161648411279149413443192896864258215498543827458438871355879336892721675937111952479183496982825163456282747678364612135596373533447719867384667516572262124225585623974278833981365494628646614588114147473559138853453189448624976774641922469183942857695986376428944876851497914443873513862319484181787593572987444669767939526294424531262999564948571142342741129862311311313166798363442745792896227642881893134498151552326647933689596516859342242244584714818773791567187322217164347852843751875979415198165627534263527828414549217234322361937785185174993256753483876378332521824515977173397535784236923629636713469151526399149548322849831431526219478653861754364155275865511643923249858589466142474763778413826829226663398467569555747267195129525138917561785436449855933951538973995881954521124753369223898312843734771532342383282987422334196585128526526324291777689689492346231786335851551413876834969878"

val inputForDay2: List<List<Int>> = """121	59	141	21	120	67	58	49	22	46	56	112	53	111	104	130
1926	1910	760	2055	28	2242	146	1485	163	976	1842	1982	137	1387	162	789
4088	258	2060	1014	4420	177	4159	194	2794	4673	4092	681	174	2924	170	3548
191	407	253	192	207	425	580	231	197	382	404	472	164	571	500	216
4700	1161	168	5398	5227	5119	252	2552	4887	5060	1152	3297	847	4525	220	262
2417	992	1445	184	554	2940	209	2574	2262	1911	2923	204	2273	2760	506	157
644	155	638	78	385	408	152	360	588	618	313	126	172	220	217	161
227	1047	117	500	1445	222	29	913	190	791	230	1281	1385	226	856	1380
436	46	141	545	122	86	283	124	249	511	347	502	168	468	117	94
2949	3286	2492	2145	1615	159	663	1158	154	939	166	2867	141	324	2862	641
1394	151	90	548	767	1572	150	913	141	1646	154	1351	1506	1510	707	400
646	178	1228	1229	270	167	161	1134	193	1312	1428	131	1457	719	1288	989
1108	1042	93	140	822	124	1037	1075	125	941	1125	298	136	94	135	711
112	2429	1987	2129	2557	1827	477	100	78	634	352	1637	588	77	1624	2500
514	218	209	185	197	137	393	555	588	569	710	537	48	309	519	138
1567	3246	4194	151	3112	903	1575	134	150	4184	3718	4077	180	4307	4097	1705"""
        .split("\n")
        .map { it.split("\t")
                 .filter { it.toIntOrNull() != null }
                 .map { it.toInt() }
        }

val inputForDay3: Int = 277678

val inputForDay4: List<List<String>> = """oaoe rxeq vssdqtu xrk cjv yaoqp loo
mveua dogbam szydvri hyzk lbega abzqw xwjn wniug kwbre
npaoy uivpxwd oynpa rcdk uixpvdw
yserir iikzcm ieuroca iuwcfov rvb giti crdpdcv mxpps
spyuhgo lucasl ucllsa bymnjig yflbv nxitmlf
xlxyhwz xla mpye fvjegwg fezlfrt inetrh vhg xpvstx ydhvq
xgue cvtmh myg ontvvyw ygm oqzrdrw
srdfsjf dli kccb kauk kauk apa doefc cdffkhh cdffkhh
msizb elqiov lqn epamk onmnlst baawab ncafwaf jrataml iyzhy svycuec
wdzqpcn dkgdumv wdzqpcn qxdmwib cjsigi bgcihgh fmua
kpvbzf kpvbzf svyq flg shwtgp
ywrynt cesjtgk hsvitr brpiul lxgvvrl cesjtgk cesjtgk xuflpfn
tik mrpht gkv unqp wypscc vmwiu ldrigk okbc wztc
zpy kyzvijv bilpf etbrgk edza vuz jzgn
yoa rgppd kzpopd cffjk murcb jmt raace iwt
aobgkja drc ztkd qskxxbv lve lev rhhoqex bmd eolf ybxjr yiiut
zhjcfms fpabnu aozp delsc mge yqi eovg pwefafe
gukf iys qztqxz xhsssz pfqq slg jdbp pfqq yabztc asow ygh
fmr ijgmjrc zbhwsmx ylgccz ycydcyx hjjset
zybsr iqisbs hffmij ikby lwufzvg gwd
ruk rku kur ydurp upmebe
baqide zdijcf ezqfe ovrldez delzrov szimd irmk busim ppv zepqk mlwpl
bxlvp dxumme byaada cgyn diz
xlxr jhili bmcke nkl vuhqsn lxzb zmyuxgk qcqr tyxe
wvth gyerrd yewrta kgri yewrta
fall jpyuusu lffybb ivmtmzx alfl yjupusu
lzvcg xwnt mjyiklh vwlz qejj mjyiklh dmcwq qejj
vgutb smc yvnsbgd bxmjd qmhia krxz luhgg emnrp
uuvhtia aiuutvh brstbr tsrbrb
howd japlq lhk qtsfdq htfufj qkyywy anxxxqw jtmryw cdtajh
pksswl jprpccl wpklss yyrbo
furp pfru bftha iekamfc bixwmr sslovex
nrqobo hyb byh hby
mugix kzlbtuq hmju ysstccs hmju btsuh
hsrlhw zilj jtvto zilj fjq
lvol xic hqqdeo gmsug yqe wue vhmrq buj juv wxexdot
lqeybb odpv mttm bxqy vqbqr ylbei wyjcxco urufsuz kyq
youbiz kvrea xsfcp zaz zybiou earvk qpf
bowsref ooobtic apiushu kplpyza
hxfhoyy ybbe ceebt recegzz ftnlv ukaf gpvx opvd lqnvk ybbe ygnwa
jpbgc aahm aahm aahm
qyvheb xyb elt oaksuj dvgpmel poiowc ykgbgpz dxpit ytg
vgsv yrjo vjss kyfvim izwo yrjo vgsv
hkk xmqx crlki dtp nuh okef okef xomktit viia nuh tplhrx
bmkjclx sbwe bwes bsbnqd nqbsbd
gfwrl vocwln hsuxkz zpclb qprrvlt bkcluvs pqy sxucrla npb fensz
adjklj nyr btmav roxv jrri vqfnis gzsab ogskmaj
bvjm fer ztgfx mtp vvhps hptzrar wpy yhvmh qklfwpf edgrdts vmhhy
lngra nrlga xokqu mgq
mksdk bkkbfsq hazlai nixee vyxh hpvebeg jujoqe wkw mzpxixm
kxrkkx qivtt xsm xsm rqvgdjl jilosjs rji
xiqga rez igqxa odiilj izoiwf xgqia
aepioo krcr aepioo jhigtx krcr qubkv jgo zybyvy wbsguz
ntyscmf duwvvb kga xvaypk sfjlg daguzm kqat otj zmnki
ggxaery jazo ggxaery zevobo zux wfnd wbyd hmhmo oaakvab jsimsw
vqdnvgy qiex yqeweds yqvdvgn iqcukgc bvrc osi
esjzak krwe ivbri hnbah iuvb begybsk ctxmlym gjqi lcscum
hyxdilx tsv evckza bdbscwj jlihiqk dciuj hamd dqsm ydihxxl
lurtwhx ygwf pwhj whxtrlu zfvywxr gcrl zvl wienpqb woto
mfaektr ocvho ukfx ukfx old daqwotk pybjtiz kumkiq tmql lqou tmql
guwy ceqsyvs svteymr nrovwz tesymrv rmsveyt
pigilsu zpyiohn zpyiohn xzl pryi zpyiohn ohdz
pziqfg hhrzdr wxl zpqigf
psnmnxz oed edo deo
tkdp tkdp auozn tfyo wmp jtp wjyskeh dag ojdvw gbptp deiqi
xkr nmsbk mreiv occcvva eca bupc gvaoopu jdhr flh ptgdumz mks
dlevn vmwzws dlevn dlevn
qwx qnuqgc rtzc yvym sft wxq fhv fts nyvrfxz ydjvcq tnwz
debkk pullndo ezaibw ldnloup nllupdo wiiw nij
hng rpd aud epq opzjh jnzge
rmtauf nwinyl nwnliy pjzahm lywnin
cgiv omva fos irse uytiqu iqjo riplx capa dhdl echbyjw cutfam
fqrqmi jfrj zllh gfhhq fqrqmi mmyqv
yoepae uabuxlz jzqy yoepae sxena jzqy
bfr jlrycal ndg xejwjdp khwg wckevqb tud xljzem ntfbazf lkr
aomdwt sji sij jsi wlsvvva kgjzqj whhf
ogorbil orlgiob iorlbog xapwiqs jxb
tnn sxgdikv ynick ynick aumwthl rwhx eqxd jdbzyk kbil pmnifp dpeips
vzeoilq son olqvh jawmny
vsifce kcighpn mubl zkgwm
ncagxs ilohd lyq oqhjf nfeij qmtvf qpru tfmtaj
pfjkcpr dqrfde efqddr edqdrf
wdyygax hscx ptmro wqko ecnfkhj ywui
gdv nrnrzdc vyq vyq vesrj vyq jwxg
oqhrr daoew zpoduh zwmoss nfkh vubf xza kju rhrpt fvsc
oqp ppyq swvin mut uacwd swivn ucdaw icfj ldcujh cejl
dar bqp ajdhuej sxwt bqp tppexrh tppexrh
sitplaj xnb ldopp mqd gwtk uhnvozu ljz dqm ylzy qltf gwtjksx
eqkvncb jdp pahwje avhrer awb zqnwfhx zohmcz fitbyab
xlnel gjzviy cndpuoj jvwxs qsd kwli quisju kyoix imzg
czqjkk evyima ixpelbv eobpd wwuxxof pbxc dgj
czsigs lbdaynp amsexn aemsxn easnmx rsitdzf
xdpc xfbp lrjwlo ntnnob sbe bse
suud fws zgn kvfimsi
wnexa diexvky oemdq uasxzhq qxa kevyixd lpw unluohs
ylruxt beqvn vbenq ogsov mvftu sovog gshtb qriaxko vthgfr jwj
gmz wcjb cqjlb hijz qwuluuf xdpu jybdf ajiv xizwb
fcxos spz idg rjb uhr ert bxia urh xfxp ixba bnvxy
uxiie eixiu wgmwbj euiix qknyd wtaojk naeqfz qmhnulk uscgwxa
qwyxd jno xelqd isdjht qxz dbwnr bfzhewu opxmkgj igfiuck
ljpphwc ijzic pfsemsc mfedoxy pad wsk beqjpbj gbjr imce xumhr
causc ogypj csacu pdokc itpgjl xfx nyt yytg srhrup bontz xbalwnj
asohjj qer pfgwo qgdw wgdq
gpzvyhh tsnx tyu kswlgb whju zkkpdm bmh hdov
unux lhrn unux lhrn rxr
epq ksew pqct jib pqebafk jib pyfjy gnu pqct
anzbbs oyhm moyh mhyo
dpk zael zael mxots zfcum
aehljyc wrj lfhife xbss ztszba vlg eljycah ihffle coypll
aoqedco bogk bogk aoqedco sanwwo
udmbz yxe dft rzolgtp nwwjpti
efu qcls rtx mestnqt pkh ciekj scrv uswd oroowx lcztvt
urnwt uapni ood lzce
zjiqxt jzqxti infgde xbmi kawilp kaipwl
lsfn kxfw zgzdfq meqwql zpqqu otert
taajsho gbeoguv bpi nxeuy
dpoyzi rqlzx rqlzx udhuwjm qnu bnuma udhuwjm gfezx cbjpfp woir
mjbv isni ixjtjue fwsk ncgwpn vqnmq pivz jbmv qoakqou argval dacvksc
xxjcn amdgdhh iup hlk xxjcn elx
gyhocay ofqosv nldfqay aqu dsrz lmekze bus lmekze gfoq lmekze vkor
xidyqq bimvxu zrkg rpcdca ymg nmxkkqu gygcmp euemr
gvd ywog ywog gvd hwjzzq
byu ggpwrl lpexjcf hgy jee febgcae valcgc tcfwicu texqi lxfjepc qeraxcs
lkjejsb eonp jtsbps pfvlos neop ikwnb avzxnk
big pjgttfb eetr jobjfae odvl jheh tuz ystrh tuz tuz ige
czubaxq czubaxq pbxgs jhuopn snmhhc qwmcka xdhxfuz jhuopn eummw
xdwduc sqcano zopaco ozbbc bczob eas cbbzo
oanpgo tiav bbssup ttzchih tpb xmfnqwa ghdx uepmz fzqbx
ahha zsbdq jggv zfcjdp dzcfpj dkew jxmelbf jgsohj oghsjj
awdy plulzw gdi jiiq lod rog mrf uihaz sebk guvb
tlhwro sapaws ovlbbfh xctruk spzpzm latyy
ligaot xfhacs jvk xbnpu yuanx yvvi gjek
nfwuug nxccj dxpfvfq pvxcvy ayss lfwz wwole ewowl xceybeb efs zfwl
lzowlql armo yrlgfg kbl vudahci yav evdi ofak ysmfjk upe
qtmmqrl gxi rrhbi pydbopp yvevlq ovwwdrt mrppov lzzs yjyrxh srzo
hytkyas wpuqvf fftiso fftiso
yutais qjdbzo kewsi opy ysl zyvyoty wkp
qtbad bxfjkwa stcdk lyre tabdq yler
friyh ivp hshy ksmanzq mzdbbub ncbx mhzki friyh vyjk hshy
ijeysr aww evn ttqvshg xkd zjy honvuqy zyj quvyohn gphcir
okft smja fkto etb
pbi zhyy kyjdho mqsuyic vegocmw gdkskg kgavjag dbqh wamfijz ktihnrg
csqix soz ingra gvslgk
ugxgzqt pdn hiynufo lpfabmi rmwj uhsqoo pmlzad ferdup guzqtxg voxd
wkixiq vck vck sylv ttqcbwv ywqta vblz mhohx frv
phns ozeghgm dfodkyv iyc psnh tedotyz xqz gqbyj ydttezo kxgju mvip
chc jdjo pyq usyn vtrbnq ohnx dsxpdzn mgbc ysun mlalmu mqemyuw
qrkosx wcwcv brvbwo nvxwg bvrwob
bovt gpb rwm gpb pitttl rwm rvfzn tbo
zczkb tmpwtj kackkx yzqkzso rsg ema ereo jptvfd jptvfd flbjfii
fcdyetv jqelvx jlevqx cfvetyd
dtyp wfh rxtpwr nolbro iozrs mnshu tkesvyk pkmkf
lvecoh ohpb brlqwx immgqe dzfac bwlrxq hng clxmpd qodfyv
sjbc dsoqk dqosk iyla lqzrsgi tjgt mfxshtd ztmc
nxveg vmxf jwnub kujji aqkonjl xtit xitt
jsft pmojruo vtvjox wimrlhj rezqi rnv hjnvdka
vnl vzgltnl mry kkqf fekwjw knsrvt nct kqy infvys
jbvm igq gvcl crry ylia nbqcq ouduen jklepay
ermsf emrsf uksuvz zrnlun
ecksf dkydasw wddasky pmfhi yltmedt bdovedg vfnyoze ufcki civrjs ohozga
hvf gfqgc adbeykt jdz zmgonhi yua kifxyoy umsza ivnbvoc whnpi gtbinze
nmy fsdu myn iiw
yrkwca jkxc yrkwca yrkwca kxqtvqh
ildxc taopx spykdz dzbpcxp wzgka cbyr xpvrzbk
qqp axdmvo cmppp shx
uldyu luyud uduly rgcmugh
woc vjdpyq cwshqq tlh fzyuz cbwgp egpy sfw
adyv cnrn bhaxvx ofdbkn yxrtir cnrn
ycz ednsydc bqsdcpx adnq bydb tqy tqy vqzpy erdcnv
mouv ouiy gld stdv gwr lxlfq gdl ldg
gtx bbvr fxytm veofwp bvbr opefvw
pcf scu ovso rawtjxs kzxgnuy ifcn tvibap
ugcbob xkjgtx ugcbob ilkkx dikca wpxyq retqhlu ugcbob ylmt tigcmmm
gmnde ool qeuwc ctux
wpajwn gooy fedmjur pxiq xkyniyp xtgi eyfpc gjx
uaivt kvfyn mpsya qxu kvnyf wvoeaz mbt fkyvn
jth awxbprn kpcodj qxegybo
sfvitld mdzczg pdptzm fmz himb eutpyi mgrde gubsta tfsldvi dfistvl
piabmr fckmhrv twnlnka jyb selqflm iwcutk pvvann
uxjfm rmleg ochuj ruiq aobxbb tpuusot uhwjojw tutopus
dzj qdyxzk oan rtpz ona qkdzyx nkunr
urjydh dfreifg tmbetd aakc vdr dkdkldw xgvtfsa ivv doadb axgvstf
fdjhr ujgbj ulkm dfzh tmhx zfdh ckt ortg
obe ywwge rgqmt cfcnyt atn fdkdrwz lmb zwpe sqfoc yllxs akdlsso
ckhbu jfqhkml abenw ckp xvjy wsyhxox jzsz hqksq
tjx zlh zgyrjpe bdorry uofh hgkzl ezixges kaxlkjw ztijupu hlgkz
belj ipbygk dxe cqoyukw jnncelh ihvom qstbowu rocqsz ifiztlf fjrf nsit
vyswalv reaqae hzoqyun lbci ibqfljz cgjflqf kos
njrzfvu nxw nxw bdsgnxp
gxlgn qrx nspbvl pzuob nggxl ipak wjr lggxn zas
xkd sooef fsayaob tfsiyl
ecldvh jugto ghfpbev xzlc
rpyattn spb ajdplq eaorgi ackirxg knrap cobdeu qca pkp zkc
bhh tczwffg bhh bhh hrjx jwyu gry kkgghnx
zsav frsakbr bvzd gafr homzjw frsakbr yasgz homzjw kqa
nbd mekhfif mekhfif keuoag nbd
mzv vzm utuxhuf uufuhtx
siy tdbii qtu yrxar ruubale yrxar lsvnr yqxq ruubale
wstykuz fxnuszr tgmkw eovvrd ohheh raf degh hzoeun tiou wpt cqnw
dzbyhrv vzlbvn ncoa xfglcye ncoa sykfps ghi
lvi ilv xalhd ztejzb
zaeu diz zaeu gtdjsz fmoxgju diz uvh
zef lmkqlcs jnhgqww qsm fuatcq ixfa
wgp gvu rpmxrjh yokepvc yokepvc lywdl bbvvbf yokepvc
etjfs gjh tvmxb agovg yihn rmmh nue jfil
zgcco slios jbfodb wpthe ydvit regizw regizw qosou slios cto jfz
kmmq lnafaha ddos hrsjtxk zjch rfynx eovks
ezeuzu jfpv oinrstv vsw naoz enrcy svw jfvp kgmfwf cfisxzo
ljtv watps equf ljtv equf
axijki zotolsi ryqujrm xmhug fhz lkgaw umzokxh ktr jsdsfat trk iosoztl
vpqvvvn ydjz tcqc asffcxr rxb fyt vyham fys
agxrcxl obcncq htod ved ozesk obcncq iwqmksk fsijtg iidyy lxu ozesk
orsyqt otqrys pnaax qtrsoy
oyisc chu ahdp abhbtry kjsqve tkpux tkpux sxzu sxzu
wquw umlbwf mxzdbvb upp fopxe aub bau eritni punrpfc esnkyg
jjlzy hozskgo jjlzy aiq jjlzy sgfyhsd
ejghc ejghc ejghc igacslu
unzmg fugzotb nxkdlds ewn hydj fbr iuly oiwwkbg scnozau sfi dsishk
xuhjduu hfloaga xhuuduj mbavfkd nrnl ral erc mntev elpoqgq
seydro onpi qjey skgkiox fbdgyt xhr rhvz dpsjcj tfzd spjdcj btqn
difyxz cdm jlzsz oycm txyssd wckqshu ihya yjyb
nmrhlif wcreso chtqfov qcftvoh lqp egd erc myep plq cjdh
hcnwgkq kkrpxxj gwe xqgea kkrpxxj nxz mumqbw kwxhlz kkrpxxj otqy
rxbioyf cszah mhu mhu mhu
qpbrf jzink ojy idt nrjykzu
omnrq kkol dex eaqdmej dnpaum ynnntw ddwewsh ztcenhc zqdrq hmi
ngmqpu owmcuz gop gdbsfc nyott cdsflq ngmqpu
srus lrexy aqgkqvm tiyjm
wxa qopky glaaekv ykopq lna gyxvpx xwa hly dbvo
vqf sqrqw phxn xiw gejyzip ugg gghhugl zyqae
ylj cyolrx giim yrchuu yrchuu ylj
rixa yfusuqn yfusuqn yfusuqn
lpm gboakz ylyv gje yxu ahokxb ixwnpu hlcka cndhbbm nkmvts xdtqbc
veul zjvz regtyp njwfpm
pdlyjbn edawa xbcmyew gme yuk yek nfknzgn ehjz
rcgun ulv ntbwnvg ptf givapv bych gmxxxf iajqpb gwh ipavvg
qvpwk grbb gptdgrh sij vunv hsb uegsmt uos vkxdd
iun aagzlj elqcq vkrk awl yyt dxfhkwq hbkeht
cgf omofuz zddgwef iyosk hmou
mvjorn zseyo wpfjlac kpxb dlh ggo zgxoso txzuy jfbmv lacjpwf vha
twrsrw pxv iklzg rtfcl kfbcjix uyvowpa kfbcjix ofnsf adqm
qvi ivr plxfrg awugjh fxbv ztlljk qvi jdkfts xyq jdkfts uqwgdr
phs eimuuf lmxq wmp
laf gmuowr rplgkh orentm whor lkrhgp mjwr zapz mdqtqyq ttkfkf
fxk wdbl fjh ojqxp yvs fkx ysv ngksb
oclyxqu tpajqun vvmj twin zclk
srcwxs xiduxd tqpfc sbqybp sdtzw gizfn bpji kaolpuy
pfkmk olmsaz uffy uyff
crpazh pcrzha lew lkhcjij stfxq
nkbb rnlo icnzg rnlo ejanu mofx ujblud
abte xnjfo boz fnxzid nqfhifm jmnmsgh
lvck nfll szdgrxc nghig szdgrxc oytahh cibk szdgrxc
sduf jgv rrt spxw fdus
gplutjv ufep fuzrnj tmko zzpj cpd mvtrzq
ycdiav qvr ycdiav tjngezs mphk oykgcei ycdiav
egbkscg ksgcbeg qmw jdbj
kbgx otnfyc agouh iai lyhqd yzihyq ouagh snzhxa xyxrgz
kdpqljx rin dlxms ukdzedc duezdkc ikgplm ffk vdmie qziajdf ftfwl
prrzhj okffaot tlrxpjd aquc dbonaef enfdoab nwbtuh
vyzf ijo cdhek bvlgxt kvldmp kvldmp vfvg
zhijgyb yfkkal utb brew vfj ztiftq
kodsuol ubnbdv iozwfum ayqxgnj qkp yiiv wbkgi psi wnfa epw
iok mecjsp lccn nrb kobca wkznctc afjjlrt
yrw yhsva hgx nxjfbb
dbdj vef xjssylt hjlld bqbmx ihfmz uhij zoh opzrmy mfq
wqhcq usyfuc wqhcq pmf aryq nhvtkh
nkviwge snpfdza nadzfsp evvdnrl qled ekqs qumle myhky
rgljws kjuk txgeein ajmph pjhdy pmvr upae yfh
vmepn wekgc qfwybl midbac vmepn ddqmbu vmepn uhfccp yuh zzz gnx
hyqv fud xdc bssziiv mwo xfrsn xqehs mwo
djhr qxhfy vdjs ueoi mbmwa lkeumzd hyxfq krbyy ywvcstf wdkum xfqyh
heprtex wgxpign lvm vlm ypswfxr ggxipwn hdszz blrv ppy
fwalim sbqj zewxcaf qjsb cjgujwr uclxro wceu wmaifl rnd
gmivd spncot jxeycn notspc nzb wie ceyjxn xlam
cfujai hfvux hhtwe hfvux oputz oam
gmwu xwthnkp xwthnkp mdxa xwthnkp
shfqzi hdq uyyqjrd wczfvy wciko hdq nuywebl
dtkq qnb uzmo ypxfja cekqe cekqe tnaibc uzmo pmtnb
apdz exdze pop pvm pce hywvftx jrjezgd jkajq jcdjli
satq czv cfhyca cshnyh cshnyh rcu cshnyh
mxp ujq fmrnzxx xqv mxp
nel whnnxak lwzlre mrxq kpo pko bsa gimtzwb
okssco iuke vcnv okssco liawwc vcnv aztl
kjvq rye eawplkw qzxt jkqv bxbfyv
bphssax ylemih wsm jnpxce jgh repsyj ieypbz asx
dwivit ptcwt qwectqk ttwcp bklpa ivditw
ies knj zemmcto mczotme yanr kjdrwr mcry ndols
dqzdpg adb ulsv ulsv qux ppmoru sjcn dpihqz
akazkk kssdguo cgigktm indfh wwh kevuhv dclpjv kgtd ehjxous
spogxy jyzhag qumd brk cbu akbpjxb spie
jgyn cxbar axtkwh hktgcm cfsla xll rpauwl cgpziuh dyc brcxa
dodey dysnjxe kzmyytw tzddd cnupwmv
nqab whxkb kvc kvc jcjhywy mbbpfwj fxozlt whxkb qwz
ihmif xhjc lmfk yjrsioo uvtd qvtqsgt dqd
uvzedxd afli hkrigd lkzkzu ncki toam hoaefui
zmvywjv jsjf nrbrgt mbs yog eexuo
ukzab euwb qnkanyt lgeqf qefgl ewub
zbol bolz ilncu ciunl
hjryu qyl ajwju rplplr skbdsl xvto
ojfotbx zvta jofxtbo ejjnhi jyeiz yzeij
ivr pvrwef ivr zgnm jscgaoq hfjuzju cea hfjuzju ehszaz
yikp gul ugbniac jehm fwqxb hqbhi hlfr iyuuf vacrao fwqxb
plsjh efu napxwe jfxfjz efacqcp sythfxc sythfxc napxwe qncqc
meuf rcjzf mhluz kbrk tzjrcn omoiprl khs oyzad yuzbz
exvzzuc ckqfivf uoyidkg mwztyf wxtg uzrls gudioyk wfihpzn tdmwhf
qoovwqm bldswvy xkb yqrcluk qyrclku cluqyrk qgakbv urclhse
rmmymgg ytpqtuq ibt tmedibz tmbsdg ytpqtuq cxbnng
qkyeo frjjht vkpt ikztq avzqon diw noqzva dvkhwdt
opz usos kdqseyb cdxvve nahjc hbr rhsfm hcjna wnczls kky
sgeml uyaoe ked utxab hxqa glems wbdo kzrjsq
isp bmebt becira ixoz yeakj fmueu
jrd qyys cik bmaief zxllza rsu swvodiv ivvdsow ikpvwaj jdr qte
gzjjre tkjhdn lrqmvw gues ositymc xhfiutm
kcnble oxoh zggvo zjz auub kunoj snil zggvo lgql
yyfmd wbwmizs vmb clba bpzzjz nlt wgukoe hedlp osxz
skic mgcr chkj eiiy kdhch gcanziz dpecug fccp
jhnejy akpwbj mhrunvm wjzwyhe lwxostl gfe niuhj iuf bewur
nuursk gehzvck szm fllr bfaq ijpjp gehzvck bfaq
ecx etrsadp lyekp lxf flx tadreps
gbo wzkner hky ggoqu
yiitvf tyvifi xpnbk iiytfv
okpjxyq mmxcha pujgv ltgfdk wpporh bfle tuupth ukyyjgv vlnwhz
phbs qtpolnh udito ukx kjqsi jbwf sgkkwgm udito mwwb wihg
mces dhc qccy sxyilmb qmki dyqnr qsh aigaemz oofdw hbifiz
yyben jjklnz whwswg tox vgytp noijcv jjsa ybney eyrvg htjl vxli
detb tus rloz zymvmg zpe
usvkehi kxgvo rna scnaljd jmowud ipfkkf rxvpie nxysvj pvquagf fjhsvef
ytosun puwdoix oyc qdufuw ysunot
htw biy htw oxot oxot
xgzi nbq lxxtmt nbq lxxtmt fnzmmno
lko bdbj kcqvc torg enbfbj sbooco afjbclm dendwq
cgih ikmfn lyhzhxd ubq ixrori tofbo
glfhfzs gihsccj yic mlci slne
wdiu lhl hdlhzo voo yhqckcy axnz yqyi fyss qhvtsbc
aotbk zfokegh uax myhehay terwus hmzic fdwojh wjuwlp
ucbiex eigq qqe ifqw sxakwl xkwsal qeq
pknvybh qkrwi povvd phairw qst inklob yrryv bcuv dolvr okwe iexrpbw
kkah qrt dihygsm nly rblqvrm sxguxj yspmre
gzhhkjt uimif bssle vdiaa wkohq nrgboi htkojiw
aeb xihgva vwcjbjh lri nlwbxun sargiey uyekrc
fnnwfbj yyccaxu fhqb nlmwhc ymbqky ooljix mfijg ryykirn womn rygezi qsdwgpw
itfs udfr sitf gml
gknztly vay ypy jpid pyy mbpfmwz pfmzbwm qqec
bbhmw uus xffgd xcjzrlk kyecv zcerxe
ncpc otqzotf godtu yhcpsyw ncpc fbs
ggoiqm ofk pryqt kqdbo ktek kklhlju iqgmgo gqoimg flscx
gsgmvy tktzj kgi ikyz pthtk hxt gik
bunvugy fefqpkk juwk aent
atm tma dzyret jmuqke xbayiit jumqke
dilfw qws ldwfi lnujld ywrogk kjh adaj khmlb hkbml
veaemc xugf udpphf mydi jbvebgp ngyhly pufdph vbgepbj
vyd tisntn qmc yzal
uxdlc piw mwjnk qiar xwpspf sxktemh jmw
qhhvar pox aed bgwq doe uyktv pox vriy ndel pzx aed
tswei dtfb yhj krxu yqio wtzpm wtzpm yqio
bjzp zzp qdzdfv tzkbl nggbfqs vquqds xiud xgrkb
ffvjfwp jbzslqo ffvjfwp pchzrqv ffvjfwp pkd nlav
czepixn yurmsw ucckih qqlnxjj exipznc
xeu llc jnmp dmz pnmj stqzao
fzvu uscqp xerkzkg roivhri fzvu yiwae xguz ajpg
qdzk uyyoi cspmnc qdzk nwknfx fnngvla cbl
acg utwrv cahupdm xgat elb aemkf wmkdzj kfmae ahlrwu yxfcj
vdumh rcd rgc hpqk qeum fpgva qkhmuji rjxpuzk ommk
ztvm ntxkav ajv avj ippodg sukg bivcslu tes gdlrbnt bdlkaye xpgslef
aygsym pwq owxmx xjw
dkhykf pfqeyo lfq saoewy qldrky sdgrrcr frdqn tkfezop doo saoewy
cwof mqlscm iqxhb nnkex nxx glgpbn
noq zikmeyx yodahj ssu qqmifa plcbv rsahsd
nvc fuwiyq myv hjn rtuoq zoyp rqnt xchlrg
dziscfa nbzsuvp rbnrban cjdprp dkj zcry ckxtm
stpm ifcbmmw dpkpzo sot ydpeydw nusp nkciqa psnr
udikjfr foqnxl whq ojuspzz ddyz emdktzb gfio mnd hyb
vchdphx zkrtky ucyifqx ryzl txdixd cip aid cip
wcz ywzwpp viswpsm qfus uzopaq mhps sidjky kipvjg
wehhc rzujn urprwzw gkwzhk rhrpph xkzzl rzujn yddlb
wlhif foh rpvylg gruiqdv daih yflhbr coe yflhbr hvluddj
hfzi ffjntj fdth crkrzdr nyel nlxm cawze bfjz neixnw uygqvmw zayf
guthfwn kcinec glhaiqv rfgbi cbrm
mvqv lszqu eyjn suq lavyjbh ujivbza aianl wik noy zth
zkn ren ncoyj fppsy dwgtgqz til
ybxepr hrzcrxs zhrscxr uvpxxl eprxby vzgg
xhi zess zet mtpcu ibz nkwq cbzb etz kjjcns
kvmu rxgw xboplw enlqcxi uxysl xboplw kvmu oqxislh xeg qwhdc spsddge
dxaao ltjjn cpsvnxe core aojgu pbss nudwi
llro yoy tixzyc beim qirnb lffcr gzm
quxetbf gfpll gqyav dckhp xbfetqu xaebz xuqfteb
fblkc hsydxqt bvmwujr rak
epeohq olrwyft cmrvov fbdyxbg
uzqk pkhizw jbrnlvx aqkq mtmjmy gpcln gaqt rinrz gwis gpcln
ttkcu ttkcu mcq xao lhnxdph djj ylet atdln xao
pmwn svqktkm isopar krrfbna knrw kbm zsohxrk xlsmm knrw cmoikq etqeggc
undrw issrttk mcoe pvufl bwjwqkx jdz undrw vje
kfzqbb djpcjv ixctsvb rqsntv fcqz
agezraf ezrfaga pftdwrk slsxu axw
ezvkn smwko utdlu nizby
ygl dwtrpsh qzz cuntrr hdrn lujcx iwc bll qvjhg
jrdrvj ledrjp noqx igodve odgiev
zonvzgy ujnzj ujnzj zonvzgy ckzd
rmg lmib fdn nfd gfobw wrc iro nsz
acgxvh sdn zcef sdn jvgnmhi xitkqgy tbascbh
ykuzk ovp mikolx xxgpylt secuf yrtilra wnoypy mty lmnagx
wwmlins mxwye kjntv sadc wnvyoov rzdawl
ali ncsrq tcbjzpu oiw iimxlbp mwi hdvdl dqnicf lxit
sql vywv vycj nprzb tdqe qwvljm myhpvxy hdixbk ywqpn xvue vrno
etncz etncz czqw moz uaxbtm axlslow fhephy moz
wsriuaj umjkx mhxau luzf wmo kyx jidl ufuoz cbk
msfrvbt bxnd msfrvbt yut qwbx
rhag vfkqf rekoz buw qffvk wxs ghra
meignx dhdu xacg hmiqkd nrijc gcxa gwap lov ybtyr vol
qoqns swib mlegyjn ojdtt tvdrrhg oetg xdret nzpq
ntc zowllt dwiyht ztdeifx velaumx jfxxsqt uefmb gwn
bgykxl bykan tvvgcpa wdcsj coonage hpocfz sqmihw pnagv uozsh
wass vve ngyd yyvxmsq rsaypsa newxyc adqmbm xqsvymy ygdn idysq
ybo vpjcf tsbpc hcdszr qrxwjqr bzz tgjhkpu hgtxkt stpbc woro
ogszrg rszt owufa cohmv msygfw fud fzi lhts sfiy dfu gxsuj
fclumcq ejuj jkbu hbsv ythmpoo xdzg dkvrdue
rbf sunzzl sokgih rngqli xndnuj rbf smiea mqzpzb fwpcx smiea
uuuxchs uuuxchs fzna qlj tcjnv oghk fzna
zuiyk tbn nqma wptoecs xndgbqm mqan wmcahvm qpir
ztexf pqsc icxqsuf tkgr itnn yorg oyvqaj yoxggqk lep
ehm hysd jfv iugyt jyvh
fenjp zjtvvhb xfe dgxoah ljn ixvdyi fenjp odnlr
uosxyy euicgp lrsc euicgp mcszotm kvxrpk jfo oxu xyeiv fhdwl wbw
tsmdp gshgm kpb tlx kfznsu gglefv pkb gcnydo eavgrc rgd lgefvg
xuq svh cmzt bxxlvfm rtblxpu imuexhl lbre hqyedxa hwkgaak
hhlfj mlrdv dlsn zgcy hciiuzw uwciihz iizhcwu gwx
ukqoj kjqou hlk nfyz lusf kebvmrw ccaj ewmicq useba
jlnnl jsmox vnw ucr ggithr usqe allzc pfumkkm jlnnl
mswpbk lffjwq icc kef zlba uolrrl fqlfwj tbc
bfmra hdgczrw dgmnod afbmr fnczx
dcqrso cgbymsg jbx ofpbp rmtygip syly
yrmn wzkt lqys tzkw sqyl fxoc
wal zgjy cwnqyaf bhz dbpft owx
xnrautk dlsyot nzbohog xmzsbh soec wyy
kde jpkvbs eyzw ukgiv ggrtzcd vikgu mxqy jyh crdtgzg ebzet
psg jsykdw drpqzl qzqbge ldqpzr wsdykj lmhbldv hbognjp nqej fmxoq guuf
ueo ncedaju ijasprn rvxb mxkddl qvgdlbx bpj bpf pxewuf chvo lvrq
zlmg eciyqi xfbeoq pupyrc bfqexo ituqab pycrpu
jsk clo vqxzl aja jfbce ldov
muss tzg iksvdej zpw fxwhrv eeye fxwhrv
kjjd dzf zkppx qdwlx irudds kjgd pdrz rgogy qdwlx egx rjxldp
szjpf aouvl ehxq exqh
nzweop qlkje welkfs jqmvqi coc
ivmjzk usk auvmc vvcnwn qubihx vkms fbt udn uyto jjt kxqy
rayw ijaklcr ywra qkj qytxeh pmnfh qffvsft tyxheq
pea cqy tkg qidvx qidvx pea skgrndq
iijm xgwq zzpskl qtjezqt yqjwy dhbq
dfuv iqw iejb bjei iwq
ogrmldp xdc dcx cqhbwlp
wzwb xrjl keciql ckky litdr bmurdk anjs nyggesn ygwt svmee
bvkkzj rcr lozrw mgpwkm lwm yecsr ykl tzny aeus jmq mchopp
rsnvaa oikce angqn rnvsaa mhc
hsiov kxqpxtc rzh vjrqlx xxtkpqc wiunol qckxtpx
aosek lhi ruqgd rmr
agqvlao pvhcgz esw kwnpefs qsrvxz hgkgrs mpx odaiqi
dvqkrzf dawioo jtaco oeutol ravp apvr frjunad
wss nahhsh pfwgcfr rvvvq uqxxmhq qax vtrkfou medfj
imdyfc sez gve kgtryl kmqklg
crmg yhkpa bsfouax kyttpa who mcrbzaj kcsktxe yfv
zpw zlab pzw pwz okb
fgqlb byhkhfn qglfb ladle ifa
skr zwwjnr iub wekt biu jnrwwz
mpvt mpvt havn ztf
odqhd uxrswp ppj eztyj nxzwm fvxyadn tostwy odo abyp meqdm ktqkvh
fgufup uabd vhxem imto imto vhxem
vrpxxhi kii zwatqg nokg wesxju xplc sumte muwjj
nsse iquhoc giuv pxaa qpqn zrfk kywjr spz kgzc lfa
cjjgarr psvwoap ivijyt nfbxu ktiuy jajrgrc goyc
yrfzf wyxda gsslsy oeyve jczghf cbuwf iwnu izyrtho dyoup toizyhr vzzrr
bwqgxsr ufy cnouypd qwxbgsr efdkfe rwsblis bhvyws oodh
piqpez yhqahjp oxu qtomld
vjvpnwy kajjaim lcxmbyd fkdy ywvvnjp xcn nbwlklo
qghq mihdp vuv ocrzsw mlmkn rgnbfcm qgufcks btlulb effsrih
psazbfo vbpr efcspj yrjl pqjrfe relxjc nzzvb yviuhc
tbbhdbm uxhawtk bmdhtbb rqxrr pspjzx krtmf pnaz srcej rsjec
owikzec glvbqy jhknyuz jkaxu ldhnlpx wdp
qvuv wteohr daynue nehs gzqu porzrsk cqokye zzsbqox rqh ogxtn pskorrz
gnm grlfoon lxid isxa
jes iixswl umgbg qfixa xnecpns asm nopsmo axaopsm qahwpqd
orr auvlruu mqq uurlvua urauuvl fjrcuo mqht tkdgps tdvnhvq iezdv
txwyzy zzwk bzi etfg gtef
qyydr lllgosq qyydr lllgosq
xqm uyl ldpowm pxhi ievvvez hmhzwmr ldpowm jaw
qlvfq efgivhr rfhhu gvw bxgsrp sgbnjh ekgbp cyof rvghph nxfekia xym
lgladv ogj cir jxx msz fshf ayheu wpmke zckng vgrlv lxgmge
fcmp aabxdp hpxbb bblpy mpcf eju pnkv jxwoy hmv fgynps pbdxaa
jcrh dgg lzyiv ojop vhk vdb uinoetv
utlzcf ziizdo njffmxe uhyjxdb cztluf yjdhbxu
ubl cgz tyg nljl
slwe qaos ybcwdoh ogazkj tqh opggnzt ffrscl opggnzt izeh
evitfwb jpivmn dpnxzuf gdkx zprogl xehb
dktt kpnkizb rreq gjmosa iekdtpj rcxk eweawk qrre olv
cmcw vmw mujx mujx ypqfz
nzxcl fzwa ftcrc immendi tmxzzi hslye eibc tmxzzi
abfc jdqvk lichxx uiomtz tlq
mnkthoj nohjktm eued izmcjj
ullh wju bxfsif icnrmmj qnufw zubcnmo yewz phovhv
ndfvd gcyt wnm badaww twm jahlat ndfdv mtw xrq bechxx dnp
ceg gcxgu gnudeib utsynwx dpg wpsnp ahbbvkt wpsnp iou
wutcg congyz erkj ibtcics
xsbq lyycse qbsx ppgutls lroo tyor
hfiwoy hclhl gcwgqox ogo hlqr ultkaz yke iwohyf oog
bcl nemims udwkmlm nokck tkwny ulkihcu knwty pngamqg yxtphkn kuihlcu
nwsr enrutc eqcfb uxmdgju rfnzhsn tzk vysc
wbtki vjmkk kvjkm ibwkt sckvbv
xjxnow tli woxldj rotrtz nfkhcz ibh mla ybxldg
cwtpkhr oxywg qpwrgfm dfjpfuc kpcopa
byczby tbfkonk ytlczzf bbyczy
khuvrne rnamlgt akjtu qlx odr git xmiazr icwsxsq
jfm bneh tkdzuad bsr oruvmqq uauw zjlp gwov hot jkjbex
jjo uvk vlpy lpxd irntb uvk ehhsqv fxhvt jjo fpa
qrwu mgnw hvflf ytspp mco ikvbqg fflvh wts cbbf"""
        .split("\n")
        .map { it.split(" ") }

fun inputForDay5(): MutableList<Int> =
"""2
0
-1
2
-2
-3
1
-2
0
-8
-1
-7
-8
-11
-7
-8
-7
2
-4
-4
-6
-9
0
-20
-7
-16
-10
-25
-3
-17
0
2
0
-29
-25
-8
-2
-19
0
-38
-29
-5
-24
2
-1
-30
0
-28
-43
-22
1
-12
-23
-23
-41
-12
-51
-56
-1
-57
-29
-32
-29
-55
1
-28
-29
-49
-56
-13
-67
-40
-10
-44
-32
-37
-49
-37
-72
-54
-22
-24
-31
-26
-45
-45
-45
-23
-41
-85
-2
-90
-31
-47
-81
-40
-43
-51
-61
-41
-64
-60
-5
-29
-18
-104
-70
-68
-53
-17
-58
-107
1
-39
-36
-107
-99
-60
-13
-71
-117
-91
-117
-36
-102
-29
-23
1
-90
-69
-10
-28
-94
-92
-13
-121
-57
-16
-27
-77
-81
-45
-79
-49
-6
-14
0
-122
-87
-75
-67
-43
-113
-149
-144
-48
-6
-104
-155
-136
-85
-136
-157
-149
-25
-18
-61
-67
-34
-108
-129
-102
-9
-145
-95
-21
-144
-21
-92
-135
-121
-67
-64
0
-74
-175
-105
-120
-169
-35
-41
-92
-51
-76
-63
-184
-163
-189
-43
-58
-84
-27
-147
-147
-54
-26
-106
-83
-58
-55
-124
-145
-76
-81
-97
-88
-105
-76
0
-84
-50
-106
-105
-153
-75
-15
-40
-156
-125
-109
-17
-147
-180
-156
-94
-201
-49
-187
-13
-9
-196
-108
-120
-94
-27
-96
-68
-128
-67
-181
0
-231
-125
-33
-241
-194
-255
-41
-7
-146
-135
-70
-157
-232
-21
-153
-182
-130
-263
-222
-137
-176
-192
-84
-91
-154
-83
-69
-94
-90
-112
-44
-52
-193
-240
-5
-140
-156
-185
-176
-221
-180
-60
-71
-155
-238
-28
-165
-265
-22
-176
-89
-174
-289
-52
-110
-84
-54
-53
-250
-189
-109
-227
-309
-93
-173
-171
-168
-278
-196
-103
-130
-49
-321
-105
-1
-219
0
-81
-62
-55
-250
-257
-223
-22
-67
-55
-12
-106
-169
-243
-17
-308
-181
-310
-220
-232
-83
-12
-126
-265
-84
-273
-264
-253
-289
-119
-58
-195
-184
-340
-230
-5
-283
-68
-137
-41
-31
-210
-97
-354
-79
-267
-340
-235
-340
-82
-166
-225
-95
-68
-130
-14
-218
-239
-115
-40
-10
-20
-381
-58
-10
-328
-323
-133
-139
-224
-96
-158
-219
-112
-360
-138
-123
-303
-58
-209
-309
-91
-276
-5
-352
-66
-301
-379
-222
-88
-110
-374
-266
-334
-382
-189
-106
-260
-322
-269
-75
-117
-36
-412
-62
-285
-291
-188
-17
-158
-415
-285
-235
-223
-208
-30
-273
-276
-239
-93
0
-250
-251
-421
-368
-253
-253
-419
-364
-343
-188
-352
-147
-401
-55
-449
-171
-382
-36
-250
-306
-72
-278
-229
-69
-145
-16
-455
-474
-211
-183
-265
-306
-425
-354
-6
-256
-397
-252
-409
-126
-383
-325
-409
-431
0
-306
-52
-219
-172
-346
-444
-84
-56
-402
-112
-62
-172
-358
-329
-221
-371
-174
-388
-9
-168
-56
-109
-511
-161
-282
-344
-437
-292
-423
-308
-478
-175
-169
-468
-54
-439
-231
-357
-500
-414
-101
-53
-71
-192
-166
-517
-296
-249
-153
-9
-252
-130
-307
-240
-312
-242
-377
-48
-57
-6
-96
0
-124
-463
-68
-309
-487
-448
-172
-553
-165
-399
-223
-45
-190
-552
-209
-238
-458
-199
-154
-212
-53
-347
-316
-419
-363
-407
-435
-150
-203
-525
-159
-214
-216
-9
-302
-1
-158
-309
-33
-168
-539
-461
-171
-274
-68
-126
-372
-316
-160
-212
-261
-570
-386
-49
-494
-428
-458
-410
-419
-380
-25
-26
-36
-328
-303
-412
-169
-140
-359
-112
-198
-517
-180
-459
-550
-529
-413
-219
-223
-518
-584
-253
-552
-287
-280
-129
-187
-531
-583
-48
-222
-598
-590
-399
-488
-457
-290
-259
-624
-504
-336
-594
-435
-328
-656
-413
-195
-33
-574
-289
-60
-180
-640
-517
-26
-359
-157
-81
-503
-530
-21
-274
-84
-619
-68
-568
-483
-229
-499
-516
-406
-511
-290
-125
-90
-486
-655
-342
-347
-311
-121
-83
-53
-404
-486
-491
-155
-208
-90
-394
-379
-451
-375
-404
2
-70
-688
-516
-654
-453
-481
-111
-144
-606
-321
-113
-513
-457
-337
-638
-5
-72
-496
-136
-59
-528
-337
-445
-295
-488
-227
-226
-115
-120
-121
-103
-320
-203
-700
-257
-385
-76
-334
-254
-395
-673
-118
-202
-178
-415
-347
-491
-266
-310
-102
-266
-48
-319
-56
-433
-185
-15
-766
-694
-714
-720
-707
-491
-541
-69
-27
-21
-726
-578
-287
-544
-432
-351
-155
-614
-220
-417
-206
-496
-496
-487
-245
-634
-95
-705
-273
-342
-425
-488
-97
-710
-324
-464
-169
-298
-52
-288
-353
-71
-41
-226
-795
-46
-224
-712
-301
-559
-371
-122
-547
-446
-580
-583
-164
-812
-234
-383
-93
-112
-541
-183
-199
-171
-826
-665
-86
-300
-314
-382
-586
-471
-838
-25
-359
-352
-205
-418
-621
-387
-582
-563
-520
-649
-476
-202
-509
-121
-545
-479
-307
-614
-476
-552
-134
-198
-198
-482
-745
-680
-443
-362
-39
-353
-829
-727
-563
-66
-306
-224
-145
-182
-820
-102
-25
-307
-203
-469
-438
-74
-211
-394
-723
-406
-671
-356
-726
-792
-288
-23
-398
-459
-221
-133
-269
-661
-531
-502
-737
-666
-359
-375
-834
-629
-767
-882
-358
-865
-875
-740
-816
-661
-378
-354
-596
-729
-764
-262
-802
-374
-293
-661
-435
-168
-928
-301
-823
-470
-519
-692
-589
-939
-855
-699
-585
-632
-831
-575
-357
-871
-844
-667
-366
-772
-766
-594
-660
-302
-894
-124
-518
-216
-498
-287
-6
-334
-892
-391
-419
-236
-508
-758
-823
-824
-701
-766
-317
-186
-375
-421
-246
-362
-4
-678
-202
-506
-801
-665
-689
-547
-831
-391
-174
-475
-587
-747
-870
-164
-975
-336
-564
-248
-340
-242
-641
-510
-827
-634
-973
-196
-83
-798
-393
-414
-617
-919
-21
-129
-831
-502
-139
-858
-967
-1020
-19
-622
-878
-63
-799
-171
-277
-395
-166
-793
-745
-752
-228
-287
-997
-720
-864
-10
-578
-479
-488
-265
-1032
-909
-157
-633
-773
-1009
-61
-988
-896
-995
-792
-647
-305
-294""".split("\n")
       .filter { it.toIntOrNull() != null }
       .map { it.toInt() }
       .toMutableList()