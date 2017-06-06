/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  campitos
 * Created: May 30, 2017
 */

create table direccion(id integer primary key auto_increment, 
numero integer, calle varchar(40), cp integer,  municipio varchar(40));
drop table direccion;

select * from direccion;