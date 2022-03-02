Feature: Launch IQZ Cloud - Pega - Sales Automation Portal
  
Scenario: Login to the application
    Given User launches Chrome browser
    When User opens the URL "https://pega-86-demo.iqzsystems.io/prweb/app/iqzsa_/aDksxW2FqLyskV_TGzmXXSRT2XjlmHkP*/!STANDARD?pyActivity=%40baseclass.pzProcessURLInWindow&pyPreActivity=Embed-PortalLayout.RedirectAndRun&ThreadName=OpenPortal_SAPortal&Location=pyActivity%3DData-Portal.ShowSelectedPortal%26portal%3DSAPortal%26Name%3D%20SAPortal%26pzSkinName%3D%26developer%3Dfalse%26ThreadName%3DOpenPortal_SAPortal%26launchPortal%3Dtrue&bPurgeTargetThread=true&target=popup&portalThreadName=STANDARD&portalName=Developer&pzHarnessID=HID5ADC9D482B3E6FF1C1A0D5D364DBED0A"
    And User enters the user name "tcapron"
    And User enters the password "install@1234"
    And User clicks on Log in
    Then User can see the landing page