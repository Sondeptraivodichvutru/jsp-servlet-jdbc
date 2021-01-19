﻿/*
 Copyright (c) 2003-2019, CKSource - Frederico Knabben. All rights reserved.
 For licensing, see LICENSE.md or https://ckeditor.com/legal/ckeditor-oss-license
 */
        CKEDITOR.plugins.setLang("specialchar", "uk", {euro:"Знак євро", lsquo:"Ліві одинарні лапки", rsquo:"Праві одинарні лапки", ldquo:"Ліві подвійні лапки", rdquo:"Праві подвійні лапки", ndash:"Середнє тире", mdash:"Довге тире", iexcl:"Перевернутий знак оклику", cent:"Знак цента", pound:"Знак фунта", curren:"Знак валюти", yen:"Знак єни", brvbar:"Переривча�?та вертикальна ліні�?", sect:"Знак параграфу", uml:"Умлаут", copy:"Знак автор�?ьких прав", ordf:"Жіночий пор�?дковий вказівник", laquo:"ліві вказівні подвійні кутові дужки",
                not:"Запереченн�?", reg:"Знак охорони �?уміжних прав", macr:"Макрон", deg:"Знак граду�?а", sup2:"два у верхньому індек�?і", sup3:"три у верхньому індек�?і", acute:"Знак акута", micro:"Знак мікро", para:"Знак абзацу", middot:"Інтерпункт", cedil:"Седиль", sup1:"Один у верхньому індек�?і", ordm:"Чоловічий пор�?дковий вказівник", raquo:"праві вказівні подвійні кутові дужки", frac14:"Одна четвертина", frac12:"Одна друга", frac34:"три четвертих", iquest:"Перевернутий знак питанн�?", Agrave:"Велика латин�?ька A з граві�?ом", Aacute:"Велика латин�?ька �? з акутом",
                Acirc:"Велика латин�?ька �? з циркумфлек�?ом", Atilde:"Велика латин�?ька �? з тильдою", Auml:"Велике латин�?ьке �? з умлаутом", Aring:"Велика латин�?ька A з кільцем згори", AElig:"Велика латин�?ька Æ", Ccedil:"Велика латин�?ька C з �?едиллю", Egrave:"Велика латин�?ька E з граві�?ом", Eacute:"Велика латин�?ька E з акутом", Ecirc:"Велика латин�?ька E з циркумфлек�?ом", Euml:"Велика латин�?ька �? з умлаутом", Igrave:"Велика латин�?ька I з граві�?ом", Iacute:"Велика латин�?ька I з акутом", Icirc:"Велика латин�?ька I з циркумфлек�?ом",
                Iuml:"Велика латин�?ька І з умлаутом", ETH:"Велика латин�?ька Eth", Ntilde:"Велика латин�?ька N з тильдою", Ograve:"Велика латин�?ька O з граві�?ом", Oacute:"Велика латин�?ька O з акутом", Ocirc:"Велика латин�?ька O з циркумфлек�?ом", Otilde:"Велика латин�?ька O з тильдою", Ouml:"Велика латин�?ька О з умлаутом", times:"Знак множенн�?", Oslash:"Велика латин�?ька перекре�?лена O ", Ugrave:"Велика латин�?ька U з граві�?ом", Uacute:"Велика латин�?ька U з акутом", Ucirc:"Велика латин�?ька U з циркумфлек�?ом", Uuml:"Велика латин�?ька U з умлаутом",
                Yacute:"Велика латин�?ька Y з акутом", THORN:"Велика латин�?ька Торн", szlig:"Мала латин�?ька е�?цет", agrave:"Мала латин�?ька a з граві�?ом", aacute:"Мала латин�?ька a з акутом", acirc:"Мала латин�?ька a з циркумфлек�?ом", atilde:"Мала латин�?ька a з тильдою", auml:"Мала латин�?ька a з умлаутом", aring:"Мала латин�?ька a з кільцем згори", aelig:"Мала латин�?ька æ", ccedil:"Мала латин�?ька C з �?едиллю", egrave:"Мала латин�?ька e з граві�?ом", eacute:"Мала латин�?ька e з акутом", ecirc:"Мала латин�?ька e з циркумфлек�?ом", euml:"Мала латин�?ька e з умлаутом",
                igrave:"Мала латин�?ька i з граві�?ом", iacute:"Мала латин�?ька i з акутом", icirc:"Мала латин�?ька i з циркумфлек�?ом", iuml:"Мала латин�?ька i з умлаутом", eth:"Мала латин�?ька Eth", ntilde:"Мала латин�?ька n з тильдою", ograve:"Мала латин�?ька o з граві�?ом", oacute:"Мала латин�?ька o з акутом", ocirc:"Мала латин�?ька o з циркумфлек�?ом", otilde:"Мала латин�?ька o з тильдою", ouml:"Мала латин�?ька o з умлаутом", divide:"Знак діленн�?", oslash:"Мала латин�?ька перекре�?лена o", ugrave:"Мала латин�?ька u з граві�?ом", uacute:"Мала латин�?ька u з акутом",
                ucirc:"Мала латин�?ька u з циркумфлек�?ом", uuml:"Мала латин�?ька u з умлаутом", yacute:"Мала латин�?ька y з акутом", thorn:"Мала латин�?ька торн", yuml:"Мала латин�?ька y з умлаутом", OElig:"Велика латин�?ька лігатура OE", oelig:"Мала латин�?ька лігатура oe", 372:"Велика латин�?ька W з циркумфлек�?ом", 374:"Велика латин�?ька Y з циркумфлек�?ом", 373:"Мала латин�?ька w з циркумфлек�?ом", 375:"Мала латин�?ька y з циркумфлек�?ом", sbquo:"Одиничні нижні лабки", 8219:"Верхні одиничні обернені лабки", bdquo:"Подвійні нижні лабки",
                hellip:"Три крапки", trade:"Знак торгової марки", 9658:"Чорний правий вказівник", bull:"Маркер �?пи�?ку", rarr:"Стрілка вправо", rArr:"Подвійна �?трілка вправо", hArr:"Подвійна �?трілка вліво-вправо", diams:"Чорний діамонт", asymp:"�?аближено дорівнює"});