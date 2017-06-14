/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Vamos  hacer el request a nuestro servicio usando ajax con jquery

$("#guardarDireccion").click(function(){
            //Aplicamos el metodo post usando la uri del servicio
            var numero=$("#numero").val();
            var calle=$("#calle").val();
            var cp=$("#cp").val();
            var municipio=$("#municipio").val();
            
          $.post("direccion/"+numero+'/'+calle+'/'+cp+'/'+municipio,function(json){
              console.log(json.id);
               })  ;
            
           }
        );


$("#buscarPorId").click(function(){
            //Aplicamos el metodo post usando la uri del servicio
            var id=$("#id").val();
      
            
          $.get("direccion/"+id,function(json){
              console.log(json.municipio);
              $("#numero2").val(json.numero);
              $("#calle2").val(json.calle);
              $("#cp2").val(json.cp);
              $("#municipio2").val(json.municipio);
               })  ;
            
           }
        );