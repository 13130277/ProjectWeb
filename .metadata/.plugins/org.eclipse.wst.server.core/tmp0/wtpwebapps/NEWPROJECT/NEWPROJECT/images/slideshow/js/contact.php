<?php include '../../../js/utils.php'; ?>
sts_bs("jwscroller2dbd",[20080623,"images/","","blank.gif",0,1,1,2,"670px","center",1,3,145,100,0,0,0,0,0,2000,1,24,0,"stEffect(\"scroll(Rate=24,enabled=0,Duration=0.50)\")",-2,60],["none",1,"#454545","#FFFFFF","","repeat"]);
sts_tbd([1],["solid",1,"#454545",5,"round_tl.gif","round_tr.gif","round_br.gif","round_bl.gif","transparent","round_t.gif","repeat","transparent","round_r.gif","repeat","transparent","round_b.gif","repeat","transparent","round_l.gif","repeat"]);
  <?php $contact = selectDB2("select * from picture where id_position = 1 and hide = 1 order by id_picture desc limit 0,5 ");
            if(count($contact) > 0 ){
                for($i=0;$i<count($contact);$i++){
                    $contact_detail = $contact[$i];
          ?>
sts_ai("i0",[0,"","<?php echo $contact_detail['link'] ?> ","_self","<?php echo getPath("upload/".$contact_detail['url_picture']) ?> ",120,80,"center"],["transparent","9pt Verdana,Arial","#000000","none","9pt Verdana,Arial","#000000","none"]);


       <? } } ?>

sts_es();
