<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/typing-style.css">
<script type="text/javascript" src="typing.js"></script>
</head>
<body>
	<div class="container">
        <div class="typing-area">
            <div id="parent-text-display" style="overflow-x: hidden; overflow-y: scroll; height: 260px;" readonly>
                <!-- 텍스트가 표시될 공간 -->
                <pre id="text-display"></pre>
            </div>
        </div>
        <!-- Python에서 전달받은 원본 텍스트를 숨겨서 저장 -->
        <div id="original-text" style="display: none;">{{ practice_content }}</div>

        <!-- 커스텀 메시지 박스 -->
        <div id="messageBox" class="message-box">
            <p id="messageContent" class="text-gray-800 text-lg mb-4"></p>
            <button onclick="document.getElementById('messageBox').style.display='none'">확인</button>
        </div>

        <div class="wrap_dropdown">
            <p>프로그래밍 언어</p>
            <select name="language" id="language">
                <option value="HTML" id="option1">HTML</option>
                <option value="CSS" id="option2">CSS</option>
                <option value="Javascript" id="option3">Javascript</option>
                <option value="Jquery" id="option4">Jquery</option>
                <option value="Python" id="option5">Python</option>
                <option value="Java" id="option6" selected>Java</option>
            </select>
        </div>



        <div class="keyboard">
            <div class="keyboard-row">
                <div class="key" id="key-Backquote" data-special-symbol="~" data-original="`">`</div>
                <div class="key" id="key-Digit1" data-special-symbol="!" data-original="1">1</div>
                <div class="key" id="key-Digit2" data-special-symbol="@" data-original="2">2</div>
                <div class="key" id="key-Digit3" data-special-symbol="#" data-original="3">3</div>
                <div class="key" id="key-Digit4" data-special-symbol="$" data-original="4">4</div>
                <div class="key" id="key-Digit5" data-special-symbol="%" data-original="5">5</div>
                <div class="key" id="key-Digit6" data-special-symbol="^" data-original="6">6</div>
                <div class="key" id="key-Digit7" data-special-symbol="&" data-original="7">7</div>
                <div class="key" id="key-Digit8" data-special-symbol="*" data-original="8">8</div>
                <div class="key" id="key-Digit9" data-special-symbol="(" data-original="9">9</div>
                <div class="key" id="key-Digit0" data-special-symbol=")" data-original="0">0</div>
                <div class="key" id="key-Minus" data-special-symbol="_" data-original="-">-</div>
                <div class="key" id="key-Equal" data-special-symbol="+" data-original="=">=</div>
                <div class="key backspace" id="key-Backspace">←</div>
            </div>

            <div class="keyboard-row">
                <div class="key tab" id="key-Tab">Tab</div>
                <div class="key kor" id="key-KeyQ" data-shift="Q" data-original="q" data-kor="ㅂ" data-kor-hard="ㅃ">q
                </div>
                <div class="key kor" id="key-KeyW" data-shift="W" data-original="w" data-kor="ㅈ" data-kor-hard="ㅉ">w
                </div>
                <div class="key kor" id="key-KeyE" data-shift="E" data-original="e" data-kor="ㄷ" data-kor-hard="ㄸ">e
                </div>
                <div class="key kor" id="key-KeyR" data-shift="R" data-original="r" data-kor="ㄱ" data-kor-hard="ㄲ">r
                </div>
                <div class="key kor" id="key-KeyT" data-shift="T" data-original="t" data-kor="ㅅ" data-kor-hard="ㅆ">t
                </div>
                <div class="key kor" id="key-KeyY" data-shift="Y" data-original="y" data-kor="ㅛ">y</div>
                <div class="key kor" id="key-KeyU" data-shift="U" data-original="u" data-kor="ㅕ">u</div>
                <div class="key kor" id="key-KeyI" data-shift="I" data-original="i" data-kor="ㅑ">i</div>
                <div class="key kor" id="key-KeyO" data-shift="O" data-original="o" data-kor="ㅐ" data-kor-hard="ㅒ">o
                </div>
                <div class="key kor" id="key-KeyP" data-shift="P" data-original="p" data-kor="ㅔ" data-kor-hard="ㅖ">p
                </div>
                <div class="key" id="key-BracketLeft" data-special-symbol="{" data-original="[">[</div>
                <div class="key" id="key-BracketRight" data-special-symbol="}" data-original="]">]</div>
                <div class="key backslash" id="key-Backslash" data-special-symbol="|" data-original="\">\</div>
            </div>

            <div class="keyboard-row">
                <div class="key caps" id="key-CapsLock">Caps Lock</div>
                <div class="key kor" id="key-KeyA" data-shift="A" data-original="a" data-kor="ㅁ">a</div>
                <div class="key kor" id="key-KeyS" data-shift="S" data-original="s" data-kor="ㄴ">s</div>
                <div class="key kor" id="key-KeyD" data-shift="D" data-original="d" data-kor="ㅇ">d</div>
                <div class="key kor" id="key-KeyF" data-shift="F" data-original="f" data-kor="ㄹ">f</div>
                <div class="key kor" id="key-KeyG" data-shift="G" data-original="g" data-kor="ㅎ">g</div>
                <div class="key kor" id="key-KeyH" data-shift="H" data-original="h" data-kor="ㅗ">h</div>
                <div class="key kor" id="key-KeyJ" data-shift="J" data-original="j" data-kor="ㅓ">j</div>
                <div class="key kor" id="key-KeyK" data-shift="K" data-original="k" data-kor="ㅏ">k</div>
                <div class="key kor" id="key-KeyL" data-shift="L" data-original="l" data-kor="ㅣ">l</div>
                <div class="key" id="key-Semicolon" data-special-symbol=":" data-original=";">;</div>
                <div class="key" id="key-Quote" data-special-symbol='"' data-original="'">'</div>
                <div class="key enter" id="key-Enter">Enter</div>
            </div>

            <div class="keyboard-row">
                <div class="key shift" id="key-ShiftLeft">Shift</div>
                <div class="key kor" id="key-KeyZ" data-shift="Z" data-original="z" data-kor="ㅋ">z</div>
                <div class="key kor" id="key-KeyX" data-shift="X" data-original="x" data-kor="ㅌ">x</div>
                <div class="key kor" id="key-KeyC" data-shift="C" data-original="c" data-kor="ㅊ">c</div>
                <div class="key kor" id="key-KeyV" data-shift="V" data-original="v" data-kor="ㅍ">v</div>
                <div class="key kor" id="key-KeyB" data-shift="B" data-original="b" data-kor="ㅠ">b</div>
                <div class="key kor" id="key-KeyN" data-shift="N" data-original="n" data-kor="ㅜ">n</div>
                <div class="key kor" id="key-KeyM" data-shift="M" data-original="m" data-kor="ㅡ">m</div>
                <div class="key" id="key-Comma" data-special-symbol="&lt;" data-original=",">,</div>
                <div class="key" id="key-Period" data-special-symbol=">" data-original=".">.</div>
                <div class="key" id="key-Slash" data-special-symbol="?" data-original="/">/</div>
                <div class="key shift" id="key-ShiftRight">Shift</div>
            </div>

            <div class="keyboard-row">
                <div class="key ctrl" id="key-ControlLeft">Ctrl</div>
                <div class="key win" id="key-MetaLeft">Win</div>
                <div class="key alt" id="key-AltLeft">Alt</div>
                <div class="key space" id="key-Space"> </div>
                <div class="key hangul-eng" id="key-HangulMode" data-original="한/영">한/영</div>
                <!-- Changed ID to match event.key 'HangulMode' directly -->

                <!-- <div class="key alt" id="key-AltRight">Alt</div>
                    <div class="key win" id="key-MetaRight">Win</div>
                    <div class="key menu" id="key-ContextMenu">Menu</div>
                    <div class="key ctrl" id="key-ControlRight">Ctrl</div> -->
            </div>
        </div>
    </div>
</body>
</html>