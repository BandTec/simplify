import { Component, ElementRef, OnInit, Renderer2 } from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  toggleMenu:Boolean = false
    
  constructor() { }
  
  ngOnInit(): void {
  }

  showMenu() {
    return this.toggleMenu = !this.toggleMenu;
    
  }
  
}
