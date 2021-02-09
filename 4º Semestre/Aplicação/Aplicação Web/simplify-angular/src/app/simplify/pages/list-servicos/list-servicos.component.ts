import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-list-servicos',
  templateUrl: './list-servicos.component.html',
  styleUrls: ['./list-servicos.component.css']
})
export class ListServicosComponent implements OnInit {

  public servicos: any = []

  select: string;

  constructor() { }

  ngOnInit(): void {
    console.log(this.servicos)
  }

  search() {
    if (this.select == "documento") {
      this.servicos = ["Certidão de nascimento", "Segunda via RG", "Registrar Firma", "Certidão de casamento", "Certidão de obito"]
    } else {
      alert("Selecione uma opção valida")
    }
  }

}
