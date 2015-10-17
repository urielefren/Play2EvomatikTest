$ ->
    $.get "/persons", (personas) ->
        $.each personas, (index, persona) ->
            $('#persons').append $("<li>").text "Nombre:"+persona.nombre + ' Edad:' +persona.edad + ' RFC:' + persona.rfc