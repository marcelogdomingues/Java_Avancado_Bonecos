/*==================================================================
        [ Restricoes ]*/

//Cartão de Cidadão - Aceita apenas Números


$(".nCC").on("keypress keyup blur",function (event) {    
    $(this).val($(this).val().replace(/[^\d].+/, ""));
     if ((event.which < 48 || event.which > 57 )) { /* FUNCIONAMENTO JQUERY: 
        Para eventos de teclado ou rato, essa propriedade indica a tecla ou botão específico que foi pressionado. */ 
      //  $("#errmsg").html("Apenas é permitido Números!").show().fadeOut("slow");
        return false;
        }

 });

 // Primeiro Nome - Aceita Apenas Letras

 $('.txtFirstName').keydown(function (e) {
  if (e.ctrlKey || e.altKey) {
    e.preventDefault();
  } else {
      var key = e.keyCode;
      if (!((key == 8) || (key == 32) || (key == 46) || (key >= 35 && key <= 40) || (key >= 65 && key <= 90))) {
          e.preventDefault();
        //  $("#errmsg2").html("Apenas é permitido Letras!").show().fadeOut("slow");
      return false;
      }
  }
});

 // Ultimo Nome - Aceita Apenas Letras

 $('.txtLastName').keydown(function (e) {
  if (e.ctrlKey || e.altKey) {
    e.preventDefault();
  } else {
      var key = e.keyCode;
      if (!((key == 8) || (key == 32) || (key == 46) || (key >= 35 && key <= 40) || (key >= 65 && key <= 90))) {
          e.preventDefault();
        //  $("#errmsg2").html("Apenas é permitido Letras!").show().fadeOut("slow");
      return false;
      }
  }
});

// Primeiro Nome - Primeira Letra Grande

$(".txtFirstName").keypress(function () {
  var _val = $(".txtFirstName").val();
  var _txt = _val.charAt(0).toUpperCase() + _val.slice(1);
  $(".txtFirstName").val(_txt);
})

// Ultimo Nome - Primeira Letra Grande

$(".txtLastName").keypress(function () {
  var _val = $(".txtLastName").val();
  var _txt = _val.charAt(0).toUpperCase() + _val.slice(1);
  $(".txtLastName").val(_txt);
})

/*==================================================================
        [ Fields Incompletos ]*/

        var aniversario = document.getElementById(".birthday").value;
        console.log(aniversario);