/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$("#guardarDireccion").click(function(){

 $.post('direccion/12/12/12/12', function(datos){
     console.log(datos.id)
 });
});