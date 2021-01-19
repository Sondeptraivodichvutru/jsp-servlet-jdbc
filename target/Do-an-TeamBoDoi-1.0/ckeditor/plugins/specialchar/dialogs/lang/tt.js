﻿/*
 Copyright (c) 2003-2019, CKSource - Frederico Knabben. All rights reserved.
 For licensing, see LICENSE.md or https://ckeditor.com/legal/ckeditor-oss-license
 */
        CKEDITOR.plugins.setLang("specialchar", "tt", {euro:"Евро тамга�?ы", lsquo:"Сул бер иңле куштырнаклар", rsquo:"Уң бер иңле куштырнаклар", ldquo:"Сул ике иңле куштырнаклар", rdquo:"Уң ике иңле куштырнаклар", ndash:"Кы�?ка �?ызык", mdash:"Озын �?ызык", iexcl:"Әйләндерелгән өндәү билге�?е", cent:"Цент тамга�?ы", pound:"Фунт тамга�?ы", curren:"�?кча берәмлеге тамга�?ы", yen:"Иена тамга�?ы", brvbar:"Broken bar", sect:"Параграф билге�?е", uml:"Диерези�?", copy:"Хокук и�?�?е булу билге�?е", ordf:"Feminine ordinal indicator", laquo:"�?чылучы чыршы�?ыман җә�?",
                not:"Юклык ишарə�?е", reg:"Теркәләнгән булу билге�?е", macr:"Макрон", deg:"Граду�? билге�?е", sup2:"Икенче ө�?ке индек�?", sup3:"Өченче ө�?ке индек�?", acute:"Ба�?ым билге�?е", micro:"Микро билге�?е", para:"Параграф билге�?е", middot:"Уртадагы нокта", cedil:"Седиль", sup1:"Беренче ө�?ке индек�?", ordm:"Masculine ordinal indicator", raquo:"Ябылучы чыршы�?ыман җә�?", frac14:"Гади дүрттән бер билге�?е", frac12:"Гади икедән бер билге�?е", frac34:"Гади дүрттән өч билге�?е", iquest:"Әйләндерелгән өндәү билге�?е", Agrave:"Грави�? белән латин A баш хәрефе",
                Aacute:"Ба�?ым билге�?е белән латин A баш хәрефе", Acirc:"Циркумфлек�? белән латин A баш хәрефе", Atilde:"Тильда белән латин A баш хәрефе", Auml:"Диерези�? белән латин A баш хәрефе", Aring:"Ө�?тендә боҗра булган латин A баш хәрефе", AElig:"Латин Æ баш хәрефе", Ccedil:"Седиль белән латин C баш хәрефе", Egrave:"Грави�? белән латин E баш хәрефе", Eacute:"Ба�?ым билге�?е белән латин E баш хәрефе", Ecirc:"Циркумфлек�? белән латин E баш хәрефе", Euml:"Диерези�? белән латин E баш хәрефе", Igrave:"Грави�? белән латин I баш хәрефе",
                Iacute:"Ба�?ым билге�?е белән латин I баш хәрефе", Icirc:"Циркумфлек�? белән латин I баш хәрефе", Iuml:"Диерези�? белән латин I баш хәрефе", ETH:"Латин Eth баш хәрефе", Ntilde:"Тильда белән латин N баш хәрефе", Ograve:"Грави�? белән латин O баш хәрефе", Oacute:"Ба�?ым билге�?е белән латин O баш хәрефе", Ocirc:"Циркумфлек�? белән латин O баш хәрефе", Otilde:"Тильда белән латин O баш хәрефе", Ouml:"Диерези�? белән латин O баш хәрефе", times:"Тапкырлау билге�?е", Oslash:"Сызык белән латин O баш хәрефе", Ugrave:"Грави�? белән латин U баш хәрефе",
                Uacute:"Ба�?ым билге�?е белән латин U баш хәрефе", Ucirc:"Циркумфлек�? белән латин U баш хәрефе", Uuml:"Диерези�? белән латин U баш хәрефе", Yacute:"Ба�?ым билге�?е белән латин Y баш хәрефе", THORN:"Латин Thorn баш хәрефе", szlig:"Латин beta юл хәрефе", agrave:"Грави�? белән латин a юл хәрефе", aacute:"Ба�?ым билге�?е белән латин a юл хәрефе", acirc:"Циркумфлек�? белән латин a юл хәрефе", atilde:"Тильда белән латин a юл хәрефе", auml:"Диерези�? белән латин a юл хәрефе", aring:"Ө�?тендә боҗра булган латин a юл хәрефе", aelig:"Латин æ юл хәрефе",
                ccedil:"Седиль белән латин c юл хәрефе", egrave:"Грави�? белән латин e юл хәрефе", eacute:"Ба�?ым билге�?е белән латин e юл хәрефе", ecirc:"Циркумфлек�? белән латин e юл хәрефе", euml:"Диерези�? белән латин e юл хәрефе", igrave:"Грави�? белән латин i юл хәрефе", iacute:"Ба�?ым билге�?е белән латин i юл хәрефе", icirc:"Циркумфлек�? белән латин i юл хәрефе", iuml:"Диерези�? белән латин i юл хәрефе", eth:"Латин eth юл хәрефе", ntilde:"Тильда белән латин n юл хәрефе", ograve:"Грави�? белән латин o юл хәрефе", oacute:"Ба�?ым билге�?е белән латин o юл хәрефе",
                ocirc:"Циркумфлек�? белән латин o юл хәрефе", otilde:"Тильда белән латин o юл хәрефе", ouml:"Диерези�? белән латин o юл хәрефе", divide:"Бүлү билге�?е", oslash:"Сызык белән латин o юл хәрефе", ugrave:"Грави�? белән латин u юл хәрефе", uacute:"Ба�?ым билге�?е белән латин u юл хәрефе", ucirc:"Циркумфлек�? белән латин u юл хәрефе", uuml:"Диерези�? белән латин u юл хәрефе", yacute:"Ба�?ым билге�?е белән латин y юл хәрефе", thorn:"Латин thorn юл хәрефе", yuml:"Диерези�? белән латин y юл хәрефе", OElig:"Латин лигатура OE баш хәрефе",
                oelig:"Латин лигатура oe юл хәрефе", 372:"Циркумфлек�? белән латин W баш хәрефе", 374:"Циркумфлек�? белән латин Y баш хәрефе", 373:"Циркумфлек�? белән латин w юл хәрефе", 375:"Циркумфлек�? белән латин y юл хәрефе", sbquo:"Single low-9 quotation mark", 8219:"Single high-reversed-9 quotation mark", bdquo:"Double low-9 quotation mark", hellip:"Ятма �?ллип�?", trade:"Сәүдә марка�?ы билге�?е", 9658:"Black right-pointing pointer", bull:"Маркер", rarr:"Уң �?кка ук", rArr:"Уң �?кка икеләтә ук", hArr:"Ике �?кка икеләтә ук", diams:"Black diamond suit",
                asymp:"�?кынча"});